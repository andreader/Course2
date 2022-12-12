package pro.sky.javacore.incapsulation.hw3.transport;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String gearBox;
    private final String bodyType;
    private String regNumber;
    private final int seatsAmount;
    private boolean tiresIsSummer;

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public String printKeylessAccess() {
            if (isRemoteEngineStart() == true) {
                return "Key with remote engine start, ";
            } else return "Key without remote engine start ";
        }

        public String printRemoteEngineStart() {
            if (isKeylessAccess() == true) {
                return " and with keyless access. ";
            } else return " and without keyless access. ";
        }

        @Override
        public String toString() {
            return printKeylessAccess() + printRemoteEngineStart();
        }
    }

    private Key key;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            this.key = new Car.Key(false, false);
        } else this.key = key;
    }


    public static class Insurance {
        private final LocalDate expireDate;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDate, double cost, String number) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else this.expireDate = expireDate;
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            }else this.number = number;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now()) || expireDate.isEqual(LocalDate.now())) {
                System.out.println("You should purchase new insurance right now!");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Incorrect insurance number!");
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }
    }


    public Car(String brand, String model, double engineVolume, String color, int year, String country,
               String gearBox, String bodyType, String regNumber, int seatsAmount, boolean tiresIsSummer, Key key) {
        setKey(key);
        if (checkString(brand) == true) {
            this.brand = "default brand";
        } else this.brand = brand;
        if (checkString(model) == true) {
            this.model = "default model";
        } else this.model = model;
        setEngineVolume(engineVolume);
        setColor(color);
        if (year < 1900 || year > LocalDate.now().getYear()) {
            this.year = 2000;
        } else this.year = year;

        if (checkString(country) == true) {
            this.country = "default country";
        } else this.country = country;
        setGearBox(gearBox);
        if (checkString(bodyType) == true) {
            this.bodyType = "default bodyType";
        } else this.bodyType = bodyType;
        setRegNumber(regNumber);
        if (seatsAmount < 1 || seatsAmount > 15) {
            this.seatsAmount = 5;
        } else this.seatsAmount = seatsAmount;
        setTiresIsSummer(tiresIsSummer);
    }


    public String changeTiresByMonth(int month) {
        if (month <= 0 || month > 12) {
            month = 1;
        }
        if (month >= 3 || month <= 11) {
            setTiresIsSummer(true);
        } else setTiresIsSummer(false);
        if (isTiresIsSummer() == true) {
            return "Summer";
        } else return "Winter";
    }

    public boolean checkRegNumber(String regNumber) {
        boolean checkRegNumber = true;
        if (regNumber.length() != 0 || regNumber.length() < 9) {
            checkRegNumber = true;
        } else return checkRegNumber = false;
        for (int i = 1; i <= 3; i++) {
            if (Character.isDigit(regNumber.charAt(i)) == true) {
                continue;
            } else return checkRegNumber = false;
        }
        for (int i = 6; i < regNumber.length(); i++) {
            if (Character.isDigit(regNumber.charAt(i)) == true) {
                continue;
            } else return checkRegNumber = false;
        }
        if (Pattern.matches("[авекмнорстух][0-9]{3}[авекмнорстух]{2}[0-9]{3}", regNumber.toLowerCase())) {
            checkRegNumber = true;
        } else checkRegNumber = false;
        return checkRegNumber;
    }


    public boolean checkString(String variable) {
        if (variable == null || variable.isBlank() || variable.isEmpty())
            return true;
        else return false;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        if (checkString(color)) {
            this.color = "white";
        } else this.color = color;
    }

    public void setGearBox(String gearBox) {
        if (checkString(gearBox)) {
            this.gearBox = "manual";
        } else this.gearBox = gearBox;
    }

    public void setRegNumber(String regNumber) {
        if (checkString(regNumber) == true || checkRegNumber(regNumber) == false) {
            this.regNumber = "should be in format x000xx000";
        } else this.regNumber = regNumber;
    }

    public void setTiresIsSummer(boolean tiresIsSummer) {
        this.tiresIsSummer = tiresIsSummer;
    }

    public boolean isTiresIsSummer() {
        return tiresIsSummer;
    }

    public String printTires() {
        if (isTiresIsSummer() == true) {
            return "summer tires";
        } else return "winter tires";
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getGearBox() {
        return gearBox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", " +
                getYear() + " year, " + "made in " +
                getCountry() + ", " +
                getColor() + " body color, " + "engine volume " +
                getEngineVolume() + " liters, " +
                getGearBox() + " transmission, " +
                getBodyType() + ", registration number " +
                getRegNumber() + ", seats amount " +
                getSeatsAmount() + ", " +
                printTires() + ".";
    }
}

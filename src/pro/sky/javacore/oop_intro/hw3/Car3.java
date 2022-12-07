package pro.sky.javacore.oop_intro.hw3;

public class Car3 {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    Car3(String brand, String model, float engineVolume, String color, int year, String country) {
        if (brand == null || brand == "" || brand == " ")
            this.brand = "default";
        else this.brand = brand;
        if (model == null || model == "" || model == " ")
            this.model = "default";
        else this.model = model;
        if (engineVolume > 0)
            this.engineVolume = engineVolume;
        else this.engineVolume = 1.5F;
        if (color == null || color == "" || color == " ")
            this.color = "white";
        else this.color = color;
        if (year > 0)
            this.year = year;
        else this.year = 2000;
        if (country == null || country == "" || country == " ")
            this.country = "default";
        else this.country = country;
    }

    Car3(String brand, String model, float engineVolume, String color, int year) {
        this(brand, model, engineVolume, color, year, "default");
    }
    Car3(String brand, String model, float engineVolume, String color) {
        this(brand, model, engineVolume, color, 2000, "default");
    }
    Car3(String brand, String model, float engineVolume) {
        this(brand, model, engineVolume, "white", 2000, "default");
    }
    Car3(String brand, String model) {
        this(brand, model, 1.5F, "white", 2000, "default");
    }
    Car3(String brand) {
        this(brand, "default", 1.5F, "white", 2000, "default");
    }
    Car3() {
        this("default", "default", 1.5F, "white", 2000, "default");
    }
        @Override
    public String toString() {
        return this.brand + " " + this.model + ", " +
                this.year + " year, " + "made in " +
                this.country + ", " +
                this.color + " body color, " + "engine volume " +
                this.engineVolume + " liters.";
    }
}

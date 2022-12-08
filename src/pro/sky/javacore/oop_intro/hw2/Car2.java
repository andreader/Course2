package pro.sky.javacore.oop_intro.hw2;

public class Car2 {
    String brand;
    String model;
    float engineVolume;
    String color;
    int year;
    String country;

    @Override
    public String toString() {
        return this.brand + " " + this.model + ", " +
                this.year + " year, " + "made in " +
                this.country + ", " +
                this.color + " body color, " + "engine volume " +
                this.engineVolume + " liters.";
    }

    Car2(String brand, String model, float engineVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }
}

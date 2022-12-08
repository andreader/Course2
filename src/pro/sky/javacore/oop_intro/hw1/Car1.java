package pro.sky.javacore.oop_intro.hw1;

public class Car1 {
    public String brand;
    public String model;
    public float engineVolume;
    public String color;
    public int year;
    public String country;

    public String toString () {
        return this.brand + " " + this.model + ", " +
                this.year + " year, " + "made in " +
                this.country + ", " +
                this.color + " body color, " + "engine volume " +
                this.engineVolume + ".";
    }

}

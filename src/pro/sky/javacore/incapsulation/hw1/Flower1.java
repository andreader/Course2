package pro.sky.javacore.incapsulation.hw1;

public class Flower1 {
    private final String flowerName;
    private final String country;
    private final double cost;
    private int lifeSpan;


    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }


    public Flower1(String flowerName, String country, double cost, int lifeSpan) {
        if (flowerName == null || flowerName.isEmpty() || flowerName.isBlank())
            this.flowerName = "there's no a flower name";
        else this.flowerName = flowerName;

        if (country == null || country.isEmpty() || country.isBlank())
            this.country = "Russia";
        else this.country = country;

        if (cost <= 0)
            this.cost = 1;
        else this.cost = cost;

        if (lifeSpan <= 0)
            this.lifeSpan = 3;
        else this.lifeSpan = lifeSpan;
    }

    public Flower1(String flowerName, String country, double cost) {
        this (flowerName, country, cost, 3);
    }

    public Flower1(String flowerName, String country) {
        this (flowerName, country, 1, 3);
    }

    public Flower1(String flowerName) {
        this (flowerName, "Russia", 1, 3);
    }

    @Override
    public String toString() {
        return getFlowerName() + " from " + getCountry() + ", cost = " + String.format("%.2f", getCost()) +
                " rub., life span = " + getLifeSpan() + " day(s).";
    }
}

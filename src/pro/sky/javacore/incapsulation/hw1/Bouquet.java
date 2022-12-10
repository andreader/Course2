package pro.sky.javacore.incapsulation.hw1;

public class Bouquet {
    private Flower1[] flowers;

    public Bouquet(Flower1[] flowers) {
        this.flowers = flowers;
    }

    public Flower1[] getFlowers() {
        return flowers;
    }

    public double getCostBouquet(Flower1[] flowers) {
        double CostBouquet = 0;
        for (Flower1 flower : flowers) {
            CostBouquet = CostBouquet + flower.getCost();
        }
        return CostBouquet + 0.1 * CostBouquet;
    }

    public int getLifeSpanMin(Flower1[] flowers) {
        int lifeSpanMin = Integer.MAX_VALUE;
        for (Flower1 flower : flowers) {
            if (lifeSpanMin > flower.getLifeSpan()) {
                lifeSpanMin = flower.getLifeSpan();
            }
        }
        return lifeSpanMin;
    }

    public String getFlowerNames(Flower1[] flowers) {
        String flowerNames = flowers [0].getFlowerName();
        for (int i = 1; i < flowers.length; i++)  {
            flowerNames = flowerNames + ", " + flowers [i].getFlowerName();
        }
        return flowerNames;
    }

    @Override
    public String toString() {
        return "The bouquet consists of " + getFlowerNames(getFlowers()) +
                ". The cost of the bouquet is " + String.format("%.2f", getCostBouquet(getFlowers())) +
                " rub. Life span of the bouquet is " + getLifeSpanMin(getFlowers()) + " day(s).";
    }
}

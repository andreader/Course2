package pro.sky.javacore.incapsulation.hw1;

public class Main1 {

    public static void main(String[] args) {

        Human1 maks = new Human1(1993, "Maksim", "New Clarus", "brand manager");
        Human1 anya = new Human1(1982, "Anya", "Paris", "methodologist of educational programs");
        Human1 katya = new Human1(1995, "Katya", "London", "product manager");
        Human1 artyom = new Human1(1991, "Artyom", "New York", "director of business development");
        Human1 nullAll  = new Human1(-1992, null, null, null);
        Human1 emptyAll = new Human1(-1992, "", " ", "");
        Human1 kirill = new Human1(-1992, "Kirill");
        Human1 vera = new Human1(-1992, "Vera", "LA");

        System.out.println(maks);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artyom);
        System.out.println(nullAll);
        System.out.println(emptyAll);
        System.out.println(kirill);
        System.out.println(vera);

        Flower1 rose = new Flower1("Rose ordinary", "Holland", 35.59345, 0);
        Flower1 chrysanthemum = new Flower1("Chrysanthemum", "", 15, 5);
        Flower1 peony = new Flower1("Peony", "England", 69.9, 1);
        Flower1 gypsophila = new Flower1("Gypsophila", "Turkey", 19.5, 10);
        Flower1 whiterose = new Flower1("White rose");
        Flower1[] flowers = {rose, chrysanthemum, peony, gypsophila, whiterose};
        Bouquet bouquet = new Bouquet(flowers);
        System.out.println(bouquet);

        System.out.println(rose);
        System.out.println(chrysanthemum);
        System.out.println(peony);
        System.out.println(gypsophila);
        System.out.println(whiterose);


    }
}

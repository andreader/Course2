package pro.sky.javacore.oop_intro.hw2;

public class Main2 {

    public static void main(String[] args) {
        Human2 maks = new Human2(1993, "Maksim", "New Clarus", "brand manager");
        Human2 anya = new Human2(1982, "Anya", "Paris", "methodologist of educational programs");
        Human2 katya = new Human2(1995, "Katya", "London", "product manager");
        Human2 artyom = new Human2(1991, "Artyom", "New York", "director of business development");

        System.out.println(maks);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artyom);

        Car2 ladaGranta = new Car2("Lada", "Granta", 1.7f, "yellow", 2015, "Russia");
        Car2 audiA8 = new Car2("Audi", "A8 50 L TDI quattro", 3.0f, "black", 2020, "Germany");
        Car2 bmwZ8 = new Car2("BMW", "Z8", 3.0f, "black", 2021, "Germany");
        Car2 kiaSportage4 = new Car2("Kia", "Sportage 4", 2.4f, "red", 2018, "South Korea");
        Car2 hyindaiAvante = new Car2("Hyindai", "Avante", 1.6f, "orange", 2016, "South Korea");

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyindaiAvante);

    }

}

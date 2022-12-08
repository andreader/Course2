package pro.sky.javacore.oop_intro.hw3;

public class Main3 {

    public static void main(String[] args) {
        Car3 ladaGranta = new Car3("Lada", "Granta", 1.7f, "yellow", 2015, "Russia");
        Car3 audiA8 = new Car3("Audi", "A8 50 L TDI quattro", 3.0f, "black", 2020, "Germany");
        Car3 bmwZ8 = new Car3("BMW", "Z8", 3.0f, "black", 2021, "Germany");
        Car3 kiaSportage4 = new Car3("Kia", "Sportage 4", 2.4f, "red", 2018, "South Korea");
        Car3 hyindaiAvante = new Car3("Hyindai", "Avante", 1.6f, "orange", 2016, "South Korea");
        Car3 nullBrand = new Car3(null, "Avante", 1.6f, "orange", 2016, "South Korea");


        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyindaiAvante);
        System.out.println(nullBrand);

        Human3 maks = new Human3(1993, "Maksim", "New Clarus", "brand manager");
        Human3 anya = new Human3(1982, "Anya", "Paris", "methodologist of educational programs");
        Human3 katya = new Human3(1995, "Katya", "London", "product manager");
        Human3 artyom = new Human3(1991, "Artyom", "New York", "director of business development");
        Human3 nullAll  = new Human3(-1992, null, null, null);
        Human3 emptyAll = new Human3(-1992, "", " ", "");
        Human3 kirill = new Human3(-1992, "Kirill");
        Human3 vera = new Human3(-1992, "Vera", "LA");


        System.out.println(maks);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artyom);
        System.out.println(nullAll);
        System.out.println(emptyAll);
        System.out.println(kirill);
        System.out.println(vera);

    }
}

package pro.sky.javacore.oop_intro.hw1;

public class Main1 {

    public static void main(String[] args) {
        Car1 ladaGranta = new Car1();

        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.engineVolume = 1.7f;
        ladaGranta.color = "yellow";
        ladaGranta.year = 2015;
        ladaGranta.country = "Russia";

        Car1 audiA8 = new Car1();

        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.engineVolume = 3.0f;
        audiA8.color = "black";
        audiA8.year = 2020;
        audiA8.country = "Germany";


        Car1 bmwZ8 = new Car1();

        bmwZ8.brand = "BMW";
        bmwZ8.model = "Z8";
        bmwZ8.engineVolume = 3.0f;
        bmwZ8.color = "black";
        bmwZ8.year = 2021;
        bmwZ8.country = "Germany";


        Car1 kiaSportage4 = new Car1();

        kiaSportage4.brand = "Kia";
        kiaSportage4.model = "Kia";
        kiaSportage4.engineVolume = 2.4f;
        kiaSportage4.color = "red";
        kiaSportage4.year = 2018;
        kiaSportage4.country = "South Korea";

        Car1 hyindaiAvante = new Car1();

        hyindaiAvante.brand = "Hyindai";
        hyindaiAvante.model = "Avante";
        hyindaiAvante.engineVolume = 1.6f;
        hyindaiAvante.color = "orange";
        hyindaiAvante.year = 2016;
        hyindaiAvante.country = "South Korea";

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyindaiAvante);

        Human1 maks = new Human1();
        maks.yearOfBirth = 1993;
        maks.name = "Maksim";
        maks.town = "New Clarus";
        maks.jobTitle = "brand manager";

        Human1 anya = new Human1();
        anya.yearOfBirth = 1982;
        anya.name = "Anya";
        anya.town = "Paris";
        anya.jobTitle = "methodologist of educational programs";

        Human1 katya = new Human1();
        katya.yearOfBirth = 1995;
        katya.name = "Katya";
        katya.town = "London";
        katya.jobTitle = "product manager";

        Human1 artyom = new Human1();
        artyom.yearOfBirth = 1991;
        artyom.name = "Artyom";
        artyom.town = "New York";
        artyom.jobTitle = "director of business development";


        System.out.println(maks);
        System.out.println(anya);
        System.out.println(katya);
        System.out.println(artyom);
    }
}

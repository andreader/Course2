package pro.sky.javacore.incapsulation.hw2.transport;

import pro.sky.javacore.oop_intro.hw3.Human3;

public class Main {

    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia", "Automatic", "sedan", "а718уо196", 5, false);
        Car audiA8 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany", "Automatic", "sedan", "м852аа196", 5, false);
        Car bmwZ8 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany", "Manual", "sedan", "у772нт196", 5, true);
        Car kiaSportage4 = new Car("Kia", "Sportage 4", 2.4, "red", 2018, "South Korea", "Manual", "suv", "х739та196", 5, true);
        Car hyindaiAvante = new Car("Hyindai", "Avante", 1.6, "orange", 2016, "South Korea", "Automatic", "sedan", "х406еу196", 5, false);
        Car nullCar = new Car(null, null, 0, null, 2034, null, null, null, null, 0, true);
        ladaGranta.changeTiresByMonth(2);

        System.out.println(ladaGranta);
        System.out.println(audiA8);
        System.out.println(bmwZ8);
        System.out.println(kiaSportage4);
        System.out.println(hyindaiAvante);
        System.out.println(nullCar);

    }
}

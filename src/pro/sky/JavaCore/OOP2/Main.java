package JavaCore.OOP2;

public class Main {
    public static void main(String[] args) {
        Bicycle forward = new Bicycle("Forward");
        Bicycle kama = new Bicycle("Kama");

        Car skoda = new Car("Skoda");
        Car opel = new Car("Opel");

        Truck kamaz = new Truck("Kamaz");
        Truck volvo = new Truck("Volvo");

        TransportService[] transports = {
                forward,
                kama,
                skoda,
                opel,
                kamaz,
                volvo
        };

        ServiceStation serviceStation = new ServiceStation();

        for (TransportService transport : transports) {
            serviceStation.check(transport);
        }
    }
}

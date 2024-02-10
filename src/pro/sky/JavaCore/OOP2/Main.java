package JavaCore.OOP2;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(),
                new Car(),
                new Truck(),
                new Truck(),
                new Bicycle(),
                new Bicycle(),
        };

        ServiceStation station = new ServiceStation();
        station.setModelWheels(vehicles, 0, "car1", 4);
        station.setModelWheels(vehicles, 1, "car2", 4);
        station.setModelWheels(vehicles, 2, "truck1", 6);
        station.setModelWheels(vehicles, 3, "truck2", 8);
        station.setModelWheels(vehicles, 4, "bicycle1", 2);
        station.setModelWheels(vehicles, 5, "bicycle2", 2);

        for (Vehicle vehicle : vehicles) {
            station.check(vehicle);
        }
    }
}
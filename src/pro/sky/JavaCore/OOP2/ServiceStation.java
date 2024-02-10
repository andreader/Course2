package JavaCore.OOP2;

public class ServiceStation {

    public void check(Vehicle vehicle) {
        System.out.println();
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
            int wheelNumber = i + 1;
            System.out.println(" №" + wheelNumber);
        }
        if (vehicle.getWheelsCount() > 2) {
            vehicle.checkEngine();
        }
        if (vehicle.getWheelsCount() > 4) {
            vehicle.checkTrailer();
        }
    }
    public void setModelWheels (Vehicle [] vehicles, int index, String modelName, int wheelsCount) {
        vehicles[index].setWheelsCount(wheelsCount);
        vehicles[index].setModelName(modelName);
    }
}
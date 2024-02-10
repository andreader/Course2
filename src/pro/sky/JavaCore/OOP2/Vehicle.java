package JavaCore.OOP2;

public class Vehicle implements Bicycles, Cars, Trucks{

    private String modelName;
    private int wheelsCount;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void updateTyre() {
        System.out.print("Меняем покрышку");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}

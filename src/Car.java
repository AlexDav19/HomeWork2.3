public class Car extends Bicycle implements Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void doService() {
        System.out.println(getModelName());
        updateTyre();
        checkEngine();
    }
}
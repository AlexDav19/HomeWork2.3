public class Truck extends Car implements Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void doService() {
        System.out.println(getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}
public interface TransportInterface {
    void updateTyre();

    default void checkEngine() {
        System.out.println("Нет возможности проверить двигатель");
    }

    default void checkTrailer() {
        System.out.println("Прицеп отсутствует");
    }
}

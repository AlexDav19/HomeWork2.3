public interface Transport {
    void doService();

    void updateTyre();

    default void checkEngine() {
        System.out.println("Нет возможности проверить двигатель");
    }

    default void checkTrailer() {
        System.out.println("Прицеп отсутствует");
    }
}

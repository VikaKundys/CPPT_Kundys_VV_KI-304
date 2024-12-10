package ki304.Kundys.lab6;

// Програма-драйвер для демонстрації
/**
 * Основний клас для тестування контейнера вагонів.
 */
public class Main {
    public static void main(String[] args) {
        // Створюємо контейнер для вагонів
        WagonContainer<Wagon> wagonContainer = new WagonContainer<>();


        // Створюємо різні вагони
        PassengerWagon passengerWagon1 = new PassengerWagon(100, "1-й клас");
        PassengerWagon passengerWagon2 = new PassengerWagon(150, "2-й клас");
        CargoWagon cargoWagon = new CargoWagon(50, 20);


        // Додаємо вагони до контейнера
        wagonContainer.addWagon(passengerWagon1);
        wagonContainer.addWagon(passengerWagon2);
        wagonContainer.addWagon(cargoWagon);


        // Виводимо максимальний вагон
        Wagon maxWagon = wagonContainer.findMaxWagon();
        if (maxWagon != null) {
            System.out.println("Вагон з найбільшою кількістю місць:");
            maxWagon.printInfo();
        }

        // Виводимо кількість вагонів
        System.out.println("Кількість вагонів у контейнері: " + wagonContainer.getSize());

        // Видаляємо вагон
        wagonContainer.removeWagon(passengerWagon1);
        System.out.println("Кількість вагонів після видалення: " + wagonContainer.getSize());


    }


}

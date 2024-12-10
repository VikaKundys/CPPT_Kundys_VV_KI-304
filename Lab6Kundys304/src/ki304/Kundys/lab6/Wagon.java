package ki304.Kundys.lab6;

// Абстрактний клас "Вагон"
/**
 * Абстрактний клас, що представляє загальний вагон.
 */
abstract class Wagon {
    private int capacity; // Кількість місць у вагоні

    public Wagon(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Отримує кількість місць у вагоні.
     * @return Кількість місць.
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Виводить інформацію про вагон.
     */
    public abstract void printInfo();
}

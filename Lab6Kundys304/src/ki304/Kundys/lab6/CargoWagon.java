package ki304.Kundys.lab6;

// Клас для вантажних вагонів
/**
 * Клас, що представляє вантажний вагон.
 */
class CargoWagon extends Wagon {
    private int loadCapacity; // Вантажопідйомність у тоннах

    public CargoWagon(int capacity, int loadCapacity) {
        super(capacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printInfo() {
        System.out.println("Вантажний вагон, вантажопідйомність: " + loadCapacity + " тонн, кількість місць: " + getCapacity());
    }
}

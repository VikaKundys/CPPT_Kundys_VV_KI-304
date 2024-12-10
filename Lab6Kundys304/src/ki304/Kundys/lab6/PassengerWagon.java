package ki304.Kundys.lab6;

// Клас для пасажирських вагонів
/**
 * Клас, що представляє пасажирський вагон.
 */
class PassengerWagon extends Wagon {
    private String comfortClass;

    public PassengerWagon(int capacity, String comfortClass) {
        super(capacity);
        this.comfortClass = comfortClass;
    }

    @Override
    public void printInfo() {
        System.out.println("Пасажирський вагон, клас: " + comfortClass + ", кількість місць: " + getCapacity());
    }
}

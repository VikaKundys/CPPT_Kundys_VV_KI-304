//ShipDriver.java
package ki304.Kundys.lab2;

/**
 * Клас для тестування роботи корабля.
 */
public class ShipDriver {
    public static void main(String[] args) {
        Ship myShip = new Ship(); // Створюємо новий об'єкт Ship
        myShip.displayInfo();
        myShip.startEngine();
        myShip.sail();
        myShip.dock();
        myShip.repairHull();
        myShip.displayInfo();
        myShip.stopEngine();
        myShip.checkStatus();
        myShip.closeLog();
    }
}
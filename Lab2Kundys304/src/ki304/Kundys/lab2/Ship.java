//Ship.java
package ki304.Kundys.lab2;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Клас для моделювання корабля.
 */
public class Ship {
    private Engine engine; // Поля для зберігання компонентів корабля
    private Hull hull;
    private Sail sail;
    private FileWriter logWriter; // Файл для ведення журналу

    /**
     * Конструктор без параметрів.
     */
    public Ship() {
        this.engine = new Engine(); // Ініціалізуємо компоненти корабля
        this.hull = new Hull();
        this.sail = new Sail();
        initLog(); // Ініціалізуємо журнал
    }

    /**
     * Конструктор з параметрами.
     *
     * @param engine Двигун корабля.
     * @param hull Корпус корабля.
     * @param sail Вітрило корабля.
     *
     */
    public Ship(Engine engine, Hull hull, Sail sail) {
        this.engine = engine; // Призначаємо передані компоненти корабля
        this.hull = hull;
        this.sail = sail;
        initLog();
    }

    private void initLog() {  // Метод для ініціалізації журналу
        try {
            logWriter = new FileWriter("ship_log.txt", true); // Відкриваємо файл журналу для запису
            log("Ship created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void log(String message) { // Метод для запису повідомлення в журнал
        try {
            logWriter.write(message + "\n"); // Записуємо повідомлення у файл журналу
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startEngine() { // Метод для запуску двигуна
        engine.start(); // Викликаємо метод запуску двигуна
        log("Engine started."); // Записуємо в журнал про запуск двигуна
    }

    public void stopEngine() {
        engine.stop();
        log("Engine stopped.");
    }

    public void sail() {
        sail.raise();
        log("Sail raised.");
    }

    public void dock() { // Метод для опускання вітрила
        sail.lower();
        log("Sail lowered.");
    }

    public void repairHull() { // Метод для ремонту корпусу
        hull.repair();
        log("Hull repaired.");
    }

    public void displayInfo() { // Метод для відображення інформації про корабель
        System.out.println("Ship information:");
        engine.displayInfo();
        hull.displayInfo();
        sail.displayInfo();
        log("Displayed ship information."); // Записуємо в журнал про відображення інформації
    }

    public void checkStatus() {
        System.out.println("Checking ship status:");
        engine.displayInfo();
        hull.displayInfo();
        sail.displayInfo();
        log("Checked ship status.");
    }



    public void closeLog() {
        try {
            logWriter.write("Ship log closed.\n"); // Записуємо повідомлення про закриття журналу
            logWriter.close(); // Закриваємо файл журналу
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

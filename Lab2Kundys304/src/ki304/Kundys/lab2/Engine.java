//Engine.java
package ki304.Kundys.lab2;

/**
 * Клас для моделювання двигуна корабля.
 */
public class Engine {
    private boolean isRunning; // Поле для зберігання статусу двигуна (працює чи ні)

    public Engine() {
        this.isRunning = false;
    }

    public void start() {
        isRunning = true;
        System.out.println("Engine started.");
    }

    public void stop() {
        isRunning = false;
        System.out.println("Engine stopped.");
    }

    public void displayInfo() {
        System.out.println("Engine status: " + (isRunning ? "Running" : "Stopped"));
    }
}
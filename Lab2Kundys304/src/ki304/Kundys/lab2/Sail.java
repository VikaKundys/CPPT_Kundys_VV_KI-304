//Sail.java
package ki304.Kundys.lab2;

/**
 * Клас для моделювання вітрила корабля.
 */
public class Sail {
    private boolean isRaised; // Поле для зберігання статусу вітрила (піднято чи опущено)

    public Sail() {
        this.isRaised = false;
    }

    public void raise() {
        isRaised = true;
        System.out.println("Sail raised.");
    }

    public void lower() {
        isRaised = false;
        System.out.println("Sail lowered.");
    }

    public void displayInfo() {
        System.out.println("Sail status: " + (isRaised ? "Raised" : "Lowered"));
    }
}

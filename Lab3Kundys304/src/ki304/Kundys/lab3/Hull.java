package ki304.Kundys.lab3;

/**
 * Клас для моделювання корпусу корабля.
 */
public class Hull {
    private boolean isDamaged; // Поле для зберігання статусу корпусу (пошкоджений чи ні)

    public Hull() {
        this.isDamaged = false;
    }

    public void repair() {
        if (isDamaged) {
            isDamaged = false;
            System.out.println("Hull repaired.");
        } else {
            System.out.println("Hull is in good condition.");
        }
    }

    public void damage() {
        isDamaged = true;
        System.out.println("Hull damaged.");
    }

    public void displayInfo() {
        System.out.println("Hull status: " + (isDamaged ? "Damaged" : "Good condition"));
    }
}

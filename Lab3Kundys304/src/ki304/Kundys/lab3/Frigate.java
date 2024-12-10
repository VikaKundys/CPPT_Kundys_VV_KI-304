package ki304.Kundys.lab3;


/**
 * Клас для моделювання фрегату, який є підкласом корабля.
 */
public class Frigate extends Ship implements WeaponSystem {

    public Frigate() {
        super(); // Викликаємо конструктор суперкласу
    }

    @Override
    public void sail() {   // Реалізація абстрактного методу керування вітрилом.
        sail.raise();
        log("Frigate is sailing.");
    }

    @Override
    public void fireCannons() {   // Реалізація методу з інтерфейсу WeaponSystem.
        System.out.println("Firing frigate cannons!");
        log("Frigate fired cannons.");
    }

    @Override
    public void launchMissiles() {
        System.out.println("Launching frigate missiles!");
        log("Frigate launched missiles.");
    }
}

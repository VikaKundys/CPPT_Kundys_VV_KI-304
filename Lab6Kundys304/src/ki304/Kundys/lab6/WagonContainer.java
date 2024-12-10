package ki304.Kundys.lab6;

import java.util.ArrayList;
import java.util.List;

// Параметризований клас-контейнер для вагонів
/**
 * Клас-контейнер для зберігання вагонів.
 * @param <T> тип вагонів, що зберігаються у контейнері.
 */
public class WagonContainer<T extends Wagon> {
    private List<T> wagons;

    /**
     * Конструктор для створення контейнера вагонів.
     */
    public WagonContainer() {
        this.wagons = new ArrayList<>();
    }

    /**
     * Додає вагон до контейнера.
     * @param wagon Вагон для додавання.
     */
    public void addWagon(T wagon) {
        wagons.add(wagon);
    }

    /**
     * Видаляє вагон з контейнера.
     * @param wagon Вагон для видалення.
     */
    public void removeWagon(T wagon) {
        wagons.remove(wagon);
    }

    /**
     * Повертає вагон з найбільшою кількістю місць.
     * @return Вагон з найбільшою кількістю місць.
     */
    public T findMaxWagon() {
        if (wagons.isEmpty()) {
            return null;
        }
        T maxWagon = wagons.get(0);
        for (T wagon : wagons) {
            if (wagon.getCapacity() > maxWagon.getCapacity()) {
                maxWagon = wagon;
            }
        }
        return maxWagon;
    }

    /**
     * Повертає кількість вагонів у контейнері.
     * @return Кількість вагонів.
     */
    public int getSize() {
        return wagons.size();
    }
}



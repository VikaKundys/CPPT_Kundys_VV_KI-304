package ki304.Kundys.lab3;


public class FrigateDriver {
    public static void main(String[] args) {
        Frigate frigate = new Frigate(); // Створюємо новий об'єкт Frigate
        frigate.displayInfo(); // Відображаємо інформацію про фрегат
        frigate.startEngine(); // Запускаємо двигун
        frigate.sail(); // Піднімаємо вітрило і "пливемо"
        frigate.fireCannons(); // Стріляємо з гармат
        frigate.launchMissiles(); // Запускаємо ракети
        frigate.repairHull(); // Ремонтуємо корпус, якщо треба
        frigate.stopEngine(); // Зупиняємо двигун
        frigate.checkStatus(); // Перевіряємо стан фрегата
        frigate.closeLog(); // Закриваємо лог
    }
}


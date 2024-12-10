import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Генерування матриці (внутрішній заповнений квадрат).
 */
public class Lab1Kundys304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення розміру матриці
        System.out.println("Введіть розмір квадратної матриці:");
        int size = scanner.nextInt();
        scanner.nextLine();  // Очищення буфера

        // Введення символу-заповнювача
        System.out.println("Введіть символ-заповнювач:");
        String filler = scanner.nextLine();

        // Перевірка на введення одного символу
        if (filler.length() != 1) {
            System.out.println("Помилка: потрібно ввести один символ.");
            return;
        }

        // Генерація матриці
        char[][] squareArray = generateSquareArray(size, filler.charAt(0));

        // Вивід матриці на екран
        printArray(squareArray);

        // Запис матриці у файл
        writeArrayToFile(squareArray, "output.txt");
    }

    /**
     * Генерує матрицю з внутрішнім заповненим квадратом.
     * @param size розмір матриці
     *
     * @param filler символ-заповнювач
     * @return матриця
     */
    private static char[][] generateSquareArray(int size, char filler) {
        char[][] array = new char[size][size];

        // Визначаємо межі внутрішнього квадрата
        int innerStart = size / 4; // Початок внутрішнього квадрата
        int innerEnd = size - innerStart; // Кінець внутрішнього квадрата

        // Заповнення матриці
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Заповнюємо тільки внутрішній квадрат, решта залишиться порожньою
                if (i >= innerStart && i < innerEnd && j >= innerStart && j < innerEnd) {
                    array[i][j] = filler;
                } else {
                    array[i][j] = ' '; // Порожні місця
                }
            }
        }

        return array;
    }

    /**
     * Друкує масив у консоль.
     * @param array масив для друку
     */
    private static void printArray(char[][] array) {
        for (char[] row : array) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    /**
     * Записує масив у текстовий файл.
     * @param array масив для запису
     * @param filename назва файлу для збереження
     */
    private static void writeArrayToFile(char[][] array, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (char[] row : array) {
                for (char c : row) {
                    writer.write(c + " ");
                }
                writer.write("\n");
            }
            System.out.println("Масив було записано у файл: " + filename);
        } catch (IOException e) {
            System.err.println("Помилка при записі у файл: " + e.getMessage());
        }
    }
}
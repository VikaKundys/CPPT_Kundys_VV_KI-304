package ki304.Kundys.lab4;


import java.io.FileWriter;
import java.io.IOException;
import java.lang.Math;

/**
 * Клас для обчислення виразу y = cos(2x) / ctg(3x - 1).
 */
public class ExpressionCalculator {

    /**
     * Обчислює значення виразу y = cos(2x) / ctg(3x - 1).
     *
     * @param x вхідна змінна x
     * @return результат обчислення виразу
     * @throws ArithmeticException якщо результат не можна обчислити (наприклад, ctg(3x - 1) = 0)
     */
    public double calculate(double x) throws ArithmeticException {
        double cos2x = Math.cos(2 * x);
        double tan3xMinus1 = Math.tan(3 * x - 1);  // ctg(x) = 1 / tan(x)

        if (tan3xMinus1 == 0) {
            throw new ArithmeticException("Ділення на нуль: ctg(3x - 1) є нескінченним.");
        }

        return cos2x * tan3xMinus1;
    }

    /**
     * Записує результат обчислення у файл.
     *
     * @param result   результат обчислення
     * @param fileName ім'я файлу
     * @throws IOException якщо виникає проблема під час запису у файл
     */
    public void writeResultToFile(double result, String fileName) throws IOException {
            try (FileWriter writer = new FileWriter(fileName)) {
                writer.write("Результат: " + result);
            }


    }
}
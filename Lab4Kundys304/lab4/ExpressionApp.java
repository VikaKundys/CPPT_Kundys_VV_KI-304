package ki304.Kundys.lab4;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpressionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpressionCalculator calculator = new ExpressionCalculator();
        double x = 0;  // Ініціалізація змінної для x, яка зберігатиме введене значення

        // Цикл для коректного вводу числа
        while (true) {
            try {
                System.out.print("Введіть значення x: ");
                x = scanner.nextDouble();  // користувач вводить нове значення для x
                break;
            } catch (InputMismatchException e) {
                System.err.println("Помилка: Введено некоректне значення. Будь ласка, введіть число.");
                scanner.next();  // Очистити неправильний ввід
            }
        }

        try {
            // Обчислення виразу
            double result = calculator.calculate(x);
            System.out.println("Результат: " + result);

            // Запис результату у файл
            calculator.writeResultToFile(result, "result.txt");
            System.out.println("Результат записано у файл 'result.txt'.");

        } catch (ArithmeticException e) {
            System.err.println("Помилка обчислення: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Помилка при записі у файл: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


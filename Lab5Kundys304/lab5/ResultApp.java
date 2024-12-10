package ki304.Kundys.lab5;

import ki304.Kundys.lab4.ExpressionCalculator;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Програма для тестування роботи класу ResultIO.
 */
public class ResultApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExpressionCalculator calculator = new ExpressionCalculator();
        ResultIO resultIO = new ResultIO();


        try {
            System.out.print("Введіть значення x: ");
            double x = scanner.nextDouble();


            double result = calculator.calculate(x);
            System.out.println("Результат: " + result);


            // Тестування запису та читання з текстового файлу
            resultIO.writeText(result, "result.txt");
            System.out.println("Результат з текстового файлу: " + resultIO.readText("result.txt"));

            // Тестування запису та читання з двійкового файлу
            resultIO.writeBinary(result, "result.bin");
            System.out.println("Результат з двійкового файлу: " + resultIO.readBinary("result.bin"));

        } catch (ArithmeticException e) {
            System.err.println("Помилка: " + e.getMessage());
            InputMismatchException("result.txt","Помилка" + e.getMessage());

        } catch (IOException e) {
            System.err.println("Помилка файлу: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    private static void InputMismatchException (String fileName, String Message){
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName, true)))
        {
            out.println(Message);
        }
        catch (IOException e)
        {
            System.out.println("Помилка при записі у файл" + e.getMessage());
        } }

}


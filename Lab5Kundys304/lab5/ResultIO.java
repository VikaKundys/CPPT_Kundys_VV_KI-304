package ki304.Kundys.lab5;

import java.io.*;

/**
 * Клас для запису та читання результатів у текстовому та двійковому форматах.
 */
public class ResultIO {

    /**
     * Записує результат у текстовий файл.
     * @param result результат обчислення
     * @param fileName ім'я файлу
     * @throws IOException якщо виникає проблема з записом
     */
    public void writeText(double result, String fileName) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Результат: " + result);
        }
    }

    /**
     * Зчитує результат з текстового файлу.
     * @param fileName ім'я файлу
     * @return результат обчислення
     * @throws IOException якщо виникає проблема з читанням
     */
    public double readText(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            return Double.parseDouble(line.split(": ")[1]);
        }
    }

    /**
     * Записує результат у двійковий файл.
     * @param result результат обчислення
     * @param fileName ім'я файлу
     * @throws IOException якщо виникає проблема з записом
     */
    public void writeBinary(double result, String fileName) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeDouble(result);
        }
    }

    /**
     * Зчитує результат з двійкового файлу.
     * @param fileName ім'я файлу
     * @return результат обчислення
     * @throws IOException якщо виникає проблема з читанням
     */
    public double readBinary(String fileName) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            return dis.readDouble();
        }
    }
}

import math
import pickle

def calculate_expression(x):
    """
    Обчислює значення виразу y = cos(2x) / ctg(3x - 1).
    
    :param x: значення аргументу x
    :return: обчислене значення y
    """
    try:
        numerator = math.cos(2 * x)
        denominator = 1 / math.tan(3 * x - 1)  # ctg(x) = 1 / tan(x)
        y = numerator / denominator
        return y
    except ZeroDivisionError:
        print("Помилка: ділення на нуль.")
        return None
    except Exception as e:
        print(f"Помилка обчислення: {e}")
        return None

def write_to_text_file(filename, x, y):
    """
    Записує значення x та y у текстовий файл.
    """
    with open(filename, 'w') as file:
        file.write(f"x = {x:.2f}, y = {y:.5f}\n")

def write_to_binary_file(filename, x, y):
    """
    Записує значення x та y у двійковий файл.
    """
    with open(filename, 'wb') as file:
        pickle.dump((x, y), file)

def read_from_binary_file(filename):
    """
    Зчитує значення x та y з двійкового файлу.
    """
    with open(filename, 'rb') as file:
        data = pickle.load(file)
        return data

def main():
    """
    Основна функція програми.
    """
    try:
        # Введення значення x з клавіатури
        x = float(input("Введіть значення x: "))
        
        # Обчислення значення виразу
        y = calculate_expression(x)

        if y is not None:
            # Вивід результату на екран
            print(f"Для x = {x:.2f}, значення виразу y = {y:.5f}")

            # Запис результату у текстовий файл
            text_filename = 'result.txt'
            write_to_text_file(text_filename, x, y)
            print(f"Результат записано у текстовий файл: {text_filename}")

            # Запис результату у двійковий файл
            binary_filename = 'result.bin'
            write_to_binary_file(binary_filename, x, y)
            print(f"Результат записано у двійковий файл: {binary_filename}")

            # Зчитування та виведення з двійкового файлу
            read_x, read_y = read_from_binary_file(binary_filename)
            print(f"Зчитаний результат з двійкового файлу: x = {read_x:.2f}, y = {read_y:.5f}")
        else:
            print("Обчислення не вдалося виконати через помилку.")

    except ValueError:
        print("Помилка: введене значення не є числом.")

if __name__ == "__main__":
    main()
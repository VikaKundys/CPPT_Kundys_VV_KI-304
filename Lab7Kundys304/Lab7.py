def create_matrix(n, fill_char):
    """
    Функція створює квадратну матрицю n x n, де центральна частина заповнена символом-заповнювачем.
    
    :param n: Розмір квадратної матриці
    :param fill_char: Символ-заповнювач
    :return: Зубчастий список із заштрихованою центральною частиною
    """
    matrix = [[' ' for _ in range(n)] for _ in range(n)]
    # Визначення розміру центрального квадрата (заштрихована частина)
    start = n // 4
    end = n - start
    
    for i in range(start, end):
       for j in range(start, end):
           matrix[i][j] = fill_char
           



    return matrix

def print_matrix(matrix):
    """
    Функція виводить матрицю на екран.
    
    :param matrix: Зубчастий список (матриця)
    """
    for row in matrix:
        print(' '.join(row))

def main():
    try:
        # Введення розміру квадратної матриці
        n = int(input("Введіть розмір квадратної матриці: "))
        
        if n < 1:
            print("Розмір матриці має бути додатнім числом.")
            return

        # Введення символу-заповнювача
        fill_char = input("Введіть символ-заповнювач (лише один символ): ")
        
        
        # Перевірка введення символу-заповнювача
        if len(fill_char) != 1:
            print("Введіть лише один символ.")
            return
        
        # Створення матриці
        matrix = create_matrix(n, fill_char)
        
        # Виведення матриці на екран
        print("Згенерована матриця:")
        print_matrix(matrix)
        
    except ValueError:
        print("Помилка! Введіть коректне число для розміру матриці.")

if __name__ == "__main__":
    main()

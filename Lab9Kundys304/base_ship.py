
class Ship:
    """Базовий клас Корабель, що визначає основні властивості корабля."""
    
    def __init__(self, name, length, speed):
        """
        Ініціалізація корабля.
        
        :param name: Назва корабля
        :param length: Довжина корабля в метрах
        :param speed: Швидкість корабля у вузлах
        """
        self.name = name
        self.length = length
        self.speed = speed

    def sail(self):
        """Метод для початку руху корабля."""
        print(f"{self.name} рухається зі швидкістю {self.speed} вузлів.")
    
    def get_info(self):
        """Повертає інформацію про корабель."""
        return f"Назва: {self.name}, Довжина: {self.length} м, Швидкість: {self.speed} вузлів"

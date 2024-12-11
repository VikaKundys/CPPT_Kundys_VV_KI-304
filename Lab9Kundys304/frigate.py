
from .base_ship import Ship

class Frigate(Ship):
    """Клас Фрегат, що наслідує клас Корабель, з додатковими характеристиками."""
    
    def __init__(self, name, length, speed, weapon_type):
        """
        Ініціалізація фрегата з додатковою зброєю.
        
        :param name: Назва фрегата
        :param length: Довжина фрегата в метрах
        :param speed: Швидкість фрегата у вузлах
        :param weapon_type: Тип зброї, встановлений на фрегаті
        """
        super().__init__(name, length, speed)
        self.weapon_type = weapon_type

    def attack(self):
        """Метод для атаки."""
        print(f"{self.name} атакує з використанням {self.weapon_type}!")
    
    def get_info(self):
        """Повертає інформацію про фрегат з урахуванням типу зброї."""
        base_info = super().get_info()
        return f"{base_info}, Тип зброї: {self.weapon_type}"

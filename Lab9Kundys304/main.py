from ships.base_ship import Ship
from ships.frigate import Frigate

def main():
    # Створення об'єкта базового класу Ship
    ship = Ship(name="Океан", length=300, speed=25)
    print(ship.get_info())
    ship.sail()
    
    # Створення об'єкта похідного класу Frigate
    frigate = Frigate(name="Сокіл", length=150, speed=30, weapon_type="ракети")
    print(frigate.get_info())
    frigate.sail()
    frigate.attack()

if __name__ == "__main__":
    main()
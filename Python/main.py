from car import Car
from account import Account

if __name__ == "__main__":
    # print("Hola mundo")
    car = Car("ASM-123", Account("Gabriel Villegas", "PassPort"))
    
    print(vars(car))
    print(vars(car.driver))
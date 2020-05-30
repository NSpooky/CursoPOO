from car import Car

class UberBlack(Car):
    typeCarAccepte = []
    seatsMaterial = []

    def __init__(self, license, driver, typeCarAccepte, seatsMaterial):
        super().__init__(license, driver)
        self.typeCarAccepte = typeCarAccepte
        self.seatsMaterial = seatsMaterial
class Main {
    public static void main(String[] args) {
        // System.out.println("J");

        Car car = new Car("ABC-123", new Account("Gabriel Villegas", "INE"));
        // car.license = "ABC-123";
        // car.driver = "Gabriel Villegas";
        // car.passenger = 4;
        // System.out.println("Car License: " + car.license);
        car.printDataCar();

    }
}
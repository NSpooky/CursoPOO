class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo java in VS Code");
        UberX uberX = new UberX("ABC-123 ", new Account("Gabriel Villegas ", "Credencial "), "Chevrolet ", "Chayanne ");
        uberX.setPassenger(4);
        uberX.printDataCar();
        UberVan uberVan = new UberVan("DFG-456 ", new Account("Gerardo Villegas ", "Pasaporte "));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

    }
}
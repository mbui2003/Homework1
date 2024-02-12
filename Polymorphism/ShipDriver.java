public class ShipDriver {
    private static Ship[] ships;

    public static void main(String[] args) {
        ships = new Ship[3];
        ships[0] = new Ship("Allure of the Seas", "2008");
        ships[1] = new CruiseShip("Icon of the Seas", "2022", 7600);
        ships[2] = new CargoShip("MSC Irina", "2023", 240000);

        for (Ship ship : ships) {
            ship.print();
            System.out.println();
        }
    }
}
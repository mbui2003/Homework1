public class CargoShip extends Ship {
    private int cargoCapacityInTonnage;

    public CargoShip(String shipName, String yearShipBuilt, int cargoCapacityInTonnage) {
        super(shipName, yearShipBuilt);
        this.cargoCapacityInTonnage = cargoCapacityInTonnage;
    }

    public int getCargoCapacityInTonnage() {
        return cargoCapacityInTonnage;
    }

    public void setCargoCapacityInTonnage(int cargoCapacityInTonnage) {
        this.cargoCapacityInTonnage = cargoCapacityInTonnage;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Cargo Capacity in Tonnage: " + getCargoCapacityInTonnage());
    }
}

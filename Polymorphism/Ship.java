public class Ship {
    private String shipName;
    private String yearShipBuilt;

    public Ship(String shipName, String yearShipBuilt) {
        this.shipName = shipName;
        this.yearShipBuilt = yearShipBuilt;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getYearShipBuilt() {
        return yearShipBuilt;
    }

    public void setYearShipBuilt() {
        this.yearShipBuilt = yearShipBuilt;
    }

    public void print() {
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Year Ship Was Built: " + getYearShipBuilt());
    }
}

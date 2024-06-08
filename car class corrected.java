public class Vehicle {
    private String registrationNumber;
    private String manufacturer;
    private String vehicleType;
    private int productionYear;
    private boolean isRented;

    public Vehicle(String registrationNumber, String manufacturer, String vehicleType, int productionYear) {
        this.registrationNumber = registrationNumber;
        this.manufacturer = manufacturer;
        this.vehicleType = vehicleType;
        this.productionYear = productionYear;
        this.isRented = false;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }
}
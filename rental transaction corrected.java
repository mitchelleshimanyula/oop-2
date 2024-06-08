public class VehicleRentalRecord {
    private Client renter;
    private Vehicle rentedVehicle;
    private String rentalStartDate;
    private String returnDate;

    public VehicleRentalRecord(Client renter, Vehicle rentedVehicle) {
        this.renter = renter;
        this.rentedVehicle = rentedVehicle;
        this.rentalStartDate = java.time.LocalDate.now().toString();
    }

    public Client getRenter() {
        return renter;
    }

    public Vehicle getRentedVehicle() {
        return rentedVehicle;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
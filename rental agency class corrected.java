import java.util.ArrayList;
import java.util.List;

public class VehicleRentalService {
    private String agencyName;
    private List<Vehicle> fleet;
    private List<Client> clientBase;
    private List<RentalRecord> rentalHistory;

    public VehicleRentalService(String agencyName) {
        this.agencyName = agencyName;
        this.fleet = new ArrayList<>();
        this.clientBase = new ArrayList<>();
        this.rentalHistory = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void enrollClient(Client client) {
        clientBase.add(client);
    }

    public void rentVehicle(Client client, Vehicle vehicle) {
        if (vehicle.isAvailable()) {
            vehicle.setRented(true);
            RentalRecord rental = new RentalRecord(client, vehicle);
            rentalHistory.add(rental);
            System.out.println("Vehicle rented successfully!");
        } else {
            System.out.println("Vehicle is not available for rent.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setRented(false);
        System.out.println("Vehicle returned successfully!");
    }

    public List<RentalRecord> getRentalHistory() {
        return rentalHistory;
    }
}

class Vehicle {
    private boolean rented;

    public Vehicle() {
        this.rented = false;
    }

    public boolean isAvailable() {
        return !rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }
}

class Client {
    // Client class implementation
}

class RentalRecord {
    private Client client;
    private Vehicle vehicle;

    public RentalRecord(Client client, Vehicle vehicle) {
        this.client = client;
        this.vehicle = vehicle;
    }

    // RentalRecord class implementation
}
class Vehicle {

    int maxSpeed;
    String model;

    Vehicle(int maxSpeed,
            String model) {

        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    void displayVehicle() {

        System.out.println(
                "Model: " + model);

        System.out.println(
                "Max Speed: "
                        + maxSpeed + " km/h");
    }
}

interface Refuelable {

    void refuel();
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(int maxSpeed,
                    String model) {

        super(maxSpeed, model);
    }

    void charge() {

        System.out.println(
                model + " is charging.");
    }
}

class PetrolVehicle
        extends Vehicle
        implements Refuelable {

    PetrolVehicle(int maxSpeed,
                  String model) {

        super(maxSpeed, model);
    }

    @Override
    public void refuel() {

        System.out.println(
                model + " is refueling.");
    }
}

public class VehicleManagementSystem {

    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle(
                        180,
                        "Tesla Model 3");

        PetrolVehicle pv =
                new PetrolVehicle(
                        220,
                        "Honda City");

        System.out.println("Electric Vehicle");

        ev.displayVehicle();
        ev.charge();

        System.out.println();

        System.out.println("Petrol Vehicle");

        pv.displayVehicle();
        pv.refuel();
    }
}
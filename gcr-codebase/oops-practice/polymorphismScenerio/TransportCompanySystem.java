class Vehicle {
    String vehicleNumber;

    Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    double fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    double fuelCost(int km) {
        return km * 6.5;
    }
}

class Bus extends Vehicle {
    Bus(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    double fuelCost(int km) {
        return km * 15;
    }
}

class Bike extends Vehicle {
    Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    double fuelCost(int km) {
        return km * 2.5;
    }
}

class ElectricCar extends Vehicle {
    ElectricCar(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    double fuelCost(int km) {
        return km * 1.5;
    }
}

public class TransportCompanySystem {
    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("C101"),
                new Bus("B201"),
                new Bike("BK301"),
                new ElectricCar("EC401")
        };

        int km = 100;

        for (Vehicle v : fleet) {

            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("Car Cost = ₹" + c.fuelCost(km));
            } else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("Bus Cost = ₹" + b.fuelCost(km));
            } else if (v instanceof Bike) {
                Bike bike = (Bike) v;
                System.out.println("Bike Cost = ₹" + bike.fuelCost(km));
            } else if (v instanceof ElectricCar) {
                ElectricCar ec = (ElectricCar) v;
                System.out.println("Electric Car Cost = ₹" + ec.fuelCost(km));
            }
        }
    }
}
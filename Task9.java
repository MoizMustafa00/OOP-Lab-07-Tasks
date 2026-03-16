package Lab07_Tasks;

class Ride {
    public void calculateFare(double distance) {}
}

class BikeRide extends Ride {
    @Override
    public void calculateFare(double distance) {
        double fare = distance * 50;
        System.out.println("Bike Fare: " + fare);
    }
}

class CarRide extends Ride {
    @Override
    public void calculateFare(double distance) {
        double fare = distance * 200;
        System.out.println("Car Fare: " + fare);
    }
}

class LuxuryRide extends Ride {
    @Override
    public void calculateFare(double distance) {
        double fare = distance * 500;
        System.out.println("Luxury Fare: " + fare);
    }
}

class Main9 {
    public static void main(String[] args) {
        Ride r1 = new BikeRide();
        Ride r2 = new CarRide();
        Ride r3 = new LuxuryRide();
        r1.calculateFare(10);
        r2.calculateFare(10);
        r3.calculateFare(10);
    }
}
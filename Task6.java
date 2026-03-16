package Lab07_Tasks;

class Transport {
    double baseFare;
    double distance;
    double pricePerKM;

    Transport(double baseFare, double distance, double pricePerKM) {
        this.baseFare = baseFare;
        this.distance = distance;
        this.pricePerKM = pricePerKM;
    }

    public void fare() {}
}

class Bus extends Transport {
    Bus(double baseFare, double distance, double pricePerKM) {
        super(baseFare, distance, pricePerKM);
    }

    @Override
    public void fare() {
        if(distance < 25) {
            double fare = baseFare;
            System.out.println("Bus Fare: " + fare);
        }
        else {
            double fare = baseFare + (distance * pricePerKM);
            System.out.println("Bus Fare: " + fare);
        }
    }
}

class Train extends Transport {
    Train(double baseFare, double distance, double pricePerKM) {
        super(baseFare, distance, pricePerKM);
    }

    @Override
    public void fare() {
        if(distance < 75) {
            double fare = baseFare;
            System.out.println("Train Fare: " + fare);
        }
        else {
            double fare = baseFare + (distance * pricePerKM);
            System.out.println("Train Fare: " + fare);
        }
    }
}

class Taxi extends Transport {
    Taxi(double baseFare, double distance, double pricePerKM) {
        super(baseFare, distance, pricePerKM);
    }

    @Override
    public void fare() {
        if(distance < 10) {
            double fare = baseFare;
            System.out.println("Taxi Fare: " + fare);
        }
        else {
            double fare = baseFare + (distance * pricePerKM);
            System.out.println("Taxi Fare: " + fare);
        }
    }
}

class Main6 {
    public static void main(String[] args) {
        Transport t1 = new Bus(50, 25, 10);
        Transport t2 = new Train(1000, 100, 50);
        Transport t3 = new Taxi(250, 5, 30);
        t1.fare();
        t2.fare();
        t3.fare();
    }
}
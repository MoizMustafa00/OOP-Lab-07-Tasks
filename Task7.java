package Lab07_Tasks;

class Restaurant {
    public void calculateDeliveryFee(double distance) {}
}

class FastFoodRestaurant extends Restaurant {
    @Override
    public void calculateDeliveryFee(double distance) {
        double fee = 50 + (distance * 10); //50 base, 10 per km
        System.out.println("Delivery Fee: " + fee);
    }
}

class FineDiningRestaurant extends Restaurant {
    @Override
    public void calculateDeliveryFee(double distance) {
        double fee = 200 + (distance * 30); //200 base, 30 per km
        System.out.println("Delivery Fee: " + fee);
    }
}

class CafeRestaurant extends Restaurant {
    @Override
    public void calculateDeliveryFee(double distance) {
        if(distance < 3) {
            double fee = 0;
            System.out.println("Delivery Fee: " + fee);
        }
        else {
            double fee = 15 * (distance - 3); //Free for 3km then 15 per km
            System.out.println("Delivery Fee: " + fee);
        }
    }
}

class Main7 {
    public static void main(String[] args) {
        Restaurant r1 = new FastFoodRestaurant();
        Restaurant r2 = new FineDiningRestaurant();
        Restaurant r3 = new CafeRestaurant();
        r1.calculateDeliveryFee(7);
        r2.calculateDeliveryFee(7);
        r3.calculateDeliveryFee(7);
    }
}
package Lab07_Tasks;

class SmartDevice {
    public void turnOn() {}
}

class SmartLight extends SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("LIGHTS ON - Brightness Set to 60%");
    }
}

class SmartFan extends SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("FAN ON - Speed Set to Level 3");
    }
}

class SmartAC extends SmartDevice {
    @Override
    public void turnOn() {
        System.out.println("AC ON - Temperature Set to 20C");
    }
}

class Main8 {
    public static void main(String[] args) {
        SmartDevice[] devices = {
            new SmartLight(),
            new SmartFan(),
            new SmartAC()
        };
        for(SmartDevice d : devices) {
            d.turnOn();
        }
    }
}
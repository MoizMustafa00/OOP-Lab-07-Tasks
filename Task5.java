package Lab07_Tasks;

class Notification {
    Notification(){}

    public void send() {}
}

class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Notification Sent via Email");
    }
}

class SMSNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Notification Sent via SMS");
    }
}

class PushNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Notification was Pushed");
    }
}

class Main5 {
    public static void main(String[] args) {
        Notification n1 = new EmailNotification();
        Notification n2 = new SMSNotification();
        Notification n3 = new PushNotification();
        n1.send();
        n2.send();
        n3.send();
    }
}
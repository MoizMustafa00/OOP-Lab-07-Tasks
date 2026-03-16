package Lab07_Tasks;

class Animal {
    Animal(){}

    public void makeSound() {
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat Meows");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow Moos");
    }
}

class Main1 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();
        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}
package Lab07_Tasks;

class Employee {
    double salary;

    Employee(double salary) {
        this.salary = salary;
    }

    public void calculateSalary() {}
}

class Manager extends Employee {
    Manager(double salary) {
        super(salary);
    }

    @Override
    public void calculateSalary() {
        salary += 150000;
        System.out.println("Manager Salary: " + salary);
    }
}

class Developer extends Employee {
    Developer(double salary) {
        super(salary);
    }

    @Override
    public void calculateSalary() {
        salary += 75000;
        System.out.println("Developer Salary: " + salary);
    }
}

class Intern extends Employee {
    Intern(double salary) {
        super(salary);
    }

    @Override
    public void calculateSalary() {
        salary *= 0.40; //40% of the salary
        System.out.println("Intern Salary: " + salary);
    }
}

class Main4 {
    public static void main(String[] args) {
        Employee e1 = new Manager(50000);
        Employee e2 = new Developer(50000);
        Employee e3 = new Intern(50000);
        e1.calculateSalary();
        e2.calculateSalary();
        e3.calculateSalary();
    }
}
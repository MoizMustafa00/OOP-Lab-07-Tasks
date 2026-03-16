package Lab07_Tasks;

class Shape {
    Shape(){}

    public void area() {}
}

class Circle extends Shape {
    Circle() {}

    @Override
    public void area() {
        double area = 3.142 * (5 * 5);
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    Rectangle() {}

    @Override
    public void area() {
        double area = 4 * 6;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    Triangle() {}

    @Override
    public void area() {
        double area = 0.5 * 3 * 8;
        System.out.println("Area of Triangle: " + area);
    }
}

class Main2 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(),
            new Rectangle(),
            new Triangle()
        };

        for(Shape s : shapes) {
            s.area();
        }
    }
}
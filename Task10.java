package Lab07_Tasks;

class Course {
    public void calculateGrade(int assignments, int exams) {}
}

class ProgrammingCourse extends Course {
    @Override
    public void calculateGrade(int assignments, int exams) {
        double grade = (assignments * 0.20) + (exams * 0.80);
        System.out.println("Programming Grade: " + grade + "%");
    }
}

class MathematicsCourse extends Course {
    @Override
    public void calculateGrade(int assignments, int exams) {
        double grade = (assignments * 0.40) + (exams * 0.60);
        System.out.println("Mathematics Grade: " + grade + "%");
    }
}

class DesignCourse extends Course {
    @Override
    public void calculateGrade(int assignments, int exams) {
        double grade = (assignments * 0.70) + (exams * 0.30);
        System.out.println("Design Grade: " + grade + "%");
    }
}

class Main10 {
    public static void main(String[] args) {
        Course c1 = new ProgrammingCourse();
        Course c2 = new MathematicsCourse();
        Course c3 = new DesignCourse();
        c1.calculateGrade(75, 85);
        c2.calculateGrade(75, 85);
        c3.calculateGrade(75, 85);
    }
}
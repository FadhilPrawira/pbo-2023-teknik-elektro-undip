import java.util.Scanner;

class Shape {
    private int origin;

    public void move() {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Objek dipindahkan.");
        }
    }

    public void display() {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Objek ditampilkan.");
        }
    }

    public void resize() {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Objek diubah ukurannya.");
        }
    }
}

class Rectangle extends Shape {
    int corner;
}

class Circle extends Shape {
    private float radius;
}

class Polygon extends Shape {
    int point;

    public void Display() {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Objek ditampilkan.");
        }
    }
}

class Square extends Rectangle {

}

class Shape_21060120140057 {
    public static void main(String[] args) {

        Shape object1 = new Shape();
        object1.move();
        object1.display();
        object1.resize();

        Rectangle object2 = new Rectangle();
        object2.move();

        Circle object3 = new Circle();
        object3.move();

        Polygon object4 = new Polygon();
        object4.move();

        Square object5 = new Square();
        object5.move();
    }
}
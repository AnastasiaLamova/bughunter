package Geometry;

// Определение интерфейса для геометрических фигур
interface Shape {
    double calculatePerimeter();
    double calculateArea();
}

// Класс для круга
class Circle implements Shape {
    public double radius;
    public String fillColor;
    public String borderColor;

    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Класс для прямоугольника
class Rectangle implements Shape {
    public double width;
    public double height;
    public String fillColor;
    public String borderColor;

    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Класс для треугольника
class Triangle implements Shape {
    public double sideA;
    public double sideB;
    public double sideC;
    public String fillColor;
    public String borderColor;

    public Triangle(double sideA, double sideB, double sideC, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}

// Тестирование программы
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Черный");
        System.out.println("Круг:");
        System.out.println("Периметр: " + circle.calculatePerimeter());
        System.out.println("Площадь: " + circle.calculateArea());
        System.out.println("Цвет заливки: " + ((Circle) circle).fillColor);
        System.out.println("Цвет границы: " + ((Circle) circle).borderColor);

        Shape rectangle = new Rectangle(4, 6, "Синий", "Зеленый");
        System.out.println("\nПрямоугольник:");
        System.out.println("Периметр: " + rectangle.calculatePerimeter());
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Цвет заливки: " + ((Rectangle) rectangle).fillColor);
        System.out.println("Цвет границы: " + ((Rectangle) rectangle).borderColor);

        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");
        System.out.println("\nТреугольник:");
        System.out.println("Периметр: " + triangle.calculatePerimeter());
        System.out.println("Площадь: " + triangle.calculateArea());
        System.out.println("Цвет заливки: " + ((Triangle) triangle).fillColor);
        System.out.println("Цвет границы: " + ((Triangle) triangle).borderColor);
    }
}


package Classes;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2);
        Circle c3 = new Circle(4, "blue");

        System.out.println("Radius: " + c1.getRadius() + "\nArea: " + c1.getArea());
        System.out.println("Radius: " + c2.getRadius() + "\nArea: " + c2.getArea());
        System.out.println("Radius: " + c3.getRadius() + "\nArea: " + c3.getArea());
        System.out.println("Color: " + c3.getColor());

        Circle c4 = new Circle();
        c4.setRadius(8.0);
        c4.setColor("red");
        System.out.println("New radius: " + c4.getRadius());
        System.out.println("New color: " + c4.getColor());

        Circle c5 = new Circle();
        System.out.println(c5);

        // System.out.println(c1.radius);
        // this will to error due to private access modifier
        // private AM only accessible inside same class
        // need to use set and get method
        // Encapsulation = hiding data + controlling access to it
        // Encapsulation is more to protecting data

    }

}

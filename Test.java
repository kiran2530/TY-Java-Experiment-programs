abstract class Shape 
{
    double side;
    double area;
    double perimeter;
    abstract public void calculateArea();
    abstract void calculatePerimeter();

    void display() 
    {
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
    }
}
class Triangle extends Shape 
{
    double side1, side2, base,height;
    Triangle(double side1, double side2, double base, double height) 
    {
        this.side1 = side1;
        this.side2 = side2 ;
        this.base = base;
        this.height = height;
    }
    public void calculateArea() 
    {
        this.area = 0.5*base*height;
    }
    public void calculatePerimeter() 
    {
        this.perimeter = side1 + side2 + base;
    }
}
class Rectangle extends Shape 
{
    double length,width;
    Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width ;
    }
    public void calculateArea() 
    {
        this.area = length*width;
    }
    public void calculatePerimeter() 
    {
        this.perimeter = 2*(length+width);
    }
    
}
class Circle extends Shape 
{
    double radius;
    Circle(double r) 
    {
        this.radius = r;
    }
    public void calculateArea()
    {
        this.area = Math.PI * radius * radius ;
    }
    public void calculatePerimeter()
    {
        this.perimeter = 2 * Math.PI * radius; 
    }
}
class Square extends Shape 
{
    Square(double side)
    {
        this.side = side;
    }
    public void calculateArea()
    {
        this.area = side * side;
    }
    public void calculatePerimeter()
    {
        this.perimeter = 4 * side;
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println("----------------------------- Triangle --------------------------");
        Shape t = new Triangle(10,12,15,20);
        t.calculateArea();
        t.calculatePerimeter();
        t.display();
        System.out.println("----------------------------- Rectangle --------------------------");
        Shape r = new Rectangle(15,20);
        r.calculateArea();
        r.calculatePerimeter();
        r.display();
        System.out.println("----------------------------- Circle --------------------------");
        Shape c = new Circle(10);
        c.calculateArea();
        c.calculatePerimeter();
        c.display();
        System.out.println("----------------------------- Square --------------------------");
        Shape s = new Square(10);
        s.calculateArea();
        s.calculatePerimeter();
        s.display();
    }
}

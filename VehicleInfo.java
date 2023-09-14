interface Vehicle 
{
    String name = "Swift";
    int maxPassanger = 100;
    int maxSpeed = 150;

}
interface LandVehicle extends Vehicle 
{
    int numWheels = 4;
    void drive();
}
interface SeaVehicle extends Vehicle 
{  
    int displacement = 100;
    void launch();
}
class Car implements LandVehicle
{
    public void drive()
    {
        System.out.println("Car is Driving...");
    }
    public void carCost()
    {
        System.out.println("Cost : 20,00,000");
    }
    public void carColor()
    {
        System.out.println("Color : Red");
    }
    void diplay()
    {
        System.out.println("Name : " + name);
        System.out.println("Max Passanger : " + maxPassanger);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("No of Wheels : " + numWheels);
    }
}
class HoverCraft implements LandVehicle, SeaVehicle
{
    public void drive()
    {
        System.out.println("HoverCraft is Driving...");
    }
    public void launch()
    {
        System.out.println("HoverCraft is Launch...");
    }
    public void enterLand()
    {
        System.out.println("HoverCraft is enter on Land...");
    }
    public void enterSea()
    {
        System.out.println("HoverCraft is enter into Sea..");
    }
}
class Ship implements SeaVehicle
{
    public void launch()
    {
        System.out.println("Ship is Launch...");
    }
    public void shipHeight()
    {
        System.out.println("Height of Ship : 100f");
    }
    public void shipBrand()
    {
        System.out.println("Ship Brand : COSCO");
    }
}
public class VehicleInfo
{
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        c.carColor();
        c.carCost();
        c.diplay();
        System.out.println("-----------------------------------------------");
        HoverCraft h = new HoverCraft();
        h.drive();
        h.launch();
        h.enterLand();
        h.enterSea();
        System.out.println("-----------------------------------------------");
        Ship s = new Ship();
        s.launch();
        s.shipHeight();
        s.shipBrand();
    }
}

class Vehicle
{
public Car()
{
System.out.println("this is my car");
}
public void vehiclemodel()
{
System.out.println("swift");
}
}
class Maruti extends Car
{
public Maruti()
{
System.out.println("class maruthi");
}
public void brand()
{
System.out.println("brand:maruti");
}
public void speed()
{
System.out.println("max:80km");
}
}
public class Scoda extends Maruti
{
public Scoda()
{
System.out.println("maruti model");
}
public void speed() 
{
System.out.println("max:60km");
}
}
public class VehicleMultilevel
{
public static void main(String args[])
{
Scoda s=new Scoda();
s.vehiclemodel();
s.brand();
s.speed();
}
}



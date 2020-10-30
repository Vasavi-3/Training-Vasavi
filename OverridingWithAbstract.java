abstract class Car
{
abstract void cost();
abstract void milage();
abstract void cc();
void start()
{
System.out.println("Starts with a key");
}
		
}
class Benz extends Car
{
void cost()
{
System.out.println("car cost is 60lakhs");
}
void milage()
{
System.out.println("car milage is 20kmpl");
}
void cc()
{
System.out.println("car cc is 3000");
}
}
class Bmw extends Car
{
void cost()
{
System.out.println("car cost is 90lakhs");
}
void milage()
{
System.out.println("car milage is 6kmpl");
}
void cc()
{
System.out.println("car cc is 6000");
}
}
class OveridingWithAbstract
{
public static void main(String[] args)
{
Car v=new Benz();
v.start();
v.cost();
v.milage();
v.cc();
v=new Bmw();
v.start();
v.cost();
v.milage();
v.cc();
}
}


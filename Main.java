class Animal
{ 
String name="puppy";
String color="black";
public void eat()
{
System.out.println("i can eat");
}
}
class Dog extends Animal
{
int cost=100;
public void bark()
{
System.out.println("i can bark");
}
}
public class Main
{
public static void main(String args[])
{
Dog d1=new Dog();
d1.eat();
d1.bark();
}
}

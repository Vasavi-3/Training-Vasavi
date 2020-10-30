class Animal
{
String name;
void nature()
{
System.out.println("animal");
}
class Fish extends Animal
{
String color;
void nature()
{
System.out.println("acquatic animal");
}
punlic class SaveAnimals
{
public static void main(String args[]);
Animal a=new Animal();
a.name="rabbit";
Fish f=new Fish();
f.name="starfish";
f.color="blue";
System.out.println("Object a");
System.out.println("Name:"+a.name);
a.nature();
System.out.println("Object f");
System.out.println("Name:"+f.name);
System.out.println("Color:"+f.color);
f.nature();
}
}

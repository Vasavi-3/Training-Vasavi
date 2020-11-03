abstract class Vehicle
{
abstract void scooty();
}
class NestedClass2
{
public static void main(String args[])
{
Vehicle v=new Vehicle()
{
void scooty()
{
System.out.println("i like scooty");
}
};
System.out.println(v);
v.scooty();
}
}
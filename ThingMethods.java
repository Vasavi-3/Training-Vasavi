class Things
{
void listThings()
{
System.out.println("1.pencil\2.n2.eraser\n3.sharpener\n4.scale");
}
void  takeThing(String order)
{
System.out.println("Pencil ordered is"+order);
}
String giveThing()
{
return"pencil";
}
int price()
{
return 20;
}
String payPrice(int amount)
{
System.out.println("price amount"+amount);
return paid;
}
}
class ThingMethods
{
public static void main(String args[])
{
Things.t=new Things();
t.listThings();
t.takeThing("pencil");
System.out.println("Thing given is:"+m.giveThing());
System.out.println("price amount is:"+m.price());
System.out.println("is"+m.payPrice(m.price
()));
}
}
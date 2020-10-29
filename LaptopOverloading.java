class Lapy
{
 void takeOrder(String Order)
{
System.out.println("Order given is"+Order);
}
 void takeOrder(String order1,String order2)
{
System.out.println("order given is"+order1+"and"+order2);
}
void takeOrder(String order1,String order2,String order3)
{
System.out.println("order given is"+order1+"and"+order2+""+order3);
}
}
class laptopOverloading
{
public static void main(String args[])
{
Lapy d =new Lapy();
d.takeOrder("hp");
d.takeOrder("samsung","lenovo");
d.takeOrder("hp","samsung","lenevo");
}
}

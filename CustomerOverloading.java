class Restaurent
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
class CustomerOverloading
{
public static void main(String args[])
{
Restaurent exit12=new Restaurent();
exit12.takeOrder("idly");
exit12.takeOrder("idly","dosa");
exit12.takeOrder("idly","dosa","vada");
}
}

class Hotel
{
void menu()
{
System.out.println("1.idly\n2.dosa\n3.vada\n4.puri");
}
Void takeOrder(String order)
{
System.out.println("order given is"+order);
}
String serveOrder()
{
return "idly";
}
int bill()
{

return 50;
}
String payBill(int amount)
{
System.out.println("the bill amount"+amount);
return "paid";
}
}
class Restaurent
{
public static void main(String args[])
{
Hotel nvillage=new Hotel();
nvillage.listmenu();
nvillage.takeOrder("idly");
System.out.println("order served is:"+nvillage.serveOrder());
System.out.println("Bill amount is:"+nvillage.bill());
System.out.println("is"+nvillage.payBill(nvillage.bill()));
}
}
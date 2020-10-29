class Mobile
{
void listMobiles()
{
System.out.println("1.vivo\n2.realme\n3.redmi\n4.oppo");
}
Void takeMobile(String order)
{
System.out.println("mobile ordered is"+order);
}
String giveMobile()
{
return "realme";
}
int bill()
{

return 300000;
}
String payBill(int amount)
{
System.out.println("the bill amount"+amount);
return "paid";
}
}
class Mobiles
{
public static void main(String args[])
{
Mobile m=new Mobile();
m.listMobiles();
m.takeMobile("realme");
System.out.println("Mobile given is:"+m.giveMobile());
System.out.println("Bill amount is:"+m.bill());
System.out.println("is"+m.payBill(m.bill()));
}
}
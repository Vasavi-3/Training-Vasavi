class Bsnl
{
 void menu()
{
System.out.println("1.sony\n2.samsung\n3.oppo\n4.realme");
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
public class MobileOverloading
{
public static void main(String args[])
{
Bsnl v=new Bsnl();
v.menu();
v.takeOrder("oppo","sony");
v.takeOrder("sony","samsung","realme");
}
}
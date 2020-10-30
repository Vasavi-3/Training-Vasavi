class Car
{ 
String model="vasu;
int accno=887898;
public void details()
{
System.out.println("accname:"+accname+"accno:"+accno);
}
}
class Deposit extends Bank
{
double bal=100;
public void depamt()
{
System.out.println("deposit amt"+bal);
}
}
class Withdrawl extends Deposit
{
double amt=200;
public void withamt()
{
if(amt>bal)
{
System.out.println("uh cannot withdraw balance");
}
else
{
System.out.println("collect amount");
}
}
}
public class CustomerInheritance
{
public static void main(String args[])
{
Withdrawl d1=new Withdrawl();
d1.details();
d1.depamt();
d1.withamt();
}
}

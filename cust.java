class Bank
{ 
String accname="vasu";
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
public class cust
{
public static void main(String args[])
{
Deposit d1=new Deposit();
d1.details();
d1.depamt();
}
}

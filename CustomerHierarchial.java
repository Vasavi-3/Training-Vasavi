class Bank
{ 
String accname="vasu";
int accno=887898;
double avabal=100;
public void details()
{
System.out.println("accname:"+accname+"accno:"+accno);
}
}
class Deposit extends Bank
{
double depamt=100;
public void depamt()
{
System.out.println("deposit amt is:"+depamt);
avabal=avabal+depamt;
System.out.println("total avabal is:"+avabal);
}
}
class Withdrawl extends Bank
{
double amt=200;
public void withamt()
{
System.out.println("u cannot withdraw balance");
}
}
public class customerHierarchial
{
public static void main(String args[])
{
System.out.println("deposit process");
{
Deposit s1=new Deposit();
w1.details();
s1.depamt();
System.out.println("withdrawl process");
s2.details();
s2.withamt();
}
}
}
}

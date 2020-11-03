class Bank
{
static class Atm
{
void deposit()
{
System.out.println("amount deposited is 500");
}
Static void avabal()
{
System.out.println("ava bal is 10000");
}
}
}
class Static
{
public static void main(String args[])
{
Bank.Atm hdfc=new Bank.Atm();
hdfc.deposit();
Bank.Atm.avabal();
}
}
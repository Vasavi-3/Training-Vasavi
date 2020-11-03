class Bank
{
void deposit()
{
System.out.println("deposit amount 1000");
}
class Atm
{
void avabal()
{
System.out.println("avalaible bal is 5000");
}
}
}
class NestedClass
{
public static void main(String args[])
{
Bank sbi=new Bank();
sbi.deposit();
Bank.Atm hdfc=sbi.new Atm();
hdfc.avabal();
}
}

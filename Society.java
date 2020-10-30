class Parents
{
public void gold()
{
System.out.println("5000kg");
}
public void marriage()
{
System.out.println("sweety");
}
}
class Son extends Parents
{
public void marriage()
{
System.out.println("fruity");
}
public class Society
{
public static void main(String args[])
{
Parents p=new Parents();
p.marriage();
p.gold();
Son s1=new Son();
s1.marriage();
s1.gold();
Parents p1=new Son();
p1.gold();
p1.marriage();
}
}
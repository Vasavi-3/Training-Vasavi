public class Loop3
{
public static void main(String args[])
{
int n=345,x=0,rem;
while(n>0)
{
rem=n%10;
x=x+rem;
n=n/10;
}
System.out.println(n);
}
}
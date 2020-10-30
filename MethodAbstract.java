abstract class Sum
{
public abstract  int SumOfTwo(int a,int b);
public abstract int SumOfThree(int a,int b,int c)
{
public void disp()
{
System.out.println("method of class sum");
}
}
class Demo extends Sum
{
public int SumOfTwo(int a,int b);
{
return a+b;
}
public int SumOfThree(int a,int b,int c)
{
return a+b+c;
}
}
public class MethodAbstract
{
public static void main(String args[])
{
Sum a1=new Demo();
System.out.println(a1.SumOfTwo(5,8));
system.out.println(a1.SumOfThree(4,3,9));
a1.disp();
}
}
class Employee
{ 
float salary=40000;
public void dispSalary()
{
System.out.println("the employee salary is:"+salary);
}
}
class PermanentEmp extends Employee
{
double hike=0.5;
public void incrementSalary()
{
System.out.println("the permanent employee incremented salary is:"+(salary+(salary*hike)));
}
}
class TemporaryEmp extends Employee
{
double hike=200.05;
public void incrementSalary()
{
System.out.println("the temporary employee incremented salary is:"+(salary+(salary*hike)));
}
}
public class HerInheritanceDemo
{
public static void main(String args[])
{
PermanentEmp p=new PermanentEmp();
TemporaryEmp t=new TemporaryEmp();
p.dispSalary();
p.incrementSalary();
t.dispSalary();
t.incrementSalary();
}
}
import java.util.Scanner;
class Employee
{
int salary;
String experience;
String designation;
int id;
int age;
static String companyname;
static String ename;
String address;
}
public class EmployeeScanner
{
public static void main(String args[])
{
Employee e=new Employee();
Scanner sc=new Scanner(System.in);
e.salary=sc.nextInt();
e.experience=sc.next();
e.designation=sc.next();
e.id=sc.nextInt();
e.age=sc.nextInt();
e.address=sc.next();
Employee. companyname=sc.next();
Employee.ename=sc.next();
System.out.println("salary="+e.salary);
System.out.println("designation="+e.designation);
System.out.println("id="+e.id);
System.out.println("age="+e.id);
System.out.println("experience="+e.experience);
System.out.println("companyname="+Employee.companyname);
System.out.println("ename="+Employee.ename);
System.out.println("address="+e.address);
}
}


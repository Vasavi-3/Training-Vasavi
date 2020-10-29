import java.util.Scanner;
class Student
{
int id;
float percentage;
int age;
float height;
String address;
static String college ;
static String subject;
}
public class StudentScanner
{
public static void main(String args[])
{
Student e=new Student();
Scanner sc=new Scanner(System.in);
e.id=sc.nextInt();
e.percentage=sc.nextFloat();
e.age=sc.nextInt();
e.height=sc.nextFloat();
e.address=sc.next();
Student.college=sc.next();
Student.subject=sc.next();
System.out.println("====Student Details=====");
System.out.println("id="+e.id);
System.out.println("percentage="+e.percentage);
System.out.println("age="+e.age);
System.out.println("height="+e.height);
System.out.println("address="+e.address);
System.out.println("college="+Student.college);
System.out.println("subject="+Student.subject);
}
}


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
class variabel
{
public static void main(String args[])
{
Employee e=new Employee();
e.salary=30000;
e.experience="fresher";
e.designation="QA";
e.id=532;
e.age=22;
e.address="hydearbd";
Employee. companyname="jnit";
Employee.ename="vasavi";
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


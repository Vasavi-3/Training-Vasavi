class Employee
{
int empid;
int salary;
String empDesignation;
String empname;
String address;
String companyName;
Employee(int empid,int salary,String empDesignation,String empname,String address,String companyName)

{
this.empid=empid;
this.salry=salary
this.empDesignation=empDesignation;
this.empname=empname;
this.address=address;
this.companyname=companyname;
}
void display()
{
System.out.println("Employee id="+empid);
System.out.println("Employee sal="+salary);
System.out.println("Employee Designation="+empDesignation);
System.out.println("Employee name="+empname);
System.out.println("Employee address="+address);
System.out.println("Employee company name="+companyName);
}
}
public class EmployeConstructor
{
public static void main String args[])
{
Employee vasu=new Employee();
vasu.display();
}
}



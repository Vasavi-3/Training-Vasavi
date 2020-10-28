class Student
{
int marks;
int student_id;
static String clg;
}
class Employee
{
int employee_id;
int employee_sal;
static String company_name;
}
class Variable
{
public static void main(String args[])
{
Student vasavi=new Student();
vasavi.student_id=530;
vasavi.marks=100;
Student.clg="sphoorthy";
System.out.println("======Student details======");
System.out.println("student_id="+vasavi.student_id);
System.out.println("marks="+vasavi.marks);
System.out.println("clg="+Student.clg);
Employee e=new Employee();
e.employee_id=201;
e.employee_sal=40000;
Employee.company_name="sphoorthy";
System.out.println("====Employee Details");
System.out.println("employee_id="+e.employee_id);
System.out.println("employee_sal="+e.employee_sal);
System.out.println("company_name="+Employee.company_name);
}
}


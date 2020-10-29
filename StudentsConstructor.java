class Student
{
int id;
int age;
String clg;
String name;
int percentage;
Student()
{
id=532;
age=22;
clg="sphn";
name="vasu";
percentage=90;
}
void displayStudentDetails()
{
System.out.println("student id="+id);
System.out.println("student age="+age);
System.out.println("student clg="+clg);
System.out.println("student name="+name);
System.out.println("student percentage="+percentage);
}
}
class StudentsConstructor
{
public static void main(String args[])
{
Studentvasu=new Student();
vasu.displayStudentDetails();
}
}



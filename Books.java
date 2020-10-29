import java.util.Scanner;
class Book
{
float bookprice;
int bookpages;
char bookrating;
String title;
String booksize;
static String bookname;
}
class Books
{
public static void main(String args[])
{
Book b1=new Book();
Scanner sc=new Scanner(System.in);
System.out.println("enterbook details");
b1.bookpages=sc.nextInt();
b1.bookprice=sc.nextFloat();
b1.bookrating=sc.nextChar();
b1.title=sc.nextString();
b1.booksize=sc.nextString();
Book.bookname=sc.next();
System.out.println("=====enter book details====");
System.out.println("bookpages="+b1.bookpages);
System.out.println("bookprice ="+b1.bookprice);
System.out.println("bookrating ="+b1.bookrating);
System.out.println("title="+b1.title);
System.out.println("booksize="+b1.booksize);
System.out.println("bookname="+Book.bookname);
}
}

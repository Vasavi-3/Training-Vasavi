class Book
{
float bookprice;
int bookpages;
char bookrating;
String title;
String booksize;
long isbn;
static String bookname;
static String author;
}
public class Books
{
public static void main(String args[])
{
Book b1=new Book();
b1.bookpages=600;
b1.bookprice=500.2f;
b1.bookrating='A';
b1.title="autobiography";
b1.booksize="5x8";
b1.isbn=97831614810l;
Book.bookname="Harrypotter";
Book.author="Rowling";
System.out.println("bookpages="+b1.bookpages);
System.out.println("bookprice ="+b1.bookprice);
System.out.println("bookrating ="+b1.bookrating);
System.out.println("title="+b1.title);
System.out.println("booksize="+b1.booksize);
System.out.println("isbn="+b1.isbn);
System.out.println("bookname="+Book.bookname);
System.out.println("author="+Book.author);
}
}

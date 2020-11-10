public class BufferedReader
{
public static void main(String args[])
{
FileReader f=new FileReader("c:\\vasavi.txt");
BufferedReader b=new BufferedReader(f);
int i;
while(i=b.read())!=-1)
{
System.out.print((char)i);
}
b.close();
f.close();
}
}
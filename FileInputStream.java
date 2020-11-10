public class FileInputStream
{
public static void main(String args[])
{
FileInputStream f=new FileInputStream("c:\\vasavi.txt");
BufferedInputStream b=new BufferedInputStream(f);
int i=b.read();
while(i!=-1)
{
System.out.print((char)i);
i=b.read();
}
}
}


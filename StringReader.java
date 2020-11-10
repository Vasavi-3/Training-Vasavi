public class StringReader
{
public static void main(String args[])throws Exception
{
String str="hyderabad!!\nWelcome to hyderabad.";
StringReader reader=new StringReader(str);
int k=0;
while((k=reader.read())!=-1)
{
System.out.println((char)k);
}
}
}



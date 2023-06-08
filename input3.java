import java.io.*;
class input3
{
public static void main(String args[])throws IOException
{
InputStreamReader I =new InputStreamReader(System.in);
BufferedReader B =new BufferedReader(I);
int n = Integer.parseInt(B.readLine());
int m = Integer.parseInt(B.readLine());
System.out.println (n*m);
}
}
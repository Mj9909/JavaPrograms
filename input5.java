import java.io.*;
class input5
{
public static void main(String args[])throws IOException
{
DataInputStream D =new DataInputStream(System.in);
int n = Integer.parseInt(D.readLine());
int m = Integer.parseInt(D.readLine());
System.out.println (n*m);
}
}

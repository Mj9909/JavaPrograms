import java.util.*;
import java.io.*;
class highest
{
int n;
int m;
int k;
int high;

highest()
{
m=0;
n=0;
k=0;
high=0;
}

void input ()
{
Scanner sn =new Scanner (System.in);
System.out.println("Enter Values ");
m=sn.nextInt();
n=sn.nextInt();
k=sn.nextInt();
}
void getHighest()
{
if (m>n&&m>k)
high=m;
else if (m<n&&n>k)
high=n;
else
high=k;
}
void display()
{
System.out.println(m+""+n+""+k);
System.out.println("The highest of the three numbers is "+ high);
}
public static void main(String args[])
{
highest h= new highest();
h.input();
h.getHighest();
h.display();
}
}
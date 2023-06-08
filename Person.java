import java.util.*;
class Person
{
String name;
int age;
String address;
Person()
{
name="";
address="";
age=0;
}
void input()
{
Scanner sn = new Scanner(System.in);
System.out.println ("Enter name= ");
name=sn.nextLine();
System.out.println ("Enter Address= ");
address=sn.nextLine();
System.out.println ("Enter Age= ");
age=sn.nextInt();
}
void display()
{
System.out.println ("Name= "+name);
System.out.println ("Address= "+address);
System.out.println ("Age= "+age);
}
public static void main(String args[])
{
Person p= new Person();

p.input();
p.display();
}
}

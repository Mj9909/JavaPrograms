import java.io.*;
import java.util.*;
class Employee
{
int eid;
String name ;
int age ;
String address;
double salary;
double tax;
Employee()
{
Scanner sn = new Scanner(System.in);

name= sn.nextLine();
address=sn.nextLine();
eid=sn.nextInt();

age =sn.nextInt();

salary=sn.nextDouble();
tax=0	;
}
void calculate()
{
if (salary<50000)
tax=0;
else if (salary>50000 && salary<75000)
tax=(0.05 * salary);
else if (salary>75000 && salary<100000)
tax=(0.1 * salary);
else if (salary>100000 )
tax=(0.2 * salary);
}

public String toString()
{
return "\nName= "+name+"\nID= "+ eid+"\nAddress= "+address+"\nAge= " +age+"\nSalary= "+salary+"\nCalculated Tax= "+tax;
}
public static void main(String args[])throws IOException
{
Employee e =new Employee();
e.calculate();

System.out.println(""+ e);
}
}






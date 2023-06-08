import java.util.*;
class Student extends Person
{
int rollno;
int m1;
int m2;
int m3;
double percent;
String grade;
Student()
{
rollno=0;
m1=0;
m2=0;
m3=0;
percent=0.0;
grade="";
}
void accept()
{
input();
Scanner sn = new Scanner(System.in);
System.out.println("Enter Roll Number=");
rollno=sn.nextInt();
System.out.println("Enter marks out of 100 for 3 subjects");
m1=sn.nextInt();
m2=sn.nextInt();
m3=sn.nextInt();
}
void Calculate()
{
percent=((m1+m2+m3)/3);
}
void getGrade()
{
if(percent>=90)
grade="A+";
else if (percent>=80)
grade="A";
else if (percent>=70)
grade="B+";
else if (percent>=60)
grade="B";
else if(percent>=50)
grade="C+";
else if (percent>=40)
grade="C";
else if(percent<40)
grade="D";
}
void display()
{
System.out.println("The name of the Student is   "+ name);
System.out.println("The Age of the Student is    "+ age);
System.out.println("The Address of the Student is   "+ address);
System.out.println("The Roll Number of the Student is   "+ rollno);
System.out.println("The Marks of the Student in three subjects are   "+m1+" "+m2+" "+m3);
System.out.println("The Calculated Percentage of the Student is   "+ percent);
System.out.println("The Grade Aqquired by the Student is    "+ grade);
}
public static void main( String args[])
{
Student s =new Student();
s.accept();
s.Calculate();
s.getGrade();
s.display();
}
}

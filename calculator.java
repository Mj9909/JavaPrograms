package ssd;
import java.util.*;
class calculater {
	
	
public	static void main(String[] args)
	{
	Scanner sn=new Scanner(System.in);
	System.out.println("enter the qution to be calculated but use only + or - or * or /");
	String str=sn.nextLine();
	str.trim();
	String no="";
	int no1=0;
	int sim=00;
	int r=0;
	double sum=00,sum1=00;
	if(str.lastIndexOf("+")>str.lastIndexOf("-")&&str.lastIndexOf("+")>str.lastIndexOf("*")&&str.lastIndexOf("+")>str.lastIndexOf("/"))
	str=str+"+1";
	if(str.lastIndexOf("-")>str.lastIndexOf("+")&&str.lastIndexOf("-")>str.lastIndexOf("*")&&str.lastIndexOf("-")>str.lastIndexOf("/"))
	str=str+"-1";
	if(str.lastIndexOf("*")>str.lastIndexOf("-")&&str.lastIndexOf("*")>str.lastIndexOf("+")&&str.lastIndexOf("*")>str.lastIndexOf("/"))
	str=str+"*1";
	if(str.lastIndexOf("/")>str.lastIndexOf("-")&&str.lastIndexOf("/")>str.lastIndexOf("*")&&str.lastIndexOf("/")>str.lastIndexOf("+"))
	str=str+"/1";
	int add=str.indexOf("+");
	int sub=str.indexOf("-");
	int mul=str.indexOf("*");
	int div=str.indexOf("/");
	if(add==-1)
	{
	if(sub>=mul&&sub>=div)
	add=sub+2;
	if(mul>=sub&&mul>=div)
	add=mul+2;
	if(div>=mul&&div>=sub)
	add=div+2;
	}
	if(sub==-1)
	{
	if(add>=mul&&add>=div)
	sub=add+2;
	if(mul>=add&&mul>=div)
	sub=mul+2;
	if(div>=mul&&div>=add)
	sub=div+2;
	}
	if(mul==-1)
	{
	if(sub>=add&&sub>=div)
	mul=sub+2;
	if(add>=sub&&add>=div)
	mul=add+2;
	if(div>=add&&div>=sub)
	mul=div+2;
	}
	if(div==-1)
	{
	if(sub>=mul&&sub>=add)
	div=sub+2;
	if(mul>=sub&&mul>=add)
	div=mul+2;
	if(add>=mul&&add>=sub)
	div=add+2;
	}
	if(add<sub&&add<mul&&add<div){
	sum=Double.parseDouble(str.substring(0,(str.indexOf("+"))));r=str.indexOf("+");}
	if(sub<add&&sub<mul&&sub<div){
	sum=Double.parseDouble(str.substring(0,(str.indexOf("-"))));r=str.indexOf("-");}
	if(mul<sub&&mul<add&&mul<div){
	sum=Double.parseDouble(str.substring(0,(str.indexOf("*"))));r=str.indexOf("*");}
	if(div<sub&&div<mul&&div<add){
	sum=Double.parseDouble(str.substring(0,(str.indexOf("/"))));r=str.indexOf("/");}

	int c=0;
	for(int i=r;i<str.length();i++)
	{
	if(str.substring(i,i+1).equals("+")==false&&str.substring(i,i+1).equals("*")==false&&str.substring(i,i+1).equals("-")==false&&str.substring(i,i+1).equals("/")==false)
	{no=no+str.substring(i,i+1);

	if(i<str.length()-1)
	if(str.substring(i+1,i+2).equals("+")==true||str.substring(i+1,i+2).equals("-")==true||str.substring(i+1,i+2).equals("*")==true||str.substring(i+1,i+2).equals("/")==true)
	{no.trim();
	    no1=Integer.parseInt(no);
	    no="";
	}
	}
	if(str.substring(i,i+1).equals("+")==true){
	sum=sum+no1;c++;}
	if(str.substring(i,i+1).equals("*")==true) {
	if(c==0)
	no1=1;
	else
	    sum=sum*no1;
	c++;}
	if(str.substring(i,i+1).equals("-")==true){
	sum=sum-no1;c++;}
	if(str.substring(i,i+1).equals("/")==true){
	if(c==0)
	no1=1;
	else
	    sum=sum/no1;
	c++;}
	}
	System.out.println(sum);
	}
	}


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class AddSub extends JFrame
{
AddSub()
{
setLayout(new FlowLayout());
setSize(100,400);
JLabel l1= new JLabel ("Input Number");
JLabel l2= new JLabel ("Input Number");
JLabel l4= new JLabel ("Input Number");
JTextField t1= new JTextField (10);
JTextField t2= new JTextField (10);
JTextField t3= new JTextField (10);
JButton A= new JButton("ADD");
JButton M= new JButton("MULTIPLY");
JButton H= new JButton("HIGHEST");
JButton S= new JButton("SMALLEST");
JButton C= new JButton("CLEAR");
JLabel l3= new JLabel ("");
add(l1);
add(t1);
add(l2);
add(t2);
add(l4);
add(t3);
add(A);
add(M);
add(H);add(S);add(C);

add(l3);
A.addActionListener( new ActionListener(){
public void actionPerformed(ActionEvent evt)
{
int a=Integer.parseInt(""+t1.getText());
int b=Integer.parseInt(""+t2.getText());
int c=Integer.parseInt(""+t3.getText());
int sum=a+b+c;
l3.setText(""+sum);
}}
);
M.addActionListener( new ActionListener(){
public void actionPerformed(ActionEvent evt)
{
int a=Integer.parseInt(""+t1.getText());
int b=Integer.parseInt(""+t2.getText());
int c=Integer.parseInt(""+t3.getText());
int pro=a*b*c;
l3.setText(""+pro);
}}
);

H.addActionListener( new ActionListener(){
public void actionPerformed(ActionEvent evt)
{
int a=Integer.parseInt(""+t1.getText());
int b=Integer.parseInt(""+t2.getText());
int c=Integer.parseInt(""+t3.getText());
int high;
if(a>b&&a>c)
high=a;
else if(a<b&&b>c)
high=b;
else 
high=c;
l3.setText(""+high);
}}
);
S.addActionListener( new ActionListener(){
public void actionPerformed(ActionEvent evt)
{
int a=Integer.parseInt(""+t1.getText());
int b=Integer.parseInt(""+t2.getText());
int c=Integer.parseInt(""+t3.getText());
int small;
if(a<b&&a<c)
small=a;
else if(a>b&&b<c)
small=b;
else 
small=c;
l3.setText(""+small);
}}
);
C.addActionListener( new ActionListener(){
public void actionPerformed(ActionEvent evt)
{

t1.setText("");
t2.setText("");
t3.setText("");
l3.setText("");

}}
);





}
public static void main( String args[])
{
AddSub A =new AddSub();
A.setVisible(true);
}
}
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Jour extends JFrame
{
Jour()
{
setLayout(new FlowLayout());
setSize(100,400);
JLabel l1= new JLabel ("Input Number");
JLabel l2= new JLabel ("Input Number");
JTextField t1= new JTextField (10);
JTextField t2= new JTextField (10);
JButton b= new JButton("ADD");
JLabel l3= new JLabel ("");
add(l1);
add(t1);
add(l2);
add(t2);
add(b);
add(l3);
b.addActionListener( new ActionListener(){
public void actionPerformed(ActionEvent evt)
{
int a=Integer.parseInt(""+t1.getText());
int b=Integer.parseInt(""+t2.getText());
int c=a+b;
l3.setText(""+c);
}}
);


}
public static void main( String args[])
{
Jour o =new Jour();
o.setVisible(true);
}
}
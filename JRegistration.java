import java.awt.*;
import javax.swing.*;
class JRegistration extends JFrame
{
JRegistration()
{
setLayout(new FlowLayout());
JLabel l1= new JLabel ("ID");
JLabel l2= new JLabel ("Name");
JLabel l3= new JLabel ("Age");
JLabel l4= new JLabel ("Address");
JLabel l5= new JLabel ("Course");
JLabel l6= new JLabel ("Contact");
JLabel l7= new JLabel ("Email");
JTextField t1= new JTextField (10);
JTextField t2= new JTextField (10);
JTextField t3= new JTextField (10);
JTextField t4= new JTextField (10);
JTextField t5= new JTextField (10);
JTextField t6= new JTextField (10);
JTextField t7= new JTextField (10);
JButton b= new JButton("ADD");
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(t4);
add(l5);
add(t5);
add(l6);
add(t6);
add(l7);
add(t7);
add(b);
setSize(200,600);
}
public static void main( String args[])
{
JRegistration R=new JRegistration();
R.setVisible(true);
}
}

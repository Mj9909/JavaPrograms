import java.awt.*;
class Registration extends Frame
{
Registration()
{
setLayout(new FlowLayout());
Label l1= new Label ("ID");
Label l2= new Label ("Name");
Label l3= new Label ("Age");
Label l4= new Label ("Address");
Label l5= new Label ("Course");
Label l6= new Label ("Contact");
Label l7= new Label ("Email");
TextField t1= new TextField (10);
TextField t2= new TextField (10);
TextField t3= new TextField (10);
TextField t4= new TextField (10);
TextField t5= new TextField (10);
TextField t6= new TextField (10);
TextField t7= new TextField (10);
Button b= new Button("ADD");
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
Registration R=new Registration();
R.setVisible(true);
}
}

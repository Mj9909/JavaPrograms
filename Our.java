import java.awt.*;
class Our extends Frame
{
Our()
{
setLayout(new FlowLayout());
Label l1= new Label ("Input Number");
Label l2= new Label ("Input Age");
TextField t1= new TextField (10);
TextField t2= new TextField (10);
Button b= new Button("ADD");
add(l1);
add(t1);
add(l2);
add(t2);
add(b);
setSize(100,400);
}
public static void main( String args[])
{
Our o =new Our();
o.setVisible(true);
}
}
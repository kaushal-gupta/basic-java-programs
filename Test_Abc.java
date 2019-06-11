import javax.swing.*;

class Abc
{
Abc()
{
JFrame jf=new JFrame("My First Frame Window");
jf.setSize(700,700);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setLayout(new FlowLayout());
JLabel l1=new JLabel("enter your name");
JTextField tf1=new JTextField();
JLabel l2=new JLabel("enter your age");
JTextField tf2=new JTextField();
jf.add(l1);
jf.add(l2);
jf.add(tf1);
jf.add(tf2);

jf.setVisible(true);
}
}
class Test_Abc
{
public static void main(String[] args)
{
Abc p=new Abc();
}
}

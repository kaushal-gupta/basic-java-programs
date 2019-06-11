import javax.swing.*;

class SwingExample
{
SwingExample()
{
JFrame frm=new JFrame("my frame window");
frm.setSize(500,500);
frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel l1=new JLabel("click here");
l1.setBounds(10,10,100,100);
JButton btn1=new JButton("click");
btn1.setBounds(100,100,100,100);
JTextField tf1=new JTextField();
tf1.setBounds(200,200,100,100);


frm.add(l1);
frm.add(btn1);
frm.add(tf1);
frm.setLayout(null);
frm.setVisible(true);
}
}
class Test_SwingExample
{
public static void main(String[] args)
{
SwingExample p=new SwingExample();
}
}

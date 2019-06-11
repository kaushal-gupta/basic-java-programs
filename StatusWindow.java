import java.awt.*;
import java.applet.*;
 /* <applet code ="StatusWindow" width= 1000 height=500>
 </applet>
*/

public class StatusWindow extends Applet
{
 public void init()
{ 
 setBackground(Color.pink);
 setForeground(Color.yellow);
}
public void paint(Graphics g)
{
 g.drawString("this is in the Applet Window",50,50);
 showStatus("this is in the Status Window");
}
}

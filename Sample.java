import java.awt.*;
import java.applet.*;
 /*
<applet code="Sample" width=1000 height=500>
</applet>
*/
 public class Sample extends Applet
{
  String msg="";
   public void init()
 {
  setBackground(Color.magenta);
  setForeground(Color.yellow);
  msg="Inside The init()--";
 }
 
public void start()
{
 msg+="Inside the start() --";
}
  
   public void paint(Graphics g)
  {
   msg+="Inside The Paint().";
   g.drawString(msg,30,30);
  }
}

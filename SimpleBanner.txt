import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleBanner" widht=500 hieght=500>
</applet>
*/
public class SimpleBanner extends Applet implements Runnable 
{
 String msg="A simple Moving banner";
 Thread t;
 int state;
 boolean stopflag;
   public void init()
  {
  setBackground(Color.cyan);
  setForeground(Color.red);
  }
  
  public void start()
{
 t=new Thread(this);
 stopFlag=false;
 t.start();
 }
public void run()
{
 char ch;
 for(; ;)
 {
  try
{
 repaint();
 Thread.sleep(250);
 ch=msg.charAt(0);
msg=msg.substring(1,msg.lenght());
msg+=ch;
if(stopFlag)
break;
}
catch(Exception p)
{}
}
}
public void stop()
{
stopFlag=true;
t=null;
}
public void paint(Grapics g)
{
g.drawString(msg,50,50);
}
}

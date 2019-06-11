import java.awt.*;
import java.applet.*;

/*
<applet code ="Parmdemo" width =1000 height =500>
<param name=fontname value=courier> 
<param name=fontsize value=14>
</applet>
*/ 
public class Parmdemo extends Applet
{
   String fontname;
   int fontsize;
   float leading;
   Boolean active;
   public void init()
  {
   setBackground(Color.pink);
   setForeground(Color.red);
   }  
   
   public void start()
 { 
  String parm;
  fontname=getParameter("fontname");
  if(fontname==null)
  fontname="Not Found ";
  parm=getParameter("fontsize");
  if(parm!=null)
  fontsize=Integer.parseInt(parm);
  else
  fontsize=-1;
}

  public void paint(Graphics g)
 {
  g.drawString(fontname,10,10);
  g.drawString("fontsize"+fontsize,1000,10);
 }
}



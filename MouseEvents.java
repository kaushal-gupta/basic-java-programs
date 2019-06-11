import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 
 /*
 <applet code= "MouseEvents" width=1000 height=500>
 </applet>
*/
public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
 int mouseX=0,mouseY=0;
 String msg="";
 
   public void init()
  {
   addMouseListener(this);
   addMouseMotionListener(this);
  }
 
  public void mouseClicked(MouseEvent me)
 {
  mouseX=0;
  mouseY=0;
  msg ="Mouse Entered";
  repaint();
 }
 
  public void mouseExited(MouseEvent me)
 {
  mouseX=0;
  mouseY=0;
  msg="Mouse Exited";
  repaint();
 }

  public void mousePressed(MouseEvent me)
 {
  mouseX= me.getX();
  mouseY=me.getY();
  msg="Down";
  repaint();
  }
 
  public void mouseReleased(MouseEvent me)
 {
  mouseX=me.getX();
  mouseY=me.getY();
  msg="up";
  repaint();
 }
 
  public void mouseDragged(MouseEvent me)
 {
 mouseX=me.getX();
 mouseY=me.getY();
 showStatus("Dragged mouse at"+mouseX+","+mouseY);
 repaint();
 }
  public void mouseMoved(MouseEvent me)
 {
  showStatus("Moving Mouse At"+me.getX()+me.getY());
 }
public void mouseEntered(MouseEvent t)
{
}
  public void paint(Graphics g)
 {
  g.drawString(msg,mouseX,mouseY);
 }
}

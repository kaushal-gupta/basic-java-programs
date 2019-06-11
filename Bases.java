import java.awt.*;
import java.applet.*;
import java.net.*;
 /*
<applet code="Bases" width=1000 height=500>
 </applet>                                                                                                                                                                                                              
*/  
 public class Bases extends Applet
{
 public void paint(Graphics g)
{
 URL url=getCodeBase();
 String msg="code base" +url.toString();
 g.drawString(msg,50,50);
 url=getDocumentBase();
 msg="document base"+url.toString();
 g.drawString(msg,60,60);

}
}

import java.awt.*;
import javax.swing.*;
/*
<applet code="Swingexample" width=250 height=150>
</applet>
*/
public class Swingexample extends JApplet {
public void init() {
try {
SwingUtilities.invokeAndWait(
new Runnable() {
public void run() {
makeGUI();
}
}
);
} catch (Exception exc) {
System.out.println("Can't create because of " + exc);
}
}
private void makeGUI() {
// Create an icon.
//ImageIcon ii = new ImageIcon("france.gif");
// Create a label.
JLabel jl = new JLabel("France", JLabel.CENTER);
// Add the label to the content pane.
JButton jk=new JButton("ok");
add(jl);
add(jk);
}
}
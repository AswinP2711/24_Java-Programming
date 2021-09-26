import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code=Mouse width=600 height=500>
</applet>
*/

public class Mouse extends Applet implements MouseListener, MouseMotionListener {
  int x = 30, y = 30;
  String msg = "Mouse Events";
  public void init() {
    addMouseListener(this);
    addMouseMotionListener(this);
    setBackground(Color.black);
    setForeground(Color.white);
  }
  public void mouseEntered(MouseEvent me) {
    setBackground(Color.cyan);
    repaint();
  }
  public void mouseExited(MouseEvent me) {
    msg = "MOUSE EXITED";
    setBackground(Color.black);
    showStatus("Mouse Exited");
    repaint();
  }
  public void mousePressed(MouseEvent me) {
    msg = "MOUSE PRESSED";
    setBackground(Color.yellow);
    showStatus("Mouse Pressed");
    repaint();
  }
  public void mouseReleased(MouseEvent me) {
    msg = "MOUSE RELEASED";
    setBackground(Color.green);
    showStatus("Mouse Released");
    repaint();
  }
  public void mouseClicked(MouseEvent me) {
    showStatus("Mouse Clicked");
    repaint();
  }
  public void mouseMoved(MouseEvent me) {
    msg = "MOUSE MOVED";
    x = me.getX();
    y = me.getY();
    showStatus("Mouse Moved");
    repaint();
  }
  public void mouseDragged(MouseEvent me) {
    msg = "MOUSE DRAGGED";
    setBackground(Color.pink);
    showStatus("Mouse Dragged(" + me.getX() + "," + me.getY() + ")");
    repaint();
  }
  public void paint(Graphics g) {
    g.drawString(msg, x, y);
  }
}
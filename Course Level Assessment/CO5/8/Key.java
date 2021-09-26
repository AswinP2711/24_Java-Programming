import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code=Key width=300 height=400>
</applet>
*/
public class Key extends Applet implements KeyListener{
	String msg="";
	int X=30,Y=50;
	public void init(){
		addKeyListener(this);
		setBackground(Color.yellow);
		setForeground(Color.black);
	}
	public void keyPressed(KeyEvent ke){
		showStatus("key down");
	}
	public void keyReleased(KeyEvent ke){
		showStatus("key up");
	}
	public void keyTyped(KeyEvent ke){
		msg+=ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg,X,Y);
	}
}
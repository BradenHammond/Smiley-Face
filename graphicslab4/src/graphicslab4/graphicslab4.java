package graphicslab4;
import java.awt.*;
import java.applet.*;
public class graphicslab4 extends Applet {
	public void paint(Graphics g)
	{
		SunFace sun=new SunFace(g);
	}

}

class SunFace extends Sun
{
	private Face f;
	
	public SunFace(Graphics g)
	{
		super(g);
		
	f=new Face(g);
	}
}
class Sun
{
	public Sun(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(400, 400, 200, 200);
	}
	
	
	
}
class Face
{
	public Face(Graphics g)
	{
		drawEyes(g);
		drawMouth(g);
		
	}
	public void drawEyes(Graphics g)
	{
		g.setColor(Color.black);
		g.fillOval(450, 450, 50, 50);
		g.fillOval(500, 450, 50, 50);
	}
	public void drawMouth(Graphics g)
	{
		g.drawArc(450,450, 100, 100,180, 180);

	}
	

}

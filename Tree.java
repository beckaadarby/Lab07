import java.awt.*;
import java.applet.*;

public class Tree{

  public static void drawTrunk(Graphics g)
  {
    g.setColor(new Color(100,40,5));
    g.fillRect(75,285,50,315);
  }

  public static void drawLeaves(Graphics g)
  {
    g.setColor(new Color(26,171,10));
    g.fillOval(50,240,90,90);
    Polygon leaf1 = new Polygon();
		leaf1.addPoint(90,250);
		leaf1.addPoint(200,230);
		leaf1.addPoint(260,260);
    g.fillPolygon(leaf1);
  }


}

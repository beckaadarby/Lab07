import java.awt.*;
import java.applet.*;

public class Ball{


  public static void drawColors(Graphics g)
  {
    g.setColor(new Color(200,60,147));
    g.fillArc(700,600,100,100,0,60);
    g.fillArc(700,600,100,100,180,240);
    g.setColor(new Color(42,178,248));
    g.fillArc(700,600,100,100,60,120);
    g.fillArc(700,600,100,100,240,300);
    g.setColor(new Color(103,67,124));
    g.fillArc(700,600,100,100,120,180);
    g.fillArc(700,600,100,100,300,360);
  }

  public static void drawCenter(Graphics g)
  {
    g.fillOval(740,640,20,20);
  }

  public static void drawOutline(Graphics g)
  {
    g.drawOval(700,600,100,100);
  }

}

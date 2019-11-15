import java.awt.*;
import java.applet.*;

public class Background{

  public static void drawSky(Graphics g)
  {
    g.setColor(new Color(95,202,219));
    g.fillRect(10,10,900,250);
  }

  public static void drawOcean(Graphics g)
  {
    g.setColor(new Color(37,247,247));
    g.fillRect(10,260,900,250);
  }

  public static void drawSand(Graphics g)
  {
    g.setColor(new Color(238,228,139));
    g.fillRect(10,510,900,250);
  }

  public static void drawClouds(Graphics g)
  {
    g.setColor(new Color(255,255,255));
    //most to the left
    g.fillOval(200,120,70,50);
    g.fillOval(225,100,50,50);
    g.fillOval(250,100,70,50);
    //bottom center
    g.fillOval(500,180,70,50);
    g.fillOval(525,160,50,50);
    g.fillOval(550,170,70,50);
    //top right
    g.fillOval(700,90,70,50);
    g.fillOval(725,70,50,50);
    g.fillOval(750,90,70,50);
  }

  public static void drawSun(Graphics g)
  {
    g.setColor(new Color(252,228,15));
    g.fillOval(50,30,100,100);
  }

}

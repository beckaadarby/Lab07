// Lab07st.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab07st extends Applet
{

	public void paint(Graphics g)
	{
		Background.drawSky(g);
		Background.drawOcean(g);
		Background.drawSand(g);
		Background.drawClouds(g);
		Background.drawSun(g);
		Tree.drawTrunk(g);
		Tree.drawLeaves(g);
		Ball.drawColors(g);
		Ball.drawCenter(g);
		Ball.drawOutline(g);
	}
}

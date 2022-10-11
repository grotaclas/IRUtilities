package IRObjects;

import java.awt.Color;
import java.awt.geom.Point2D;


public class CoaEmblem {
	public String pattern;
	public Color[] colors;
	public double rotation;
	public Point2D.Double scale;
	public Point2D.Double position;
	public boolean[] mask; 
	
	public CoaEmblem(String pattern, Color[] colors, double rotation, Point2D.Double scale,
			Point2D.Double position, boolean[] mask) {
		this.pattern = pattern;
		this.colors = colors;
		this.rotation = rotation;
		this.scale = scale;
		this.position = position;
		this.mask = mask;
	}
}

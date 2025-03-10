package IRObjects;

import java.awt.Color;
import java.util.List;

import IRParser.ImperatorParser;


public class Coa extends ImpObject {
	public String pattern;
	public Color[] colors;
	public List<CoaEmblem> emblems;
	
	public Coa(String key) {
		super(key, ImperatorParser.localisation.get(key));
	}
	
	public Coa(String key, String name) {
		super(key, name);
	}
}

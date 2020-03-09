package creationaldesignpattern;

public class shapefactory {
	public shape getshape(String shapeType)
	{
		if(shapeType==null)
		{
			return null;
		}
		if(shapeType.equalsIgnoreCase("circle")) {
			return new circle();
		}
		    else if(shapeType.equalsIgnoreCase("square")) {
			return new square();
			
		}
		     else if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
			
		}
		return null; 
	}
}

package creationaldesignpattern;

public class colorfactory extends abstractfactory {
	public shape getshape(String shapeType)
	{
		return null;
		
	}
	color getcolor(String color) {
		if(color==null)
		{
			return null;
		}
		if(color.equalsIgnoreCase("red")) {
			return new red();
			
		}
		else if(color.equalsIgnoreCase("blue")) {
			return new blue();
			
		}
		else if(color.equalsIgnoreCase("green")) {
			return new green();
			
		}
		return null;}		
}

package creationaldesignpattern;

public class factoryproducer {
	public static abstractfactory getfactory(String choice) {
		
		if(choice.equalsIgnoreCase("shape")) {
			return new shapeabfactory();}
			else if(choice.equalsIgnoreCase("color")) {
				return new colorfactory();}
		return null;
		
	}

}

package creationaldesignpattern;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
	abstractfactory shapeabfactory= factoryproducer.getfactory("shape");
	shape shape1=shapeabfactory.getshape("circle");
	shape1.draw();
	shape shape2=shapeabfactory.getshape("rectangle");
	shape2.draw();
	shape shape3=shapeabfactory.getshape("square");
	shape3.draw();
	abstractfactory colorfactory=factoryproducer.getfactory("color");
	color color1=colorfactory.getcolor("red");
	color1.fill();
	color color2=colorfactory.getcolor("blue");
	color2.fill();
	color color3=colorfactory.getcolor("green");
	color3.fill();
}

}




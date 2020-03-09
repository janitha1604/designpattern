package creationaldesignpattern;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		shapefactory shapefactory= new shapefactory();
		shape shape1=shapefactory.getshape("circle");
		shape1.draw();
		shape shape2=shapefactory.getshape("rectangle");
		shape2.draw();
		shape shape3=shapefactory.getshape("square");
		shape3.draw();
	}

}

package creationaldesignpattern;

public class Singleton { 

	private static Singleton SingletonInstance;

private Singleton()
{
}
public static Singleton getSingletonInstance()
{
if(null==SingletonInstance) {
	SingletonInstance=new Singleton();
	System.out.println("inside null check,object is created:"+SingletonInstance.toString());
	System.out.println("---------------------------------------------------");
	
}
return SingletonInstance;
}
public void printSingleton()
{
	System.out.println("inside print singleton object:" +SingletonInstance.toString());
	System.out.println("");

}

}

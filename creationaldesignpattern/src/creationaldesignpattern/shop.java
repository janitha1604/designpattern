package creationaldesignpattern;

public class shop {
	public static void main(String[] args)
	{
		phone p=new phonebuilder().setOS("android").setBattery(30000).setRom(2).getphone();
		System.out.println(p);
	}

}

package creationaldesignpattern;
//builder pattern
public class phone {
	private String OS;
	private int rom;
	private String processor;
	private double screenSize;
	private int battery;
	public phone(String oS, int rom, String processor, double screenSize, int battery) {
		super();
		this.OS = oS;
		this.rom = rom;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	@Override
	public String toString() {
		return "phone [OS=" + OS + ", rom=" + rom + ", processor=" + processor + ", screenSize=" + screenSize
				+ ", battery=" + battery +" ]";
	}
	

}

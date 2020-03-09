package creationaldesignpattern;

public class phonebuilder {
	private String OS;
	private int rom;
	private String processor;
	private double screenSize;
	private int battery;
	public phonebuilder setOS(String oS) {
		OS = oS;
		return this;
	}
	public phonebuilder setRom(int rom) {
		this.rom = rom;
		return this;
	}
	public phonebuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public phonebuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public phonebuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
public phone getphone() {
	return new phone(OS,rom,processor,screenSize,battery);
}

}

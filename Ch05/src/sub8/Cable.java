package sub8;

public class Cable implements Socket {

	private Bulb buld;
	
	public Cable(Bulb buld) {
		this.buld = buld;
	}
	
	@Override
	public void switchOn() {
		buld.lightOn();
	}

	@Override
	public void switchOff() {
		buld.lightOff();
	}
	
}

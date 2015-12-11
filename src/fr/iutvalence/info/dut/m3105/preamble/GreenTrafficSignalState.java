package fr.iutvalence.info.dut.m3105.preamble;

public class GreenTrafficSignalState extends TrafficSignalStateAbstract{

	private final static int BUTTON_THRESHOLD_IN_SECONDS = 2;
	
	private static GreenTrafficSignalState INSTANCE = new GreenTrafficSignalState();
	
	private GreenTrafficSignalState() {
		duration = 10;
		remainingTime = duration;
	}
	
	public static GreenTrafficSignalState getInstance() {
		return INSTANCE;
	}

	@Override
	public void buttonPressed(TrafficSignal context) {
		if(remainingTime > BUTTON_THRESHOLD_IN_SECONDS)
			remainingTime = BUTTON_THRESHOLD_IN_SECONDS;
	}
	
	@Override
	public String toString() {
		return "Green";
	}

	@Override
	protected void setState() {
		nextState = OrangeTrafficSignalState.getInstance();
		
	}
	
	

}

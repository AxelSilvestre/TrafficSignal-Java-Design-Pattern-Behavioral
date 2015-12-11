package fr.iutvalence.info.dut.m3105.preamble;

public class GreenTrafficSignalState extends TrafficSignalStateAbstract{

	private final static int BUTTON_THRESHOLD_IN_SECONDS = 2;
		
	
	public GreenTrafficSignalState() {
		duration = 10;
		nextState = OrangeTrafficSignalState.class;
	}	

	@Override
	public void buttonPressed(TrafficSignal context) {
		if(duration > BUTTON_THRESHOLD_IN_SECONDS)
			duration = BUTTON_THRESHOLD_IN_SECONDS;
	}
	
	@Override
	public String toString() {
		return "Green";
	}
	
	

}

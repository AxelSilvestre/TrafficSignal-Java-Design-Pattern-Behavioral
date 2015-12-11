package fr.iutvalence.info.dut.m3105.preamble;

public class OrangeTrafficSignalState extends TrafficSignalStateAbstract{

	
	private static final OrangeTrafficSignalState INSTANCE = new OrangeTrafficSignalState();
	
	private OrangeTrafficSignalState() {
		duration = 2;
		remainingTime = duration;		
	}
	
	public static OrangeTrafficSignalState getInstance() {
		return INSTANCE;
	}

	@Override
	public String toString() {
		return "Orange";
	}

	@Override
	protected void setState() {
		nextState = RedTrafficSignalState.getInstance();
		
	}
	

}

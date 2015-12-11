package fr.iutvalence.info.dut.m3105.preamble;

public class RedTrafficSignalState extends TrafficSignalStateAbstract {

	
	private static final RedTrafficSignalState INSTANCE = new RedTrafficSignalState(); 
	
	private RedTrafficSignalState() {
		duration = 10;
		remainingTime = duration;
	}
	
	public static RedTrafficSignalState getInstance() {
		return INSTANCE;
	}
		
	@Override
	public String toString() {
		return "Red";
	}

	@Override
	protected void setState() {
		nextState = GreenTrafficSignalState.getInstance();
		
	}

}

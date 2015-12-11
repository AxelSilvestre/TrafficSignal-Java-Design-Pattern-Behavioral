package fr.iutvalence.info.dut.m3105.preamble;

public class RedTrafficSignalState extends TrafficSignalStateAbstract {

	
	public RedTrafficSignalState() {
		duration = 10;
		nextState = GreenTrafficSignalState.class;
	}
		
	@Override
	public String toString() {
		return "Red";
	}

}

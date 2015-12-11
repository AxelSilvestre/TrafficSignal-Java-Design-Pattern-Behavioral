package fr.iutvalence.info.dut.m3105.preamble;

public class OrangeTrafficSignalState extends TrafficSignalStateAbstract{

	
	public OrangeTrafficSignalState() {
		duration = 2;
		nextState = RedTrafficSignalState.class;
	}

	@Override
	public String toString() {
		return "Orange";
	}
	

}

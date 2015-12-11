package fr.iutvalence.info.dut.m3105.preamble;

public interface TrafficSignalState{

	void secondEllapsed(TrafficSignal context);
	
	void buttonPressed(TrafficSignal context);
	
	int getRemainingDuration(TrafficSignal context);
	
	
}

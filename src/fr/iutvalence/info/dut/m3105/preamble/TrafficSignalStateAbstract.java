package fr.iutvalence.info.dut.m3105.preamble;

public abstract class TrafficSignalStateAbstract implements TrafficSignalState{

	protected int duration;
	
	protected int remainingTime;
	
	protected TrafficSignalState nextState;
	
	@Override
	public void secondEllapsed(TrafficSignal context) {
		if(remainingTime == 0){
				setState();
				context.switchToState(nextState);
				remainingTime = duration;
		}else
			remainingTime--;
		
	}
	
	protected abstract void setState();
	
	@Override
	public void buttonPressed(TrafficSignal context) {
		
	}
	
	@Override
	public int getRemainingTime(TrafficSignal context) {
		return remainingTime;
	}

}

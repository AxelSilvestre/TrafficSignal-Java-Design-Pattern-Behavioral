package fr.iutvalence.info.dut.m3105.preamble;

public abstract class TrafficSignalStateAbstract implements TrafficSignalState{

	protected int duration;
	
	protected Class<? extends TrafficSignalState> nextState;
	
	@Override
	public void secondEllapsed(TrafficSignal context) {
		if(duration == 0){
			try {
				context.switchToState(nextState.newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		duration--;
		
	}
	
	@Override
	public void buttonPressed(TrafficSignal context) {
		
	}
	
	@Override
	public int getRemainingDuration(TrafficSignal context) {
		return duration;
	}

}

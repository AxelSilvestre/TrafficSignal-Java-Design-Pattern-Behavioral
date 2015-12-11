package fr.iutvalence.info.dut.m3105.preamble;

public class TrafficSignal extends Thread
{
	
	private TrafficSignalState state;
	
	public TrafficSignal()
	{
		super();
		this.switchToState(GreenTrafficSignalState.getInstance());
	}

	public void pressButton()
	{
		System.out.println("Button pressed!");
		System.out.flush();
		state.buttonPressed(this);
		
	}
	
	public void run()
	{
		while (true)
		{
			try
			{
				Thread.sleep(1000);
				this.secondEllapsed();
			}
			catch (InterruptedException e)
			{
				break;
			}
		}
	}

	private void secondEllapsed()
	{
		System.out.println(state.getRemainingTime(this));
		System.out.flush();
		state.secondEllapsed(this);
	}

	public void switchToState(TrafficSignalState state)
	{
		System.out.println("Traffic signal turns "+state);
		System.out.flush();
		this.state = state;	
	}
}


public class GarageDoor 
{
	private String doorState;
	private Motor pull;
	public GarageDoor()
	{
		doorState = "c";
		pull = new Motor();
	}
	public void open()
	{
			pull.on();
			doorState = "u";
	}
	public void close()
	{
			pull.on();
			doorState = "d";
	}
	public void stop()
	{
		pull.off();
		doorState = "s";
		pull.reverse();
	}
	public void onClick()
	{
		if(doorState.equals("o"))
			this.close();
		if(doorState.equals("c"))
			this.open();
		if((pull.direction) && doorState.equals("s"))
		{
			this.open();
		}
		if((pull.direction) && doorState.equals("s"))
			this.close();
		if(doorState.equals("u")||doorState.equals("d"))
			this.stop();
	}
	public void onSafety()
	{
		this.stop();
		this.open();
	}
	public void onLimit()
	{
		if(doorState.equals("u"))
			doorState="o";
		if(doorState.equals("d"))
			doorState ="c";
	}
}


public class Motor 
{
	public boolean motorState, direction;
	public Motor()
	{
		direction = false;
	}
	public void on()
	{
		motorState = true;
	}
	public void off()
	{
		motorState = false;
	}
	public void reverse()
	{
		direction = !direction;
	}
}

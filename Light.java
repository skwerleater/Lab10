
import java.util.Timer;


public class Light 
{
	private boolean lights;
	private Timer cur;
	public Light()
	{
		lights = false;
	}
	public void on()
	{
		if(!lights)
			lights = true;
	}
	public void off()
	{
		if(lights)
			lights = false;
	}
}

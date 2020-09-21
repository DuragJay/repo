package jfotsoLab4;

public class televison {

	private final String MANFACTUER;
	private final int SCREENSIZE;
	//global variables
	boolean powerON = false;
	int channel = 2;
	int volume = 20;

	//constructor
	public televison (int screensize, String manfactuer)
	{
		this.MANFACTUER = manfactuer;
		this.SCREENSIZE = screensize;
		
	
	}
	
	//increase the volume
	public int getVolume()
	{
		return volume;
		
	}
	//get the channel method
	public int getChannel()
	{
		return channel; 
		
	}
	//get the screen size
	public int getScreenSize()
	{
		return SCREENSIZE;
	}
	//get the manufactuer 
	public String getManufacturer()
	{
		return MANFACTUER;
		
	}
	//take the channel 
	public int setChannel(int Newchannel)
	{
		channel = Newchannel;
		
		return Newchannel;
	}
	public boolean power() 
	{
		if (powerON)
		{
			return !powerON;
		}
		
		else
			return powerON;
	}
	public int increaseVolume()
	{
		volume++;
		
		return volume;
	}
	public int decreaseVolume()
	{
		volume--;
		
		return volume;
	}
	
}

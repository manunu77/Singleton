package iis1314.designPatterns.factoryMethod;

public class Ogg implements IMediaFile{
	
	private String name;
	
	public Ogg()
	{
		name = "Ogg";
	}
	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Playing "+name;
	}

}

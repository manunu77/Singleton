package iis1314.designPatterns.factoryMethod;

public class Wav implements IMediaFile{
	private String name;
	
	public Wav()
	{
		name = "Wav";
	}
	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Playing "+name;
	}

}

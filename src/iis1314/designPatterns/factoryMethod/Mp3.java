package iis1314.designPatterns.factoryMethod;

public class Mp3 implements IMediaFile{
	private String name;
	
	public Mp3()
	{
		name = "Mp3";
	}
	@Override
	public String play() {
		// TODO Auto-generated method stub
		return "Play "+name;
	}

}


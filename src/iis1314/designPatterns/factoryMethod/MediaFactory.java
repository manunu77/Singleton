package iis1314.designPatterns.factoryMethod;

public class MediaFactory implements IFactory {

	@Override
	public IMediaFile createMedia(String tipe) {
		// TODO Auto-generated method stub
		IMediaFile res = null;
		try{
		if(tipe.equalsIgnoreCase("mp3"))
		{
			res = new Mp3();
		}
		else if(tipe.equalsIgnoreCase("ogg"))
		{
			res = new Ogg();
		}
		else if(tipe.equalsIgnoreCase("wav"))
		{
			res = new Wav();
		}
		}
		catch(NullPointerException e)
		{
			System.out.println("The type file is invalid (package: iis1314.designPatterm.factoryMethod.MediaFactory): " + tipe);
		}
		return res;
	}

}

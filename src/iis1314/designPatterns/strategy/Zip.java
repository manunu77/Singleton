package iis1314.designPatterns.strategy;

public class Zip implements ICompressor {

	private String compressor;
	
	public Zip()
	{
		compressor = "ZIP";
	}
	public String compress(String data) {
		return compressor + "data : - "+data+"-";
	}

}

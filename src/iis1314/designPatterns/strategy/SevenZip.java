package iis1314.designPatterns.strategy;

public class SevenZip implements ICompressor {

	private String compressor;
	
	public SevenZip()
	{
		compressor = "7ZIP";
	}
	public String compress(String data) {
		// TODO Auto-generated method stub
		return compressor + "data : - "+data+"-";
	}

}

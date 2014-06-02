package iis1314.designPatterns.strategy;

public class Rar implements ICompressor {

	private String compressor;
	
	public Rar()
	{
		compressor = "RAR";
	}
	public String compress(String data) {
		return compressor + "data : - "+data+"-";
	}
	
	public String getCompressor()
	{
		return compressor;
	}
}

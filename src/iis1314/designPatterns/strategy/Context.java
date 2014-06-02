package iis1314.designPatterns.strategy;

public class Context {

	ICompressor compr;
	
	public Context(ICompressor c)
	{
		compr = c;
	}
	public void setCompressor(ICompressor c)
	{
		compr = c;
	}
	public String compress(String data)
	{
		return compr.compress(data);
	}
	public ICompressor getCompressor()
	{
		return compr;
	}
}

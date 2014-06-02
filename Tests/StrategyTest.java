import static org.junit.Assert.*;
import iis1314.designPatterns.factoryMethod.IMediaFile;
import iis1314.designPatterns.factoryMethod.MediaFactory;
import iis1314.designPatterns.factoryMethod.Ogg;
import iis1314.designPatterns.strategy.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StrategyTest {

	private Context context;
	private String toCompress = "datos";
	@Before
	public void start()
	{
		context = new Context(new Zip());
	}
	@After
	public void tearDown()
	{
		context = null;
	}
	@Test
	public void SevenZipConstructor() {
		SevenZip sz = new SevenZip();
		assertNotNull(sz);
		assertEquals("El compresor es 7zip","7ZIP",sz.getCompressor());
	}
	@Test
	public void ZipConstructor() {
		Zip z = new Zip();
		assertNotNull(z);
		assertEquals("El compresor es Zip","ZIP",z.getCompressor());
	}
	@Test
	public void RarConstructor() {
		Rar r = new Rar();
		assertNotNull(r);
		assertEquals("El compresor es Rar","RAR",r.getCompressor());
	}
	@Test
	public void ContextConstructor7Zip()
	{
		
		ICompressor c = new SevenZip();
		Context cont = new Context(c);
		assertNotNull(cont);
		assertNotNull(c);
		assertEquals("El compresor es 7zip", SevenZip.class, cont.getCompressor().getClass());
	}
	@Test
	public void ContextConstructorRar()
	{
		
		ICompressor c = new Rar();
		Context cont = new Context(c);
		assertNotNull(cont);
		assertNotNull(c);
		assertEquals("El compresor es Rar", Rar.class, cont.getCompressor().getClass());
	}
	@Test
	public void ContextConstructorZip()
	{
		
		ICompressor c = new Zip();
		Context cont = new Context(c);
		assertNotNull(cont);
		assertNotNull(c);
		assertEquals("El compresor es Zip", Zip.class, cont.getCompressor().getClass());
	}
	
	@Test
	public void ContextSetCompressor7Zip()
	{
		context.setCompressor(new SevenZip());
		assertEquals("El compresor es 7zip", SevenZip.class, context.getCompressor().getClass());
	}
	
	@Test
	public void ContextSetCompressorZip()
	{
		context.setCompressor(new Zip());
		assertEquals("El compresor es Zip", Zip.class, context.getCompressor().getClass());
	}
	
	@Test
	public void ContextSetCompressorRar()
	{
		context.setCompressor(new Rar());
		assertEquals("El compresor es Rar", Rar.class, context.getCompressor().getClass());
	}
	
	@Test
	public void ContextCompressZipData()
	{
		String res = context.compress(toCompress);
		assertEquals("El resultado es el esperado", "ZIPdata : - "+toCompress+"-",res);
		assertEquals("El compresor es Zip", Zip.class, context.getCompressor().getClass());
	}
	@Test
	public void ContextCompress7ZipData()
	{
		context.setCompressor(new SevenZip());
		String res = context.compress(toCompress);
		assertEquals("El resultado es el esperado", "7ZIPdata : - "+toCompress+"-",res);
		assertEquals("El compresor es 7Zip", SevenZip.class, context.getCompressor().getClass());
	}
	@Test
	public void ContextCompressRarData()
	{
		context.setCompressor(new Rar());
		String res = context.compress(toCompress);
		assertEquals("El resultado es el esperado", "RARdata : - "+toCompress+"-",res);
		assertEquals("El compresor es 7Zip", Rar.class, context.getCompressor().getClass());
	}
}

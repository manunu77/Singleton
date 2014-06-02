import static org.junit.Assert.*;
import iis1314.designPatterns.factoryMethod.*;

import org.junit.Test;


public class FactoryMethodTest{

	@Test
	public void MP3cosntrusctor() {
		Mp3 m = new Mp3();
		assertNotNull(m);
		assertEquals("Salida correcta","Play Mp3",m.play());
	}
	@Test
	public void WavCosntrusctor() {
		Wav W = new Wav();
		assertNotNull(W);
		assertEquals("Salida correcta","Playing Wav",W.play());
	}
	@Test
	public void OggContrsutctor() {
		Ogg o = new Ogg();
		assertNotNull(o);
		assertEquals("Salida correcta","Playing Ogg",o.play());
	}
	
	@Test
	public void MediaFactoryMp3()
	{
		MediaFactory mf = new MediaFactory();
		String tipe = "Mp3";
		IMediaFile res = mf.createMedia(tipe);
		assertEquals("Resultado Mp3",Mp3.class, res.getClass());
	}
	@Test
	public void MediaFactoryWav()
	{
		MediaFactory mf = new MediaFactory();
		String tipe = "Wav";
		IMediaFile res = mf.createMedia(tipe);
		assertEquals("Resultado Wav",Wav.class, res.getClass());
	}
	@Test
	public void MediaFactoryOgg()
	{
		MediaFactory mf = new MediaFactory();
		String tipe = "Ogg";
		IMediaFile res = mf.createMedia(tipe);
		assertEquals("Resultado Ogg",Ogg.class, res.getClass());
	}
}

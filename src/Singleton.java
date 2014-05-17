
public class Singleton {
	
	private static Singleton instanciaUnica;
	int dato;
	
	private Singleton()
	{
		dato =0;
	}
	public static Singleton getInstance()
	{
		if(instanciaUnica == null)
		{
			instanciaUnica = new Singleton();
		}
		return instanciaUnica;
	}
	public int getIdentifier()
	{
		int res = dato;
		dato++;
		return res;
	}
}

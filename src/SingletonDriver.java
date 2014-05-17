/**
* @author Antonio J. Nebro
*/
public class SingletonDriver {

	public static void main(String[] args) 
	{
		// Creating the singleton object
		Singleton singleton = Singleton.getInstance() ;

		// Using the singleton
		System.out.println("Invoking singleton (1): " + singleton.getIdentifier()) ; 
		System.out.println("Invoking singleton (2): " + singleton.getIdentifier()) ; 

		// Trying to create another singleton instance
	Singleton otherSingleton = Singleton.getInstance();

	// Using the "new" singleton
	System.out.println("Invoking singleton (3): " + otherSingleton.getIdentifier()) ; 
	System.out.println("Invoking singleton (4): " + otherSingleton.getIdentifier()) ; 
	}
}
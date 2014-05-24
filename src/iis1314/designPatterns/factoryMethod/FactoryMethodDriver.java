package iis1314.designPatterns.factoryMethod;

public class FactoryMethodDriver {  
  public static void main (String[] args) throws Exception {
    IFactory factory ;
    
    factory = new MediaFactory() ;
    
    IMediaFile file1 = factory.createMedia("mp3") ;
    System.out.println("File 1: " + file1.play()) ;
    
    IMediaFile file2 = factory.createMedia("wav") ;
    System.out.println("File 2: " + file2.play()) ;
    
    IMediaFile file3 = factory.createMedia("ogg") ;
    System.out.println("File 3: " + file3.play()) ;
    
    IMediaFile fileNull = factory.createMedia(null) ;
    System.out.println("File: " + fileNull.play()) ;
  }  
}
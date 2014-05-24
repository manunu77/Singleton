package iis1314.designPatterns.strategy;

public class StrategyDriver {

  public static void main(String[] args) {
    Context context = new Context(new Zip())  ;
    String data = "string to compress" ;
    
    System.out.println("Original data: " + data) ;
    System.out.println("Compressed data: " + context.compress(data)) ;
    
    context.setCompressor(new Rar()) ;
    System.out.println("Compressed data: " + context.compress(data)) ;

    context.setCompressor(new SevenZip()) ;
    System.out.println("Compressed data: " + context.compress(data)) ;
  }
}
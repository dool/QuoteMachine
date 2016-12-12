
/**
 * Write a description of QuoteLog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuoteLog {

     public static Quote parseQuote(String line){
            int fPipe = line.indexOf("|");
            int lPipe = line.lastIndexOf("|");
            String quote = line.substring(0,fPipe);
            String author = line.substring(fPipe+1, lPipe);
            String category = line.substring(lPipe+1,line.length());
            return new Quote(quote, author, category);
    }
}

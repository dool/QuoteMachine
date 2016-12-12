
/**
 * Write a description of QuoteMachine here.
 * 
 * @author (Maxamed Dool) 
 * @version (December 11, 2016)
 */
import java.util.*;
import edu.duke.*;
public class QuoteMachine {

    private ArrayList<Quote> quoteRecord;
    
    public QuoteMachine(){
        quoteRecord = new ArrayList<Quote>();
    }
    
    public void readFile(String fileName){
        FileResource fr = new FileResource(fileName);
        for(String s: fr.lines()){
            Quote brainy = QuoteLog.parseQuote(s);
            quoteRecord.add(brainy);
        }
    }
    
    
    
    public void printQuote(){
    
        for (Quote quotes: quoteRecord){
            System.out.println("*******************************************************************************");
            System.out.println("                 " + quotes.getCategory());
            System.out.println(quotes.getQuote());
            System.out.println("               ~ " + quotes.getAuthor());
        }
    }
    
   
    
}


/**
 * Write a description of QuoteMachine here.
 * 
 * @author (Maxamed Dool) 
 * @version (December 11, 2016)
 */
import java.util.*;
import edu.duke.*;
public class QuoteMachine {

    private ArrayList<Quote> quoteLog;
    
    public QuoteMachine(){
        quoteLog = new ArrayList<Quote>();
    }
    
    public void readFile(String fileName){
        FileResource fr = new FileResource(fileName);
        for(String s: fr.lines()){
            Quote brainy = parseQuote(s);
            quoteLog.add(brainy);
        }
    }
    
    
    
    public void printQuote(){
    
        for (Quote quotes: quoteLog){
            System.out.println("*******************************************************************************");
            System.out.println("                 " + quotes.getCategory());
            System.out.println(quotes.getQuote());
            System.out.println("               ~ " + quotes.getAuthor());
        }
    }
    
    private Quote parseQuote(String line){
            int fPipe = line.indexOf("|");
            int lPipe = line.lastIndexOf("|");
            String quote = line.substring(0,fPipe);
            String author = line.substring(fPipe+1, lPipe);
            String category = line.substring(lPipe+1,line.length());
            return new Quote(quote, author, category);
    }
    
}

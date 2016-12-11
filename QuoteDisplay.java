
/**
 * Write a description of QuoteDisplay here.
 * 
 * @author (Maxamed Dool) 
 * @version (December 11, 2016)
 */
import java.util.ArrayList;
public class QuoteDisplay {

    public void displayQuotes(){
        QuoteMachine DQuotes = new QuoteMachine();
        DQuotes.readFile("Halqabsi.txt");
        DQuotes.printQuote();
    }
}

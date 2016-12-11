
/**
 * Write a description of Quote here.
 * 
 * @author (Maxamed Dool) 
 * @version (December 11, 2016)
 */
public class Quote {

    private String quote;
    private String author;
    private String category;
    
    public Quote(String message, String owner, String label){
        quote = message;
        author = owner;
        category = label;
    }
    
    
    public String getQuote(){
     return quote;
    }
    
    public String getAuthor(){
     return author;
    }
    
    public String getCategory(){
      return category;
    }
    
    public String toString(){
      return quote +"|"+author +"|"+category;
    }
}


public class Book 
{ 
    /** The title of the Book */
    private String title;
    /** The price of the Book */
    private double price;
    public Book(String bookTitle, double bookPrice){
        title = bookTitle;
        price = bookPrice;
    }
    public String getTitle(){
        return title;
    }
    public String getBookInfo(){
        return title + "-"+price;
    }
} 

public class Textbook extends Book{
    private int edition;
    public Textbook (String bookTitle,double price, int edition){
        super(bookTitle, price);
        this.edition=edition;
    }
    public int getEdition(){
        return edition;
    }
    public String getBookInfo(){
        return super.getBookInfo()+"-" +edition;
    }
    public boolean canSubsituteFor(Textbook other){
        if (getTitle().equals(other.getTitle())){
            return edition >= other.edition;
        }
        return false;
    }
}
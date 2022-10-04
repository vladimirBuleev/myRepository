package New;

public class Book {
    String bookName;
    int pageAmount;
    int publicationYear;
    String authorName;
    Book(String bookName,int pageAmount,int publicationYear,String authorName){
        this.bookName=bookName;
        this.pageAmount=pageAmount;
        this.publicationYear=publicationYear;
        this.authorName=authorName;
    }void setBookName(String bookName){
        this.bookName=bookName;
    }String getBookName(){
        return bookName;
    }void setPageAmount(int pageAmount){
        this.pageAmount=pageAmount;
    }int getPageAmount(){
        return pageAmount;
    }void setPublicationYear(int publicationYear){
        this.publicationYear=publicationYear;
    }int getPublicationYear(){
        return publicationYear;
    }void setAuthorName(String authorName){
        this.authorName=authorName;
    }String getAuthorName(){
        return authorName;
    }public String toString(){
        return "Book name-"+bookName+
                ", amount of pages-"+pageAmount+
                ", year of publication-"+publicationYear+
                ", author's name-"+authorName;
    }
}

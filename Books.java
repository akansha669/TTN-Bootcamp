public class Books {
    String bookName;
    String bookAuthor;
    float bookPrice;
    Books(String name,String author,float price){
        this.bookName=name;
        this.bookAuthor=author;
        this.bookPrice=price;
    }
    void getBookDetails() {    //getting books details using this method
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Author: " + bookAuthor);
        System.out.println("Book Price: " + bookPrice);
    }
}

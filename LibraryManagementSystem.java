import java.util.ArrayList;
public class LibraryManagementSystem {
    public static void main(String [] args){
        Library myLibrary=new Library();
        myLibrary.setLibraryLocation("Delhi University South Campus");
        Books b1 = new Books("Head First Java", "Eric S", 700.0f);
        Books b3 = new Books("Head First Design Patterns", "Donald Y", 900.0f);
        Books b2 = new Books("Head First HTML5 Programming", "David P", 800.0f);
        Books b4 = new Books("Head First HTML & CSS", "Henry T", 600.0f);
        ArrayList <Books> book=new ArrayList<>();
        book.add(b1);
        book.add(b2);
        book.add(b3);
        book.add(b4);
        myLibrary.setBooksInLibrary(book);//Adding book details to Book ArrayList
        Librarian librarian = new Librarian("Kanchan Sinha", 3284);
        myLibrary.setLibrarian(librarian);
        Member m1 = new Member("Divya Arora", 3338);
        Member m2 = new Member("Manju Arora", 3339);
        Member m3 = new Member("Himani Sharma", 3340);
        ArrayList<Member> memberList = new ArrayList<>();
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);
        myLibrary.setMemberOfLibrary(memberList);//Adding member details to member ArrayList
        myLibrary.getLibraryDetails();
    }
}

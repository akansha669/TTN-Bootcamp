import java.util.ArrayList;
public class Library {
    private String libraryLocation;
    private ArrayList <Books> booksInLibrary;//making it arrayList to get multiple entries for books
    private ArrayList <Member> memberOfLibrary;//making it arrayList to get multiple entries for members
    private Librarian librarian;

    public void setBooksInLibrary(ArrayList<Books> booksInLibrary) {//set method to set values for the books
        this.booksInLibrary = booksInLibrary;
    }
    public ArrayList<Books> getBooksInLibrary() {//to return those values received
        return booksInLibrary;
    }

    public void setLibrarian(Librarian librarian) {   //set librarian method
        this.librarian = librarian;
    }
    public Librarian getLibrarian() {   //retunr libraran infomation
        return librarian;
    }

    public String getLibraryLocation() {//return library location
        return libraryLocation;
    }
    public void setLibraryLocation(String libraryLocation) { //set value for library location
        this.libraryLocation = libraryLocation;
    }

    public void setMemberOfLibrary(ArrayList<Member> memberOfLibrary) {//set members
        this.memberOfLibrary = memberOfLibrary;
    }
    public ArrayList<Member> getMemberOfLibrary() {//return members details
        return memberOfLibrary;
    }
    void getLibraryDetails() {  //will return all the details involved in Library Management System
        System.out.println("___LIBRARY DETAILS___");
        System.out.println("LOCATION: " + libraryLocation);
        System.out.println("LIBRARIAN:");
        librarian.getPerson();
        System.out.println("MEMBERS:");
        for (Member m : memberOfLibrary)
            m.getPerson();
        System.out.println("BOOKS:");
        for (Books b : booksInLibrary)
            b.getBookDetails();
    }
}

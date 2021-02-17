public class Librarian implements Person {
    String librarianName;
    int librarianID;
    Librarian(String name,int id){
        this.librarianName=name;
        this.librarianID=id;
    }

    @Override
    public void getPerson() {            //Interface method overiding to get member details
        System.out.println("Librarian Name: "+librarianName);
        System.out.println("Librarian ID: "+librarianID);
    }
}

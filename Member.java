public class Member implements Person{
    String memberName;
    int memberID;
    Member(String name,int id){
        this.memberName=name;
        this.memberID=id;
    }

    @Override
    public void getPerson() {  //Interface method overiding to get member details
        System.out.println("Member Name: "+memberName);
        System.out.println("Member ID: "+memberID);
    }
}

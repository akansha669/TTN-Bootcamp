class Test1
{
    int id;
    String name;
    Test1(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public int getId() { return id; }
    public String getName() { return name; }
}
public class Ques31 {
    public static void main( String[] args)
    {
        Test1 t=new Test1(101,"Akansha");
        System.out.println("Id:"+t.getId());
        System.out.println("Name:"+" "+t.getName());
    }
}

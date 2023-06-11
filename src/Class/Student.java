package Class;

public class Student extends  Person
{
    int id;
    public Student(String name, int id){
        super(name);
        this.id = id;
    }

    public void ShowID(){
        System.out.println("name = " + name);
        System.out.println("id = " + id);
    }
}

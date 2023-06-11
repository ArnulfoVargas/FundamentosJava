package Class;

public class Person
{
    protected String name;
    public Person(String name){
        this.name = name;
    }
    public Person(){
        name = "No Name";
    }

    public void PrintName(){
        System.out.println(name);
    }

    public String GetName()
    {
        return name;
    }
}

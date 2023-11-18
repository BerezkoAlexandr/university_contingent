package mainpack;

public class Person {
    String name;
    Gender gn;
    Activity act;
    String department;


    public Person(String name, Gender gn, Activity act, String department) {
        this.name = name;
        this.gn = gn;
        this.department = department;
        this.act = act;
    }

    public void print(){
        System.out.print("This is " + name + ". " + gn.getValue() + " "+ act.getValue()+ " " + department + ". ");
    }
}

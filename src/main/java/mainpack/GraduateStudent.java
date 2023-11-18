package mainpack;

public class GraduateStudent extends Person{
    String dissertationTopic;

    public GraduateStudent(String name, Gender gn, Activity act, String department, String dissertationTopic) {
        super(name, gn, act, department);
        this.dissertationTopic = dissertationTopic;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(gn.getValue2() + " thesis title is " + dissertationTopic +". ");
    }
}

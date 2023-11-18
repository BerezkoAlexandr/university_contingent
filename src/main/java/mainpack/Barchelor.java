package mainpack;

public class Barchelor extends Person{
    enum Course {
        I,
        II,
        III;
    }
    Course cr;

    String educationLevel;

    public Barchelor(String name, Gender gn, Activity act, String department, String educationLevel, Course cr) {
        super(name, gn, act, department);
        this.cr = cr;
        this.educationLevel = educationLevel;
    }

    @Override
    public void print() {super.print();
        System.out.println(gn.getValue() + " is " + cr + "'th year " + educationLevel + " student." );
    }
}


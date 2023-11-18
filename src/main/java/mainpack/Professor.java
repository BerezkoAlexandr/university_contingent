package mainpack;

public class Professor extends Person{
    enum AcademicDegree{
        MSc,PhD
    };
    AcademicDegree ac;
    String specialtyName;

    public Professor(String name, Gender gn, Activity act, String department, AcademicDegree ac, String specialtyName) {
        super(name, gn, act, department);
        this.ac = ac;
        this.specialtyName = specialtyName;
    }

    @Override
    public void print() {super.print();
        System.out.println(gn.getValue() + " has " + ac + " degree in " + specialtyName + ". ");
    }
}

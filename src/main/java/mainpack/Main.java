package mainpack;

public class Main {
    public static void main(String[] args) {
    Professor professor1 = new Professor ("Ronald Turner",  Gender.MALE, Activity.PROFESSOR,  "Computer science", Professor.AcademicDegree.PhD,  "Programming paradigms");
    Professor professor2 = new Professor("Ruth Hollings",Gender.FEMALE, Activity.PROFESSOR, "Jurisprudence", Professor.AcademicDegree.MSc,"Domestic arbitration");
    Barchelor bl1 = new Barchelor("Leo Wilkinson", Gender.MALE, Activity.STUDENT, "Computer science", "Bachelor", Barchelor.Course.III);
    Barchelor bl2 = new Barchelor("Anna Cunningham", Gender.FEMALE, Activity.STUDENT, "World economy", "Bachelor", Barchelor.Course.I);
    Barchelor bl3 = new Barchelor("Jill Lundqvist", Gender.FEMALE, Activity.STUDENT, "Jurisprudence", "Master", Barchelor.Course.I);
    GraduateStudent gs = new GraduateStudent("Ronald Correa",Gender.MALE, Activity.STUDENT, "Computer science", "Design of a functional programming language");

        professor1.print();
        professor2.print();
        bl1.print();
        bl2.print();
        bl3.print();
        gs.print();
    }
}

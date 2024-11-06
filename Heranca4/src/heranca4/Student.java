package heranca4;

public class Student extends Person {
    private String StudentNumber;
    private double[] StudentGrade;
    
    public Student(String Name, String Number, String Email, Address Add, String StudentNumber, double[] StudentGrade) {
        super(Name, Number, Email, Add);
        this.StudentNumber = StudentNumber;
        this.StudentGrade = StudentGrade;
    }
    
    public double FinalAverage() {
        double sum = 0;
        for (double grade : StudentGrade) {
            sum += grade;
        }
        return StudentGrade.length > 0 ? sum / StudentGrade.length : 0;
    }
}

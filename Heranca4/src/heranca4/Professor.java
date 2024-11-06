package heranca4;

public class Professor extends Person {
    private float Salary;
    
    public Professor(String Name, String Number, String Email, Address Add, int Salary) {
       super(Name, Number, Email, Add);
       this.Salary = Salary;
   }
    
    public double getSalary() {
        return Salary;
    }
}

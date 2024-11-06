package heranca4;

public class Heranca4 {

    public static void main(String[] args) {
        Address address1 = new Address("123 Arabia", "Woodlands", "Dubai", "12345", "Alah");
        Address address2 = new Address("321 Miami", "Brooks", "Miami", "1879", "USA");

        Student student = new Student("Neymar Junior", "(11) 99600-9878", "menino.ney@gmail.com", address1, "111408", new double[]{9, 8, 8});
        Professor professor = new Professor("Dr. Messi", "(19) 98182-9885", "goat@gmail.com", address2, 75000000);

        System.out.println("Student Information:");
        System.out.println("Name: " + student.Name);
        System.out.println("Final Average: " + student.FinalAverage());
        System.out.println("Address:");
        student.Add.OutputAsLabel();

        System.out.println("\nProfessor Information:");
        System.out.println("Name: " + professor.Name);
        System.out.println("Salary: " + professor.getSalary());
        System.out.println("Address:");
        professor.Add.OutputAsLabel();
    }
    
}

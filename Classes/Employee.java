package Classes;

public class Employee {

    private int id;
    private String fName;
    private String lName;
    private int salary;

    public Employee(int id, String fName, String lName, int salary) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.fName;
    }

    public String getLastName() {
        return this.lName;
    }

    public String getName() {
        return fName + lName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
        return this.salary;
    }

    public String toString() {
        return "Employee[id = %d, firstName = %s, lastName = %s, salary = %d]".formatted(id, fName, lName, salary);
    }
}

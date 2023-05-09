public class Manager {
    private String name;
    private int age;
    private String initialTitle;
    private Employee employee;

    public Manager(String name, int age, String initialTitle, Employee employee) {
        this.name = name;
        this.age = age;
        this.initialTitle = initialTitle;
        this.employee = employee;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getInitialTitle() {
        return this.initialTitle;
    }

    public int getEmployeeSalary() {
        return this.employee.salary ;
    } 
}

public class Employee {
    public String name;
    protected int salary;
    public Animal assignedAnimal;

    public Employee(String name, int salary, Animal animal) {
        this.name = name;
        this.salary = salary;
        this.assignedAnimal = animal;
    }

    public void feedAssignedAnimal() {
        System.out.println(this.name + " fed " + this.assignedAnimal.name);
    }
}

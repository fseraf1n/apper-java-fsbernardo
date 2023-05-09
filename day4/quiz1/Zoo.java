public class Zoo {
    public static void main(String[] args) {
        Animal dog = new Animal("doggy", "dog", "dog food", "barks");
        Employee serafin = new Employee("serafin (employee)", 10, dog);
        Manager serafin2 = new Manager("serafin (manager)", 12, "manager", serafin);
        Visitor serafin3 = new Visitor("serafin (visitor)", 22);
        dog.sound();
        dog.chewFood();
        //serafin.feedAssignedAnimal();
        
    }
}

import package1.protectedClass;

public class test {
    public static void main(String[] args) {
        protectedClass testClass = new protectedClass();
        //testClass.protectedMethod(); // this wont run because test.java is not in the same package as protectedClass
        testClass.publicMethod(); // this will run because the method is public 
    }
}

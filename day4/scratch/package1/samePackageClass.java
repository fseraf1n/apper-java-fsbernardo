package package1;

public class samePackageClass {
    public static void main(String[] args) {
        protectedClass testClass = new protectedClass();
        testClass.protectedMethod(); // this works because they are in the same package
        
    }
}

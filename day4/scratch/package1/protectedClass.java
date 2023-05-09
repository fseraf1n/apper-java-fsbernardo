package package1;

public class protectedClass {

    public static void main(String[] args) {
        privateMethod(); // this works because the caller of the method is the class itself 
    }
    protected void protectedMethod() {
        System.out.println("this method is protected");
    }

    public void publicMethod() {
        System.out.println("this method is public");
    }

    private static void privateMethod() {
        System.out.println("this method is private");
    }
}

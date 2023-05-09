public class Animal {
    public String name;
    public String type;
    public String kindOfFood;
    public String sound;

    public Animal(String name, String type, String kindOfFood, String sound) {
        this.name = name;
        this.type = type;
        this.kindOfFood = kindOfFood;
        this.sound = sound;
    }
    
    public void sound() {
        System.out.println(this.name + " " + this.sound);
    }

    public void chewFood() {
        System.out.println(this.name + " chews " + this.kindOfFood);
    }
}
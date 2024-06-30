public class Inheritance {
    void eat() {
        System.out.println("I am eating");
    }
}

 class Dog extends Inheritance {
    public static void main(String[] args)  {
        Dog d = new Dog();
        d.eat();
    }
}

public class Animal {
    public void eat() {             // Inherited Method.
        System.out.println("Animal is eating.");
    }
    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}
class Tiger extends Animal {
    public void sleep() {           // Overridden method.
        System.out.println("Tiger is sleeping.");
    }
    public void hunt() {            // Child specific method.
        System.out.println("Tiger is hunting.");
    }
}

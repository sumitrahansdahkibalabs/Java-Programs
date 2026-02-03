public class Bird {
    public void sleep() {
        System.out.println("Bird is sleeping.");
    }
    public void eat(){
        System.out.println("Bird is eating.");
    }
}
class Eagle extends Bird {
    public void eat(){
        System.out.println("Eagle is eating.");
    }
    public void fly(){
        System.out.println("Eagle is flying.");
    }
}
class Sparrow extends Bird {
    public void eat() {
        System.out.println("Sparrow is eating.");
    }
    public void fly() {
        System.out.println("Sparrow is flying.");
    }
}

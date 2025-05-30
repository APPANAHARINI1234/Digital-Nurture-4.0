package program_18;
class Animal{
    int n;
    Animal(int n){
        this.n = n;
    }
    public void bark(){
        System.out.println("bark");
    }
}
class Dog extends Animal{
    Dog(int n){
     super(n);
    }
    public void bark(){
        System.out.println("bow bow");
    }
}
public class Inheritence {
    public static void main(String[] args) {
        Animal a = new Animal(10);
        a.bark();
        Animal b = new Dog(20);
        b.bark();

    }
}

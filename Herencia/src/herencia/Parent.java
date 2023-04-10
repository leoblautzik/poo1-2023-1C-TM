package herencia;

public class Parent {
    public Parent(int x) {
        System.out.print("A");
    }
}
class Child extends Parent {
    public Child(int x) {
    	super(5);
        System.out.print("B");
    }
    public Child() {
        super(123);
        System.out.print("C");

    }
    public static void main(String[] args) {
        new Child();
    }
}
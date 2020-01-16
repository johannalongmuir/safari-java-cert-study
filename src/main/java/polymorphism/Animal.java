package polymorphism;

public abstract class Animal implements Greeter {
    public void greet() {}
//  public static void main(String[] args) {
//    new Animal();
//  }
}

interface Greeter {
  /* redundant! public abstract*/ void greet();
}
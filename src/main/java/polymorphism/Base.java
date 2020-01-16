package polymorphism;

class Sub extends Base {
  Sub(String s1, String s2) {
    super(s1);
  }
}
public class Base {
  int x = 99;
  {
    x = 100;
  }
  int z;
  {
    z = 200;
  }
// Overloaded constructors... DIFFER IN ARGUMENT TYPE SEQUENCE
  public Base() {
//    this("Fred");
    super();
    z = z * x;
  }

  public Base(String s) {
//    super();
    this();
    // this() OR super() must be first... One or the other
    // if neither, super() is implied...
    // instance initializations...
    // rest of this initializer...
    // MUST have initialized all final variables before
    // finishing constructors..

  }
  public static void main(String[] args) {
    Base b = new Sub("hello", "world");

  }
}

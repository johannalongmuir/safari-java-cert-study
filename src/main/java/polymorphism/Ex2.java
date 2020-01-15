package polymorphism;

class Y {
  static String sayHi() { return "Y-Hello"; }
  String sayHi2() { return "Y-Hello2"; }
}
class Z extends Y {
  static String sayHi() { return "Z-Hello"; }
  String sayHi2() { return "Z-Hello2"; }
}
public class Ex2 {
  public static void main(String[] args) {
    Y y = new Z();
    // Reference type (Y) is used for invocation of static methods!!!!
    // static method is "static" in invocation isn't "dynamic"
    // Type of object is Z
    System.out.println(y.sayHi() + ", " +y.sayHi2());
    // exactly equivalent to:
    System.out.println(Y.sayHi() + ", " +y.sayHi2());
  }
}

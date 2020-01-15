package reflection;

import java.lang.reflect.Method;

/*
  - public -- anywhere in Java 8
           -- JPMS anywhere in the same module, or *if exported* anywhere
           in any module that "requires this module"
  - protected -- as default, but also in subclasses using the keword "this"
  - "default" -- only accessible in the SAME PACKAGE
  - private -- "only accessible between the enclosing
  TOP LEVEL curly braces surrounding the declaration"
 */
class Car {
  public void breakWindscreen() {

  }
}

class FordFiesta extends Car {
  public void impressFriends() {

  }
}
public class Ex1 { // public class Ex1 MUST exist in a file called Ex1.java
  // therefore ONLY ONE public type in any one source file
  public static void main(String[] args) {
    Object obj = new FordFiesta();
    Class cl = obj.getClass();
    Method[] methods = cl.getDeclaredMethods();
    for (Method m : methods) {
      System.out.println(">> " + m);
    }
  }
}

package hello;

import java.util.function.Consumer;

public class Hello {
  public static void main(String[] args) {
    ((Consumer<String>)((var x) -> System.out.println(x)))
        .accept("Hello World!");
  }
}

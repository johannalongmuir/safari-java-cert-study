package primitiverefs;


public class Ex1 {

  public static void q14A(Integer x) {
    x = x + 1;
  }

  public static void main(String[] args) {
    Integer x = 99;
    q14A(x);
    System.out.println(x);
  }
}
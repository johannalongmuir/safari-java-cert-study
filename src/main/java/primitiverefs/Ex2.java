package primitiverefs;

public class Ex2 {
  public static void q13A(int[] x) {
    x[0] = x[0] + 1;
  }

  public static void main(String[] args) {

    int x[] = {99};
    q13A(x);
    System.out.println(x[0]);
  }
}

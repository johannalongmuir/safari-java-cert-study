package staticstuff;
class X {
  static int MAX_VAL = 100;
  int value = 99;
  public void setVal(int x) {
    if (x <= MAX_VAL) value = x;
  }
}

public class Ex1 {
  public static void main(String[] args) {
    X a = new X();
    X b = new X();
    a.setVal(120);
    System.out.print(a.value + ", ");
    b.MAX_VAL = 150;
    a.setVal(140);
    System.out.println(a.value);
  }
}

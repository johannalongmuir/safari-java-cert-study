package privatestuff;

// "external" class cannot access private elements
//class Special {
//  public void show(Nested n) {
//    System.out.println(n.count);
//  }
//}
public class Nested {
  static class Special {
    private int moreData = 200;
    public void show(Nested n) {
      System.out.println(n.count);
    }
  }

  private int count = 99;

  public static void main(String[] args) {
    Nested self = new Nested();
    self.go();
    Special spec = new Special();
    spec.show(self);
    System.out.println("More data " + spec.moreData);
  }

  public void go() {
    System.out.println("count = " + this.count);
  }
}

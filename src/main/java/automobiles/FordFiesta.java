package automobiles;

public class FordFiesta {
  public static final int MAX_DESIGN_SPEED = 100;
  private int speed;
  public FordFiesta(int initialSpeed) {
    this.speed = initialSpeed;
  }

//  public void goFaster(/*FordFiesta this, */int increment) {
  public void goFaster(int increment) {
    this.speed += increment;
    System.out.println("Car going faster, now " + this.speed);
  }

  public static void main(String [] args) {
    FordFiesta ff = new FordFiesta(0);
    ff.goFaster(30);
  }
}

package polymorphism;

class Holiday extends Date {
  String name;
  public Holiday(int day, int month, int year, String name) {
    super(day, month, year);
    this.name = name;
  }

  // Overriding method ????
  @Override
  public String toString() {
    return "Holiday day=" + this.day
        + " month=" + this.month + " year=" + this.year
        + " called " + this.name;
  }
}

public class Date {
  int day;
  int month;
  int year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public String toString() {
    return "Date of day=" + this.day
        + " month=" + this.month + " year=" + this.year;
  }

  public static void main(String[] args) {
    // type of the reference: Date
    // type of the object: Holiday
    Date d = new Holiday(1, 1, 2020, "New Year's Day");
    System.out.println("date is " + d.toString());
  }
}

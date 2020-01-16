package students;

import java.util.List;
// Scala
// case class Student(name:String, gpa:Double, courses:List[String])
public class Student {
  private String name;
  private double gpa;
  private List<String> courses;

  // ... says argument is an array of whatever
  // but gives permission for a comma separated list
  // at the call site to be auto converted to an array
  public Student(String name, double gpa, String ... courses) {
    this.name = name;
    this.gpa = gpa;
    this.courses = List.of(courses); // J8 Arrays.asList...
  }

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }

  public List<String> getCourses() {
    return courses;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", gpa=" + gpa +
        ", courses=" + courses +
        '}';
  }
}

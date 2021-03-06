package students;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

interface Silly1 {
  boolean test(LocalDate s);
}
interface Irrelevant {
  void doStuff();
}
@FunctionalInterface
interface StudentCriterion /*extends Irrelevant*/ {
//  void doStuff();
  boolean test(Student s);
}

class SmartCriterion implements StudentCriterion {
  @Override
  public boolean test(Student s) {
    return s.getGpa() > 3;
  }
}

class EnthusiasticCriterion implements StudentCriterion {
//  public void doStuff() {}
  @Override
  public boolean test(Student s) {
    return s.getCourses().size() > 3;
  }
}

public class School {
  public static StudentCriterion getFred() {
    return s -> s.getName().equals("Fred");
  }

  public static void showStudents(List<Student> ls) {
    for (Student s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("-------------------------");
  }

//  public static void showSmartStudents(List<Student> ls) {
//    for (Student s : ls) {
//      if (s.getGpa() > 3) {
//        System.out.println("> " + s);
//      }
//    }
//    System.out.println("-------------------------");
//  }

//  public static List<Student> getSmartStudents(
//      List<Student> ls, double threshold) {
//    List<Student> rv = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.getGpa() > threshold) {
//        rv.add(s);
//      }
//    }
//    return rv;
//  }
//
//  public static List<Student> getEnthusiastic(List<Student> ls, int threshold) {
//    List<Student> rv = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.getCourses().size() > threshold) {
//        rv.add(s);
//      }
//    }
//    return rv;
//  }

  // passing an object for (mostly) the sole purpose of the
  // behavior it contains, called "Command" pattern
  public static List<Student> getByCriterion(
      List<Student> ls, StudentCriterion crit) {
    List<Student> rv = new ArrayList<>();
    for (Student s : ls) {
      if (crit.test(s)) {
        rv.add(s);
      }
    }
    return rv;
  }

  public static void main(String[] args) {
    List<Student> roster = List.of(
        new Student("Fred", 3.2, "Math", "Physics"),
        new Student("Jim", 2.2, "Art"),
        new Student("Sheila", 3.8, "Math", "Physics", "Quantum Mechanics", "Astrophysics")
    );
    showStudents(roster);
//    show(getSmartStudents(roster, 3.5));

    showStudents(getByCriterion(roster, new SmartCriterion()));
    showStudents(getByCriterion(roster, new EnthusiasticCriterion()));

//    show(filter(roster, x -> ...));

    Object str = new String("Hello");
//    Object crit = (StudentCriterion)((Student s) -> {return s.getGpa() < 3.5;})   ;
//    StudentCriterion crit = (Student s) -> {return s.getGpa() < 3.5;}   ;
//    StudentCriterion crit = (s) -> {return s.getGpa() < 3.5;}   ;
//    StudentCriterion crit = s -> {return s.getGpa() < 3.5;}   ;
//    StudentCriterion crit = (Student s) -> s.getGpa() < 3.5   ;
    StudentCriterion crit = s -> s.getGpa() < 3.5   ;

    showStudents(getByCriterion(roster, crit));

    Class cl = crit.getClass();
    System.out.println("Class of my lambda is " + cl.getName());
    Method[] methods = cl.getMethods();
    for (Method m : methods) {
      System.out.println("> " + m);
    }


  }
}

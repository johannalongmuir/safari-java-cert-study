package students2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//@FunctionalInterface
//interface Criterion<E> {
//  boolean test(E e);
//}
public class School {
  public static <E> void show(List<E> ls) {
    for (E s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("-------------------------");
  }

  public static <E> List<E> filter(
      List<E> ls, /*Criterion*/Predicate<E> crit) {
    List<E> rv = new ArrayList<>();
    for (E s : ls) {
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
    show(filter(roster, s -> s.getGpa()> 3));

    List<String> ls = List.of("One", "Three", "Five");
    show(filter(ls, s -> s.length() < 5));

    List<String> mutableList = new ArrayList<>(ls);
    mutableList.sort((s1, s2) -> s2.length() - s1.length());
    show(mutableList);
  }
}

package students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class QuestionN {
  public static void main(String[] args) {
//    Function<String, String> fss = s -> {
//      System.out.println(s);
//    };
//    Consumer<String> cs = s -> {
//      List<String> ls = new ArrayList<>();
//      System.out.println(s);
//      ls.add("Hello");
//    };

    Consumer<String> cs = s -> {
      System.out.println(s);
    };

//    Supplier<String> ss = (s1, s2) -> s1 + s2;
//    BiPredicate<String> bps = (String s) -> {
//      return s.length() > 0;
//    };
    ToIntFunction<String> tofs = s -> s.length();

    BiFunction<String, String, Integer> bfssi =
        (s1, s2) -> s1.length() - s2.length();
    ToIntBiFunction<String, String> tibfss =
        (s1, s2) -> s1.length() - s2.length();
    Comparator<String> cs2 = (s1, s2) -> s1.length() - s2.length();
  }
}

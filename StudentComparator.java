import java.util.*;
public class StudentComparator implements Comparator<Student> {
  public int compare(Student first, Student second) {
    if (first.getGpa() < second.getGpa()) {
      return -1;
    }
    else if (first.getGpa() > second.getGpa()) {
      return 1;
    }
    else {
      return 0;
    }
  }
}
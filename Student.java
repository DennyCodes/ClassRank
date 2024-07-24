public class Student {
  private double gpa;
  private String name;
  public Student (String n, double g) {
    gpa = g;
    name = n;
  }
  protected void setGpa(double n) {
    gpa = n;
  }
  public double getGpa() {
    return gpa;
  }
  protected void setName(String n) {
    name = n;
  }
  public String getName() {
    return name;
  }
  
  public String toString() {
    return name + ", " + String.valueOf(gpa);
  }
  
}
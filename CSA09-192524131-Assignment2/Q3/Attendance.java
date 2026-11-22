import java.util.*;
class Student {
    private final String regNo;
    public Student(String r) { this.regNo = r; }
    public boolean equals(Object o) { return o instanceof Student && Objects.equals(regNo, ((Student)o).regNo); }
    public int hashCode() { return Objects.hashCode(regNo); }
}
public class Attendance {
    public static void main(String[] args) {
        Set<Student> s = new HashSet<>();
        s.add(new Student("101"));
        s.add(new Student("101"));
        System.out.println("Unique Attendance Size: " + s.size());
    }
}

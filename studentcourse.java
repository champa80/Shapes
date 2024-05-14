/**
 * The `StudentCourses` class in Java represents a student's courses and marks for each semester,
 * allowing for adding courses with marks and displaying them.
 */
import java.util.ArrayList;
import java.util.List;

public class StudentCourses {
    int semno;

List<String> courses;
List<Integer> marks;
public StudentCourses(int semno){
    this.semno=semno;
    this.courses=new ArrayList<>();
    this.marks=new ArrayList<>();
}
public void addCourse(String course,int mark){
    courses.add(course);
    marks.add(mark);
}
public void displayCourses(){

    System.out.println("semester"+semno+"courses:");
    for(int i=0;i<courses.size();i++){
         System.out.println(courses.get(i)+":"+marks.get(i));
        
    }
}
    public static void main(String[] args) {
        
        StudentCourses sc1=new StudentCourses(1);
        sc1.addCourse("math", 45);
        sc1.addCourse("math2", 89);
        
        StudentCourses sc2=new StudentCourses(2);
        sc2.addCourse("math3", 40);
        sc2.addCourse("math4", 89);
       
        sc1.displayCourses();
        sc2.displayCourses();
    }
}

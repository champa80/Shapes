import java.time.LocalDate;
import java.time.Period;

public class studentt{
    private String name;
    private LocalDate dob;
    public studentt(String name,LocalDate dob){
        this.name=name;
        this.dob=dob;} 

    public void display(){
        System.out.println("Name is:"+name);
    }
    public void displayAge(LocalDate currDate){
        // LocalDate today=LocalDate.now(); 
        Period age=Period.between(dob,currDate);
        System.out.println("student age "+age.getYears());
    }
    public static void main(String[] args) {
        LocalDate dob=LocalDate.of(2000, 05, 24);
        studentt s1=new studentt("keeru",dob);
        s1.display();
        LocalDate currDate=LocalDate.now();     
        s1.displayAge(currDate);
    }
}




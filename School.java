import java.util.ArrayList;



public class School{

    private String name;
    private ArrayList<Student> studentBody;

    public School(String name){
        this.name=name;
        this.studentBody= new ArrayList<Student> ();

    }
    public String getName(){
        return this.name;
    }
    public boolean isEnrolled(Student s){
        return this.studentBody.contains(s);
    }

    public void enroll(Student s ){
        this.studentBody.add(s);

    
    }
    public void withdraw(Student s ){
        if(!isEnrolled(s)){
            throw new RuntimeException(s.name+ "is not enrolled");
        }
        this.studentBody.remove(s);}
    public static void main(String[] args){
        Student me=new Student("jordan", 2008);
        
        School smith= new School("smith college");
        smith.enroll(me);
    }

}
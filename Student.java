public class Student{
    String name;
    int classYear;
    OneCard card;

    public Student(String name, int classYear){
        this.name=name;
        this.classYear=classYear;
        this.card= new OneCard(this, 20.);
    }
    public static void main(String[] args){
        Student me=new Student("jordan", 2000);
    }

}


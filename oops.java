public class oops{
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Abhishek";
        s1.rno = 123;
        s1.password = "anbde34";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int rno;
    String password;
    int marks[];

    Student(Student s1){
        marks = new int[3];
        this.name = name;
        this.rno = rno;

        this.marks = s1.marks;

    }

    Student(){
        marks = new int[3];       //define in all constructors to ensure that each constructor knows that have only three subjects 
        System.out.println("Constructor is Called...");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int rno){
        marks = new int[3];
        this.rno = rno;
    }
}

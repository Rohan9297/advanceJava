package OOP.Concepts;

public class Student {
    public static void main(String[] args) {


        Teacher[] teacher=new Teacher[4];

        Teacher teacher1=new Teacher(13,"rohan",56);
        Teacher teacher2=new Teacher(13,"rohan",56);
        Teacher teacher3=new Teacher(13,"rohan",56);
        Teacher teacher4=new Teacher(13,"rohan",56);

        for (int i=0;i<teacher.length;i++){
            System.out.println(teacher.toString());
        }
    }
}


class  Teacher{

    int roll_no;
    String name;
    int marks;

    Teacher(int roll_no, String name,int marks){
        this.name=name;
        this.marks=marks;
        this.roll_no=roll_no;
    }
}
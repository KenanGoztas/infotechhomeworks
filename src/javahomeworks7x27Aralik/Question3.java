package javahomeworks7x27Aralik;

public class Question3 {
    static int x;
    int y;
    Question3(){
        x+=2;
        y++;
    }
    static int getSquare(){
        return x*x;
    }
    public static void main(String[] args) {
        Question3 sm1= new Question3();
        Question3 sm2= new Question3();
        int z= sm1.getSquare();
        System.out.println("-x" + z + "-y"+ sm2.y);
        System.out.println("**********");

        Counter c1= new Counter();
        Counter c2= new Counter();
        Counter c3= new Counter();

        System.out.println("*******");

        Student s1= new Student(111,"Karan", "MIT");
        Student s2= new Student(222,"Aryan", "Harvard");
        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(s1.number);
        System.out.println(s2.number);

        System.out.println(s1.collage);
        System.out.println(s2.collage);


    }
}
class Counter{
    int count = 0;
    Counter(){
        count++;
        System.out.println(count);
    }
}
class Student{
    int number;
    String name;
    static String collage = "ITS";

    public Student(int r, String n, String collage) {
        this.number = r;
        this.name = n;
        Student.collage = collage; //burada hata veriyor..this ile çağılamaz çünkü static

    }
}
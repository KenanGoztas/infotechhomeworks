package javahomeworks14;

public abstract class Student {
    int no;
    String name;
    int year;

    public Student(int no, String name, int year) {
        this.no = no;
        this.name = name;
        this.year = year;
    }
    public void study(){

    }
    public abstract void register();

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

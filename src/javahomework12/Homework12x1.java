package javahomework12;

public class Homework12x1 {
}
class ParentClass{
    public int getDetails(String temp){
        System.out.println("Devired class"+ temp);
        return 0;
    }
}
class Test01 extends ParentClass{

    public int getDetails(int temp){
        System.out.println("Test class"+ temp);
        return 0;
    }
    public String getDetails(String temp, int i){
        System.out.println("Test class"+ temp);
        return "";
    }
    public void getDetails(){
        System.out.println("**");
    }
    public static void main(String[] args) {
        Test01 obj= new Test01();
        obj.getDetails("GFG");
    }
}

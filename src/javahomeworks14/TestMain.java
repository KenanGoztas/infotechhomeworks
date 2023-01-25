package javahomeworks14;

public class TestMain {
    public static void main(String[] args) {
        RegistrationOffice ro=new RegistrationOffice();
        GraduateStudent graduateStudent= new GraduateStudent(22,"iii",44);
        ro.registerStudent(graduateStudent);
    }
    public double getPerimeter (Shape s) {
// Start with totalPerim = 0
double totalPerim = 0.0;
// Start wth prevPt = the last point 
Point prevPt = s.getLastPoint();
// For each point currPt in the shape,
for (Point currPt : s.getPoints()) {
// Find distance from prevPt point to currPt 
double currDist = prevPt.distance(currPt);
// Update totalPerim by currDist
totalPerim = totalPerim + currDist;
// Update prevPt to be currPt
prevPt = currPt;
}
// totalPerim is the answer
return totalPerim;
    }

    public void testPerimeter () {
        FileResource fr = new FileResource();
        Shape s = new Shape(fr);
        double length = getPerimeter(s);
        System.out.println("perimeter = " + length);
    }
}
class Shape{
    public Shape(FileResource fr) {
    }

    public Point getLastPoint() {
        return null;
    }

    public Point[] getPoints() {
    return null;
    }
}
class Point{

    public double distance(Point currPt) {
        return 0;
    }
}
class FileResource{

}
interface Abc{
    default void a() {

    }

}

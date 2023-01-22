package javahomeworks14;

public class PhdStudent extends GraduateStudent{
    public PhdStudent(int no, String name, int year) {
        super(no, name, year);
    }
    boolean qualifyingExamTaken;
    public void writePaper(){

    }

    @Override
    public void writeThesis() {
        super.writeThesis();
    }

    @Override
    public void meetWithAdvisor() {
        super.meetWithAdvisor();
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void register() {
        super.register();
    }
}

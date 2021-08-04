package practice07;

public class Klass {

    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public Student assignLeader(Student student) {
        this.leader = student;
        return this.leader;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }
}

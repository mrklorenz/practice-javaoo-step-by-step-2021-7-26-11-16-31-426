package practice08;

public class Klass {

    private final int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public Student assignLeader(Student student) {
        if(student.getKlass().getNumber() != this.number){
            System.out.print("It is not one of us.\n");
            return this.leader;
        }
        this.leader = student;
        return this.leader;
    }

    public void appendMember(Student student){
        this.leader = student;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }
}

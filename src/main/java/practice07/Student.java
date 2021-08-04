package practice07;

public class Student extends Person {

    private int id;
    private String name;
    private int age;
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.id = id;
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if (klass.getLeader() == null) {
            return super.introduce() + " I am a Student. I am at Class " + this.klass.getNumber() + ".";
        }
        return super.introduce() + " I am a Student. I am Leader of Class " + this.klass.getNumber() + ".";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public Klass getKlass() {
        return klass;
    }
}

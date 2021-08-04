package practice07;

public class Teacher extends Person {

    private String id;
    private String name;
    private int age;
    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String introduce(){
        if (this.klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + " I am a Teacher. I teach Class " + this.klass.getNumber() + ".";
    }

    public String introduceWith(Student student){
        if(student.getKlass().getNumber() == this.klass.getNumber()){
            return super.introduce()+ " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
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

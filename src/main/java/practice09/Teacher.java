package practice09;

import java.util.LinkedList;
import java.util.StringJoiner;

public class Teacher extends Person {

    private String id;
    private String name;
    private int age;
    private LinkedList<Klass> klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> klass) {
        super(id, name, age);
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String introduce(){
        if (this.klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }

        return super.introduce() + " I am a Teacher. I teach Class " + classStringBuilder() + ".";
    }

    public String introduceWith(Student student){
        if(student.getKlass().getNumber() == this.klass.get(0).getNumber()){
            return super.introduce()+ " I am a Teacher. I teach " + student.getName() + ".";
        }
        return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public String classStringBuilder()
    {
        StringJoiner result = new StringJoiner(", ");
        this.klass
                .stream()
                .map(klass -> klass.getNumber()+"")
                .forEach(result::add);
        return result.toString();
    }

    public boolean isTeaching(Student student){
        return this.klass.contains(student.getKlass());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public LinkedList<Klass> getClasses() {
        return this.klass;
    }
}

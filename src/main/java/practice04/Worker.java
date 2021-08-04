package practice04;

public class Worker extends Person{
    private String name;
    private int age;

    public Worker(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    @Override
    public String introduce(){
        return super.introduce() + " I am a Worker. I have a job.";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}

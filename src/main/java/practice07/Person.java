package practice07;

public class Person {

    private int id;

    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce(){
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

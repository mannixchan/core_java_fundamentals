package chapter_5.abstractClasses;

public class Student extends People{
    public String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    public String getDescription(){
        return "这位同学的专业是: " + major;
    }
}

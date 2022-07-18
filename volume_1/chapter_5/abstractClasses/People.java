package chapter_5.abstractClasses;

public abstract class People {
    public abstract String getDescription();
    private String name;
    public People(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

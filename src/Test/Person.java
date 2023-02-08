package Test;

import java.util.List;
import java.util.Map;

public class Person {
    private int age;
    private String name;
    private List<Map<String, String>> belongs;

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBelongs(List<Map<String, String>> belongs) {
        this.belongs = belongs;
    }

    public String getName() {
        return name;
    }

    public List<Map<String, String>> getBelongs() {
        return belongs;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", belongs=" + belongs +
                '}';
    }


}

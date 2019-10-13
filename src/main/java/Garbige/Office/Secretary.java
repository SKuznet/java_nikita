package Garbige.Office;

import java.util.ArrayList;

public class Secretary {

    String name;
    int age;
    boolean education;
    boolean ExpOfWork;

    public Secretary(String name, int age, boolean education, boolean ExpOfWork) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.ExpOfWork = ExpOfWork;
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", education=" + education +
                ", ExpOfWork=" + ExpOfWork +
                '}';
    }
}

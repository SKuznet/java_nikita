package com.lesson5;

public class Riska {

    private String string1;
    private String string2;
    private String string3;

    public Riska(String string1) {
        // this без точки, НО С () = вызов конструктора
        this(string1, "asd");
    }

    public Riska(String string1, String string2) {
        this(string1, string2, "asdasd");
    }

    public Riska(String string1, String string2, String string3) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
    }

    public static void main(String[] args) {
        Riska r = new Riska("Riska");
        r.getThis();
    }

    private void getThis(){
       synchronized (this) {

       }
    }

    @Override
    public String toString() {
        return "Riska{" +
                "string1='" + string1 + '\'' +
                ", string2='" + string2 + '\'' +
                ", string3='" + string3 + '\'' +
                '}';
    }
}

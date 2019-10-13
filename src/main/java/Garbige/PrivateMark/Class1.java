package Garbige.PrivateMark;

public class Class1 extends Class2 {
    private int mark1 = 2;
    private int mark2 = 3;



    public void setMark1(int mark1) {
        this.mark1 = mark1;
        System.out.println(mark1);
    }
    public int getMark1(int i) {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }
    public void print(String o){
        System.out.println();
        System.out.println(o);
    }

}

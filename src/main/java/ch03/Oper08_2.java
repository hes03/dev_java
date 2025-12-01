package ch03;
class Y{
    int ival;
}
public class Oper08_2 {
    public static void main(String[] args) {
        Y y1 = new Y();
        Y y2 = y1;
        y2.ival = 100;
        System.out.println(y1 == y2);
        System.out.println(y1.ival+", "+y2.ival);
    }
}

package task_1;

import java.util.StringTokenizer;

public class Task_01 {
    public static void main(String[] args) {
        Email e = new Email("adil012","Waqar001","Bunk","Chalo ao bunk karen",03123445213);
        SMS s = new SMS("hello",12);
        System.out.println(e.tostring());
        System.out.println(s.tostring());

    }

}

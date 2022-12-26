package MainProject;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Mouse mo=new Mouse("小老鼠",0);
        mo.introduction();
        mo.move();
//        mo.eat();
//        mo.sleep();
        Penguin pe =new Penguin("小企鹅",0);
        pe.introduction();
        pe.move();
//        pe.eat();
//        pe.sleep();
    }
}



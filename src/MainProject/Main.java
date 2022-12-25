package MainProject;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.println("next 方式接收：");
        if(s.hasNext()){
            String str = s.next();
            System.out.println(str);
        }
        s.close();
    }
}



package MainProject;
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Overload o=new Overload();
        o.test();
        o.test(1);
        o.test(1,"sasd");
        o.test("asdasdas",45);
    }
}



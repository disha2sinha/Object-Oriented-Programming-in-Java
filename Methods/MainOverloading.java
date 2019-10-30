
// A Java program with overloaded main() 
import java.io.*;

class MainOverloading{

    // Normal main()
    public static void main(String[] args) {
        System.out.println("Hello world (from main)");
        MainOverloading.main("Disha");
    }

    // Overloaded main methods
    public static void main(String arg1) {
        System.out.println("Hi, " + arg1);
        MainOverloading.main("Dear ppl", "Hello all");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("Hi, " + arg1 + ", " + arg2);
    }
}

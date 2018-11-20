import java.io.File;
import java.io.PrintWriter;

class Example1{
    public static void main(String[] args) {
        try(PrintWriter writer = new PrintWriter(new File("1.txt"))) {
            writer.write("write in file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
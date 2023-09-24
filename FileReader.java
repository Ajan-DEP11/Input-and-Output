import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class FileReader {
    public FileReader(String string) {
    }

    public static void main(String[] args) {
        File file = new File("read.txt");
        try{
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write(" Hello World,we are born to code");
        System.out.println("Done");
        fileWriter.close();
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            FileReader fileReader = new FileReader(file);
            System.out.println((char)fileReader.read());

        }catch(Exception e){
            System.out.println(e);
        }

      
    }
}

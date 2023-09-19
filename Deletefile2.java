import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Deletefile2 {
    public static void main(String[] args) {

        File file = new File("Dep11");
        boolean delete = file.delete();
        System.out.println(delete? "file deleted":"file not exist");

        Path path = Paths.get("Ajan.txt");

      try { 
        
        Files.delete(path);
        System.out.println("file2 deleted");
        }catch(FileNotFoundException e){
            System.out.println("file not exist");
        }catch(IOException e){
            System.out.println("IO working");
            e.getStackTrace();

        }

        
    }

}

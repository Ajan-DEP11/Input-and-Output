import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
    public static void main(String[] args) {

         File file = new File("/home/ajan/Desktop/Ajan");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir?"file created":"file ALREADY EXIST");

        Path PathRef = Paths.get("/home/ajan/Desktop/Ajan new file");

         try{   
            Files.createDirectories(PathRef);
            System.out.println("folder created");
            }catch(FileAlreadyExistsException e){
                System.out.println("file already exist");
            }catch(IOException e){
                System.out.println("IO implmented");
                e.getStackTrace();
            }
        
    }
}
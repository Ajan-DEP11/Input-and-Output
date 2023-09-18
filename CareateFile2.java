import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Path;;

public class CareateFile2 {
    public static void main(String[] args) {
         File file = new File("Ajan.txt");
         boolean mkdir = file.mkdir();
         System.out.println(mkdir?"file created":"Not created");


         Path path = Paths.get("Dep11");
         try{
            Files.createDirectories(path);


         }catch(FileAlreadyExistsException e){
            System.out.println("file already exist");
            System.out.println("Path already exist");

         }catch(IOException e){
            System.out.println("IO already implemented");
            e.printStackTrace();

         }


        
    }
}

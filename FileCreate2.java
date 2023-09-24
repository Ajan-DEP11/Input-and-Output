import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class FileCreate2 {
    public static void main(String[] args) throws FileAlreadyExistsException{

        File file = new File("ajan.txt");
        try{

        boolean createNewFile = file.createNewFile();
        System.out.println("File created");
        System.out.println(file.createNewFile());
        System.out.println(file.getPath());
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.canExecute());
        System.out.println(file.canWrite());
       // } catch(FileAlreadyExistsException e){
         //   System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }


        
    }
}

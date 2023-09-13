import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args) {
        
        File filePath = new File("/home/ajan/Desktop/Ajan");
        boolean delete = filePath.delete();
        System.out.println(delete ? "file deleted":"file not exist");

        File file2 = new File("/home/ajan/Desktop/abc.txt");
        boolean delete2 = file2.delete();
        System.out.println(delete2 ? "file deletd":"file not exist");

        Path path1 = Paths.get("/home/ajan/Desktop/New Folder");

        try{       
            Files.delete(path1);
                System.out.println("file deleted");
            }catch(DirectoryNotEmptyException e){
                System.out.println("file not empty hence can not delete");
            }catch(IOException e){
                System.out.println("IO working");
                e.getStackTrace();
            }
    }
}

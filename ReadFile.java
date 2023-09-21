import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("README.txt");
       FileInputStream fis = new FileInputStream(file);
        
    }
}

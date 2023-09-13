import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        
        File filePath = new File("/home/ajan/Desktop/Ajan");
        boolean delete = filePath.delete();
        System.out.println(delete ? "file deleted":"file not exist");
    }
}

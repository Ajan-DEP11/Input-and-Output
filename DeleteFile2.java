import java.io.File;

public class DeleteFile2 {
    public static void main(String[] args) {
        File fileRef = new File("/home/ajan/Desktop/Ajan new file");
        if(fileRef.isDirectory()){
            File[] ListFiles = fileRef.listFiles();

            for(File file : ListFiles){
                file.delete();
                System.out.println(file + "Deleted");
            }
        }
        fileRef.delete();
        System.out.println("File Deleted");
    }
}

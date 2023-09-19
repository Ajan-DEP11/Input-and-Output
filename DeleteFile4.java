import java.io.File;

public class DeleteFile4 {
    public static void main(String[] args) {
        File file = new File("Ajan");
        if(file.isDirectory()){
            File[] listFiles = file.listFiles();
            for(File file2 : listFiles){
                file2.delete();
                System.out.println(file2 + "File list is deleted");

            }
        }
        file.delete();
        System.out.println("folder deleted");
        
    }
}

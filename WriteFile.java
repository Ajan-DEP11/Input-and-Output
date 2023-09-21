import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws FileNotFoundException{
        File filePath = new File("ajanFile.txt");

      try { 
        filePath.createNewFile();
        }catch(IOException e){
            System.out.println("Failed to create file");
            e.printStackTrace();
            return;

        }
        FileOutputStream fos = new FileOutputStream(filePath);
        try{
            String txt = "i'm going to write something here. this is my io working file";
            byte[] bytes = txt.getBytes();
            for(byte b : bytes){
                fos.write(b);
            }

            fos.close();
        }catch(IOException e){
            System.out.println("failed to write the file");
            e.printStackTrace();

        }
    }
}

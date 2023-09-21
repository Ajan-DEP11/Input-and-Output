import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFile{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("README.txt");
       FileInputStream fis = new FileInputStream(file);
       try{
        int readByte = 0;
        int totalByte = 0;

       while(readByte != -1) {
        
        readByte = fis.read();
        totalByte++;
        System.out.print((char)readByte);

        }
        System.out.println("total byte read:"+(totalByte -1));
        fis.close();

       }catch(IOException e){
        System.out.println("fail to complete the reading process");
        e.printStackTrace();

       }
        
    }
}

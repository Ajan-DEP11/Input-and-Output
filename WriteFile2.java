import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteFile2 {
    public static void main(String[] args) {

        try{
        
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Ijse.txt",false));
        bufferedWriter.write("Hello world\n");
        bufferedWriter.write("we are born to code\n");
        bufferedWriter.append("im a softwere Engineer");
        bufferedWriter.close();

        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e);

        }
    }
}

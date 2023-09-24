import java.io.FileWriter;

public class WriteFile1 {
    public static void main(String[] args) {
        String txt = "My Name is ajan eshwara, i'm a software engineer";
        try{
         FileWriter Writer = new FileWriter("Dep11.txt");
         Writer.write(txt);
         Writer.close();
         System.out.println("file write complted");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

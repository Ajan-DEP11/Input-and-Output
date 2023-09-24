import java.io.FileWriter;

public class WriteFile1 {
    public static void main(String[] args) {
        String txt = " we are born to code and so we are going to some new projects with the coders..";
        try{
         FileWriter Writer = new FileWriter("Dep11.txt",true); // append true in the file writer.
         Writer.write(txt);
         Writer.close();
         System.out.println("file write complted");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

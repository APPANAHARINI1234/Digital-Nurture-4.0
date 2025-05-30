package program_22;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
import java.nio.file.*;
public class FileWriting {
    public static void main(String[] args) throws Exception {
      // for writing use FileWriter object and Files
      //.delete for delete
      //for append mode under FileWriter use argument true
      File file = new File("example.txt");
      if(file.createNewFile()){
        System.out.println("new file created");
      }
      else{
        System.out.println("already existed");
      }

      FileWriter fw = new FileWriter("example.txt");
      fw.write("welcome to new world");

      List<String>list = Arrays.asList("by using Files class","end");
      Files.write(Paths.get("example.txt"),list);
    }

}

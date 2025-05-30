package program_23;
import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.List;
import java.nio.file.*;
public class FileReading {
    public static void main(String[] args) throws Exception {
    //two ways we can handle files 1. File 2. Files
    //using file class you can do line by line read and write
    //using files do readAll
    File file = new File("example.txt");
        if(file.createNewFile()){
            System.out.println("File created "+file.getName());
        }
        else{
            System.out.println("Already existed");
        }

    //reading files
    Scanner sc = new Scanner(file);
     while(sc.hasNextLine()){
        System.out.println(sc.nextLine());
     }
     sc.close();
     //using files
    List<String>lines = Files.readAllLines(Paths.get("example.txt"));
    for(String x : lines){
        System.out.println(x);
    }
    }

}

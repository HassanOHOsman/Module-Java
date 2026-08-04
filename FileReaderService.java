import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderService {
    String readFile(String filename) {

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Could not read file");
        }


    }

    static void main(String[] args) {

    }
}

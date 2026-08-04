import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderService {
    String readFile(String filename) {

        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }


    }

    static void main(String[] args) {

    }
}

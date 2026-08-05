import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderService {
    String readFile(String filename) {

        BufferedReader bufferedReader = null;
        String line;
        String fileContent = "";

        try{
            bufferedReader = new BufferedReader(new FileReader(filename));

            while((line = bufferedReader.readLine()) != null) {
                fileContent += line;
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Could not read file");
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }

        }
        return fileContent;


    }

    static void main(String[] args) {

    }


}

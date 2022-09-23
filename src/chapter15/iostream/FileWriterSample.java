package chapter15.iostream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("\\Users\\user>\\test.txt")){
            fileWriter.write("Just Do it!!");

        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}

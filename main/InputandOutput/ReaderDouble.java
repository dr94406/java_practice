package InputandOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDouble {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("d:/output.txt"));
        while (true) {
            String line = br.readLine();
            if(line == null) break;
            System.out.println(line);
        }
        br.close();
    }
}

package InputandOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class Fileread {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("d:/output.txt");
        input.read(b);
        System.out.println(new String(b)); // byte [] -> String
        input.close();
    }
}

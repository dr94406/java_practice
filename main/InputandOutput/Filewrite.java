package InputandOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class Filewrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("d:/out.txt");
        for(int i = 1; i < 11; i++) {
            String data = i+" 번째 줄입니다. \r\n";

            Filewrite filewrite = new Filewrite();
            output.write(data.getBytes());
        }
        output.close();

    }
}

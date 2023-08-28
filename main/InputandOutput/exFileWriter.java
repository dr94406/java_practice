package InputandOutput;

import java.io.FileWriter;
import java.io.IOException;

public class exFileWriter {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d:/outputted.txt");
        for (int i = 1; i < 11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();

        // 파일을 추가모드로 개방
        FileWriter fw2 = new FileWriter("d:/output.txt", true);
            for(int j = 11; j < 21; j++) {
                String data2 = j+" 번째 줄입니다이!.\r\n";
                fw2.write(data2);
        }
            fw2.close();
    }
}

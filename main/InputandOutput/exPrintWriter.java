package InputandOutput;

import java.io.IOException;
import java.io.PrintWriter;

public class exPrintWriter {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("d:/outputTest.xlsx");
        for (int i = 1; i < 11; i++) {
            String data = i+" 번째 줄이당 !";
            pw.println(data);
        }
        pw.close();
    }
}

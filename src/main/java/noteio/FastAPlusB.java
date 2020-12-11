package noteio;

import java.io.*;

public class FastAPlusB {

    public static void main(String[]args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(bufferedReader.readLine().trim());

        for (int index = 0; index < len; index++) {
            String[] paramStr = bufferedReader.readLine().split(" ");

            int numA = Integer.parseInt(paramStr[0]);
            int numB = Integer.parseInt(paramStr[1]);
            bufferedWriter.write((numA+numB)+"\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

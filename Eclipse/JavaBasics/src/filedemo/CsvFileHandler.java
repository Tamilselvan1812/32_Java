package filedemo;

import java.io.*;

public class CsvFileHandler {
    public static void main(String[] args) {
        String inputFile = "D:\\Tamil\\data.csv";
        String outputFile = "D:\\Tamil\\output.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            System.out.println("All rows saved to " + outputFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package br.com.files;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class manipulateFilesApplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String dirPath = "C:\\Users\\henrique.matos\\IdeaProjects\\POO\\src\\br\\com\\files\\sourceFiles";
        String path = "C:\\Users\\henrique.matos\\IdeaProjects\\POO\\src\\br\\com\\files\\sourceFiles\\sourceFile.csv";

        Boolean outFolder = new File(dirPath + "\\out").mkdir();
        String outFilePath = dirPath + "\\out" + "\\outFile.csv";

        List<String> formatedLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null) {
                String[] contentLine = line.split(",");
                double totalPrice = Double.parseDouble(contentLine[1]) * Double.parseDouble(contentLine[2]);
                formatedLines.add(String.format("%s,%.2f", contentLine[0], totalPrice));
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFilePath))){
            for (String formatedLine : formatedLines) {
                bw.write(formatedLine);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

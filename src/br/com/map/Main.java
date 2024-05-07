package br.com.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();
        Map<String, Integer> votes = new LinkedHashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null) {
                String[] lineContent = line.split(",");
                String key = lineContent[0];
                int value = Integer.parseInt(lineContent[1]);
                if (votes.containsKey(lineContent[0])) {
                    votes.put(key, votes.get(key) + value);
                } else {
                    votes.put(key, value);
                }
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (String key : votes.keySet()) {
            System.out.println(key + ": " + votes.get(key));
        }
    }
}

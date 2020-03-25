package hu.botondudvardi.customers;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Customer {

    static Map<String, Double> Name = new HashMap<String, Double>();
    static Map<String, Double> MotherName = new HashMap<String, Double>();
    static Map<String, Double> DoB = new HashMap<String, Double>();
    static Map<String, Double> PoB = new HashMap<String, Double>();
    static Map<String, Double> AccStart = new HashMap<String, Double>();
    static Map<String, Double> AccNo = new HashMap<String, Double>();
    static Map<String, Double> Balance = new HashMap<String, Double>();
    static Map<String, Double> Deposit = new HashMap<String, Double>();


    public static void main(String[] args){

        importData();
    }

    static void importData() {

        File f = new File("C:\\Users\\Botond\\ProjectMarch/ugyfelek.csv");
        BufferedReader br = null;
        Scanner scanner;


        try {
            br = new BufferedReader(new FileReader(f));
            String currentLine;

            while ((currentLine = br.readLine()) != null) {

                scanner = new Scanner(currentLine);

                System.out.println(currentLine);
            }

        } catch (FileNotFoundException fnfe) {

            fnfe.printStackTrace();

        } catch (IOException ioe) {

            ioe.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

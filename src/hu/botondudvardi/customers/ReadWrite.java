package hu.botondudvardi.customers;

import java.io.*;

public class ReadWrite {

    public static void main(String[] args){

        importData();
    }

    static void importData() {

        File f = new File("C:\\Users\\Botond\\ProjectMarch/ugyfelek.csv");
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(f));
            String currentLine;

            while ((currentLine = br.readLine()) != null) {



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


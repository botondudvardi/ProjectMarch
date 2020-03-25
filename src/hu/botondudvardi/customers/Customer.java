package hu.botondudvardi.customers;

import java.io.*;

public class Customer {




    public static void main(String[] args){

        importData();
    }

    static void importData() {

        BufferedReader br = null;


        try {
            br = new BufferedReader(new FileReader(new File("C:\\Users\\Botond\\ProjectMarch/ugyfelek.csv")));
            String line;


            while ((line = br.readLine()) != null) {

                System.out.println(line);
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

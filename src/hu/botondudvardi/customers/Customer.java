package hu.botondudvardi.customers;


import java.util.Comparator;

public class Customer {



    private String name;
    private String motherName;
    private String dateOfBirth;
    private String postOfBox;
    private String accountStart;
    private String accountNumber;
    private int balance;
    private int deposit;

    public Customer(String[] table) {

        name = table[0];
        motherName = table[1];
        dateOfBirth = table[2];
        postOfBox = table[3];
        accountStart = table[4];
        accountNumber = table[5];
        balance = Integer.parseInt(table[6]);
        deposit = Integer.parseInt(table[7]);

    }


    public String getName() {
        return name;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPostOfBox() {
        return postOfBox;
    }

    public String getAccountStart() {
        return accountStart;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public int getDeposit() {
        return deposit;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", motherName='" + motherName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", postOfBox='" + postOfBox + '\'' +
                ", accountStart='" + accountStart + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", deposit=" + deposit +
                '}';
    }
}

class TakeAccStart implements Comparator{

    public int compare(Object o1, Object o2){


        return

    }
}

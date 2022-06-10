package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class CreateLog {
    File transactionLog = new File("Log.txt");
    HandleMoney moneyHandle = new HandleMoney();

    public void createLog(){

        try {
            FileOutputStream file = new FileOutputStream(transactionLog);
            PrintWriter fileWriter = new PrintWriter(file);
            /* create feedMoney method and in method put the code below */
//            feedMoney();
//            fileWriter.printf(LocalDateTime.now() + " FEED MONEY: $" + takeMoney.deposit(bDUserAmountEntered) +  " $" + takeMoney.getBalance();   );
            moneyHandle.makeChange();
            fileWriter.close();
        } catch (FileNotFoundException fnf){
            System.out.println("No file to write in");
        }


    }
}

package main.java;

import com.sun.jmx.snmp.SnmpStatusException;

/**
 * Created by bingwang on 2/16/17.
 */
public class FuzzBuzzPrinter {
    public void fuzzbuzz() {
        for (int i = 1; i <= 100; i++) {
            boolean dividedby3 = ifDividedBy3(i);
            boolean dividedby5 = ifDividedBy5(i);
            String output = getResult(i, dividedby3, dividedby5);
            System.out.print(output+"\n");
        }
    }

    private String getResult(int number, boolean dividedby3, boolean dividedby5) {
        if (dividedby3 && dividedby5) {
            return "fuzzbuzz";
        }
        if (dividedby3) {
            return "fizz";
        }
        if (dividedby5) {
            return "buzz";
        }
        return String.valueOf(number);
    }

    private boolean ifDividedBy5(int i) {
        int left = i % 5;
        if (left == 0) {
            return true;
        }
        return false;
    }

    private boolean ifDividedBy3(int i) {
        int left = i % 3;
        if (left == 0) {
            return true;
        }
        return false;
    }
}

package com.company;

public class DefangingAnIp {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangAnIpp(address));
    }

    // defang method (solution)
    public static String defangAnIpp(String address) {
        String res = "";
        for (Character ch : address.toCharArray()) {
            if (ch == '.') {
                res += "[.]";
            } else {
                res += ch;
            }
        }
        return res;
    }
}
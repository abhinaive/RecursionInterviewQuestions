package org.recursion;

public class ConvertDecimalToBinary {

    public static String findBinaryofDecimal(int decimal, String result){

        if(decimal == 0){
            return result;
        }

        result = (decimal % 2) + result;

        return findBinaryofDecimal(decimal/2,result);

    }

    public static void main(String[] args) {

        System.out.println(ConvertDecimalToBinary.findBinaryofDecimal(233,""));;

    }
}


package org.recursion;

public class StringReversal {

    public static String stringReversalUsingUsingRecursion(String str){

        if(str.equals(""))
            return "";

        return stringReversalUsingUsingRecursion(str.substring(1)) + str.charAt(0);

    }

    public static void main(String[] args) {

        String str = "ABHINAV";

        System.out.println(StringReversal.stringReversalUsingUsingRecursion(str).toString());

    }
}

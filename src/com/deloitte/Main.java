package com.deloitte;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // User input
        Scanner in = new Scanner(System.in);
        String userDate = in.nextLine();
        System.out.println(userDate);
        // Calculate diff
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        try {
            Date dt1 = sdf.parse(userDate);
            Date today = new Date();
            long diffInMillis  = Math.abs(today.getTime() - dt1.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
            System.out.println(diff);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }



    }
}

package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код 2013-08-18
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = df.parse(reader.readLine());

        //System.out.println(date);

        SimpleDateFormat df2 = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(df2.format(date).toUpperCase());


    }
}

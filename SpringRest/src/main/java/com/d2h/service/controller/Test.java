/**
 * 
 */
package com.d2h.service.controller;

import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;

/**
 * @author Hemant
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date today = new Date();
			System.out.println(sdf.format(today));
		
		/*Date curDate = new Date();
		        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
		        
		        String DateToStr = format.format(curDate);
		        System.out.println(DateToStr);
		        format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		        DateToStr = format.format(curDate);
		        System.out.println(DateToStr);
		        format = new SimpleDateFormat("dd MMMM yyyy zzzz", Locale.ENGLISH);
		        DateToStr = format.format(curDate);
		        System.out.println(DateToStr);
		        format = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		        DateToStr = format.format(curDate);
		        System.out.println(DateToStr);
		        try {
		            Date strToDate = format.parse(DateToStr);
		            System.out.println(strToDate);
		        } catch (ParseException e) {
		            e.printStackTrace();
		        }*/

		
		/*
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateInString = "22-01-2015 10:20:56";
		Date date =  null;
		try {
			date = sdf.parse(dateInString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
			
		System.out.println(dateInString);
		System.out.println("Date - Time in milliseconds : " + date.getTime());

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println("Calender - Time in milliseconds : " + calendar.getTimeInMillis());
		
		
		Calendar cal = Calendar.getInstance();
//		cal.setTime(new Date());
		for (int i = 0; i < 10; i++) {
			long millis = cal.getTimeInMillis();
			System.out.println("millis --------------------- "+"ST-Add-"+millis);
			Thread.sleep(1000);
		}
		
		System.out.println("ST-Add-1447234275524");
		System.out.println("ST-Add-1447234485952");
		String mobile = "998733077";
		System.out.println("Unique No : "+mobile.hashCode());
		for (int i = 0; i < 9; i++) {
//			System.out.println("---------------- "+generateUniqueId());
		}
		System.out.println(generatePassword());
        System.out.println(generatePassword());
        System.out.println(generatePassword());
		
	*/}
	

	public static String generateUniqueId() {      
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        return str;
    }
	public static String generatePassword() {
        String chars = "abcdefghijklmnopqrstuvwxyz"
                     + "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                     + "0123456789!@%$%&^?|~'\"#+="
                     + "\\*/.,:;[]()-_<>";

        final int PW_LENGTH = 20;
        Random rnd = new SecureRandom();
        StringBuilder pass = new StringBuilder();
        for (int i = 0; i < PW_LENGTH; i++)
            pass.append(chars.charAt(rnd.nextInt(chars.length())));
        return pass.toString();
    }

//    public static void main(String[] args) {
        
//    }
}

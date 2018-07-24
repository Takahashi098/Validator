/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author DELL
 */
public class DateValidator {
    
    public boolean checkDateFormat (String date) {
        
        return date.matches("\\d{2}[/]\\d{2}[/]\\d{4}");
    }
    
    public boolean validateDate (String date) {
        
        if (checkDateFormat(date)) {
            
            int month = Integer.parseInt(date.substring(0, 2));
            int day = Integer.parseInt(date.substring(3, 5));
            int year = Integer.parseInt(date.substring(6, 10));

            if (day < 0 || day > 31 || month < 0 || month > 12) {
                return false;
            }
            else if (day > 30 && (month == 2 || month == 4 || month == 6 || month == 9 ||month == 11)) {
                return false;
            }
            else if (day > 29 && month == 2) {
                return false;
            }
            else if ((day == 29 && month == 2) && !((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
                return false;
            } 
        }
        return true; 
    }
}

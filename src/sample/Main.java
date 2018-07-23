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
public class Main {
    
    public static void main(String[] args) {
        
        System.ou("Đây là lần commit 4");
        String date = "12/12/2016";
        DateValidator validator = new DateValidator();
        if (validator.checkDateFormat(date)) {
            if (validator.validateDate(date)) {
                System.out.println(date + " is valid");
            }
            else {
                System.out.println(date + "is invalid");
            }
        }
        else {
            System.out.println("Date format invalid");
        }
    }
}

package TicketBooking;

import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.print("Enter no. of Tickets you want book : ");
        int quantity= scan.nextInt();

        int age;
        int sum=0;
        for (int i = 0; i <quantity ; i++) {
            System.out.print("Enter Age: ");
            age= scan.nextInt();

            if(age<=12){
                sum+=20;
            }
            else if(age>12 && age<60){
                sum+=50;
            }
            else {
                sum+=30;
            }

        }

        System.out.println("Total Quantity : "+quantity);
        System.out.println("Total Amount : "+sum);

    }



}
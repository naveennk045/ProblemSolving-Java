package MenuCard;

import java.util.Scanner;

public class MenuCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("""
                pizza=200
                burger =150
                biriyani = 250
                dosa =80
                idly = 50
                """);

        System.out.print("Enter Number of items : ");
        int n= scan.nextInt();

        int total=0;
        for (int i = 0; i < n; i++) {

            System.out.print("Enter Item "+(i+1)+" : ");
            String item= scan.next().toLowerCase();
            switch(item){
                case "pizza" :
                    total+=200;
                    break;
                case "burger" :
                    total+=150;
                    break;
                case "biriyani" :
                    total+=250;
                    break;
                case "dosa":
                    total+=80;
                    break;
                case "idly":
                    total+=50;
                    break;
                default:
                    System.out.println("Choose your Item");
                    break;
             }
        }
        System.out.println("Total Amount ₹"+total);
    if(total>500){
        total=(int)(total*0.9);
        System.out.println("Total Amount after discount is ₹"+total);
    }
    }
}
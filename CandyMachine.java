package candymachine;

import java.util.Scanner;

public class CandyMachine {

static double money;//must be a global variable so it could be accessed from all methods.
    //you declared it in verse2() method what means that you can ONLY access it in verse2().

    public static void main(String[] args) {
        verse1();
        System.out.println();
        verse2();
        System.out.println();
        verse3();
        System.out.println();
        verse4();
    }

    public static void verse1() {
        System.out.println("*** Welcome to Cath's Candy Machine! ***");
        System.out.println("(Taste the Virtual Sweetness that we offered!)");
    }

    public static void verse2() {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter you money! >"); //prompts for a whole number
        money = console.nextDouble();
        System.out.printf("%.2f, The total money you entered!", money);
    }

    public static void verse3() {
        System.out.println("Please enter your selection!");
        System.out.println("A ₱20.00 Candt");
        System.out.println("B ₱50.00 Chips");
        System.out.println("C ₱10.00 Gum");
        System.out.println("D ₱100.00 Cookies");
    }

    public static void verse4() {
        Scanner input = new Scanner(System.in);
        System.out.print("So, What do you want? >"); //prompts for a whole number
        String a = input.next();
        double change = 00;//the amount of change to give back.
        //check which candy they picked as well as if the money is equal or larger than the price.
        //not the >= is very important, you only had >.
        if (a.equals("A") && money >= 20.00) {
            change = money - 20.00;//calculate the change by doing the money - price of candy.            
            System.out.println("Thanks for purchasing candy through us. Hope you Enjoy!");
            System.out.println("Please take your candy and your ₱" + change + " change!");
        } else if (a.equals("B") && money >= 50.00) {//same thing for item B, and check the price
            change = money - 50.00;
            System.out.println("Thanks for purchasing candy through us. Hope you Enjoy!");
            System.out.println("Please take your candy and your ₱" + change + " change!");
        } else if (a.equals("C") && money >= 10.00) {//same thing for item C, and check the price
            change = money - 10.00;
            System.out.println("Thanks for purchasing candy through us. Hope you Enjoy!");
            System.out.println("Please take your candy and your ₱" + change + " change!");
        } else if (a.equals("D") && money >= 100.00) {//same thing for item D, and check the price
            change = money - 100.00;
            System.out.println("Thanks for purchasing candy through us. Hope you Enjoy!");
            System.out.println("Please take your candy and your ₱" + change + " change!");
        }//now do items C,D,E in with the same logic.
        //now you need to make sure that's maybe the user doesn't have enough money...
        //you would you the else{...} to prompt to user that the money is not enough.
    }

}

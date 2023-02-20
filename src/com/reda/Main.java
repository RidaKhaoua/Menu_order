package com.reda;

import java.sql.Array;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    static float price = 0;
    static int numberChoose = 0;
    static  boolean flag = true;
    static void showMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("*****************Menu Food***************");
        System.out.println("1- Make an Order");
        System.out.println("2- Canncel");

        while (flag) {
            System.out.println("What do you want choose");
            numberChoose = in.nextInt();
            switch (numberChoose) {
                case 1:
                    flag = false;
                    displayMenu();
                    break;
                case 2:
                    System.out.println("Good By");
                    flag = false;
                    break;
                default:
                    System.out.println("The Value is incorrect");
                    break;
            }
        }

    }

    static void displayMenu() {
        Scanner in = new Scanner(System.in);
        flag = true;
        System.out.println("********** Menu ********");
        System.out.println("1- Food");
        System.out.println("2- Drinks");
        System.out.println("3- Snacks");
        System.out.println("0- Canncel");
        while (flag) {
            System.out.println("Enter which Food do you want");
            numberChoose = in.nextInt();
            menuChoose(numberChoose);
        }

    }

    static void menuChoose(int numberChoose) {
        switch (numberChoose) {
            case 0:
                flag = false;
                System.out.println("Good by");
                break;
            case 1:
                showFood();
                flag = false;
                break;
            case 2:
                showDrinks();
                flag =  false;
                break;
            case 3:
                showSnacks();
                flag = false;
                break;

             default:
                 System.out.println("the value is invalid");
                 flag = true;
                 break;
        }
    }

    static  void showFood() {
        Scanner in = new Scanner(System.in);
        flag = true;
        System.out.println("************** Food *********");
        System.out.println("100- Pizza");
        System.out.println("101- Gratin");
        System.out.println("102- Tajin");
        System.out.println("103- Soup");
        System.out.println("104- Sandwish");
        System.out.println("1- finish");
        System.out.println("0- Return Menu");
        while (flag) {
            System.out.println("Enter number Food");
            numberChoose = in.nextInt();
            switch (numberChoose) {
                case 1:
                    showTotal(price);
                    flag = false;
                    break;
                case 0:
                    displayMenu();
                    flag = false;
                    break;
                case 100:
                    showPticeTheFood("Pizza", 8.20f);
                    calculeOrder(8.20f);
                    flag = true;
                    break;
                case  101:
                    showPticeTheFood("Gratin", 3.20f);
                    calculeOrder(3.20f);
                    flag = true;
                    break;
                case  102:
                    showPticeTheFood("Tajin", 3.0f);
                    calculeOrder(3.0f);
                    break;
                case  103:
                    showPticeTheFood("Soup", 2.0f);
                    calculeOrder(2.0f);
                    flag = true;
                    break;
                case  104:
                    showPticeTheFood("Sandwisch", 4.10f);
                    calculeOrder(4.10f);
                    flag = true;
                    break;
                 default:
                     System.out.println("The value is invalid");
                     flag = true;
                     break;
            }
        }
    }

    static  void showPticeTheFood(String nameFood, float price) {
        System.out.println("The price of " + nameFood  + " is: " + price + "$");
    }

    static  void  showDrinks() {
        Scanner in = new Scanner(System.in);
        flag = true;
        System.out.println("************* Drinks ***********");
        System.out.println("20- Coca cola");
        System.out.println("21- Sprite");
        System.out.println("1- finish");
        System.out.println("0- Return Menu");
        while (flag) {
            System.out.println("Enter number Drinks");
            numberChoose = in.nextInt();
            switch (numberChoose) {
                case 1:
                    showTotal(price);
                    flag = false;
                    break;
                case 0:
                    displayMenu();
                    flag = false;
                    break;
                case 20:
                    showPticeTheFood("Coca Cola", 1.2f);
                     calculeOrder(1.2f);
                    flag = true;
                    break;
                case 21:
                    showPticeTheFood("Sprite", 1.4f);
                    flag = true;
                    break;
                 default:
                     System.out.println("Invalid Value");
                     flag = true;
                     break;
            }
        }
    }

    static  void  showSnacks() {
        Scanner in = new Scanner(System.in);
        flag = true;
        System.out.println("************* Snacks ****************");
        System.out.println("30- Eis with chocolat");
        System.out.println("31- Kake with eis and vanilla");
        System.out.println("1- finish");
        System.out.println("0- Retun Menu");
        while (flag) {
            System.out.println("Enter Number of Snack");
            numberChoose = in.nextInt();
            switch (numberChoose) {
                case 1:
                    showTotal(price);
                    flag = false;
                    break;
                case 0:
                    displayMenu();
                    flag = false;
                    break;
                case 30:
                    showPticeTheFood("Eis with chocolat", 4.30f);
                    calculeOrder(4.30f);
                    flag = true;
                    break;
                case 31:
                    showPticeTheFood("Kake with eis and vanilla", 3.20f);
                    calculeOrder(3.20f);
                    flag = true;
                    break;
                 default:
                     System.out.println("The value is incorrect");
                     flag = true;
                     break;
            }
        }
    }

    static  void showTotal(float price) {
        DecimalFormat frm = new DecimalFormat("#.##");

        System.out.println("Total is " + frm.format(price) + "$");
    }

    static float calculeOrder (float priceFood) {
        price += priceFood;
        return priceFood;
    }
    public static void main(String[] args) {
	// write your code here;

        showMenu();

        System.out.println("*****************Thank you*****************");
    }
}

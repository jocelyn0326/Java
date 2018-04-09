/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

/**
 *
 * @author gyc12
 */
import java.util.Scanner;

public class SalesProduct {

    static int sales[][] = new int[4][3];
    static int i = 0, j = 0;

    public static void main(String[] args) {
        salesPerson();
        rank(sales);

        /* for (j = 2; j <= 2; j++) {
            for (i = 0; i <= 2; i++) {
                int first = sales[2][0], second = sales[2][0], third = sales[2][0];
                int temp = 0;
                if (sales[i][j] > first) {
                    temp = first;
                    first = sales[i][j];
                    second = temp;
                    if (sales[i][j] > second) {
                        temp = second;
                        second = sales[i][j];
                        third = temp;
                    }
                }
            }
            

        }*/
    }

    public static void salesPerson() {
        Scanner scanner = new Scanner(System.in);
        String inputPerson; //接收使用者所要執行的動作
        do {
            System.out.print("Enter Sales No. [1-2 or -1:exit]:");
            inputPerson = scanner.next();
            switch (inputPerson) {
                case "1":
                    product(0);
                    break;
                case "2":
                    product(1);
                    break;
                case "-1":
                    break;

                default:
                    System.out.println("!!! Please enter 1-2 as the Sales No..");
            }

        } while (!(inputPerson.equals("-1")));
        print(sales);
    }

    public static void product(int person) {

        Scanner scanner1 = new Scanner(System.in);
        String inputProduct = "x";   //接收使用者所要執行的動作
        do {
            System.out.print("Enter Product No. [A,B,C or -1:back]:");
            inputProduct = scanner1.nextLine();
            switch (inputProduct) {
                case "A":
                    System.out.print("Enter the amount:");
                    sales[0][person] = Integer.parseInt(scanner1.nextLine());
                    break;
                case "B":
                    System.out.print("Enter the amount:");
                    sales[1][person] = Integer.parseInt(scanner1.nextLine());
                    break;
                case "C":
                    System.out.print("Enter the amount:");
                    sales[2][person] = Integer.parseInt(scanner1.nextLine());
                    break;
                case "-1":
                    break;
                default:
                    System.out.println("!!! Please enter A,B,C as the Product No..");
            }

        } while (!(inputProduct.equals("-1")));

        //計算一個銷售員銷售產品量
        for (j = 0; j <= 1; j++) {
            int salesPersonTotal = 0;
            for (i = 0; i <= 2; i++) {
                salesPersonTotal += sales[i][j];
            }
            sales[i][j] = salesPersonTotal;
            /* System.out.println("i=" + i + "  j=" + j);
            System.out.println("銷售員" + j+1 + salesPersonTotal);*/
        }
        //計算各產品的銷售量
        for (i = 0; i <= 2; i++) {
            int salesProductTotal = 0;
            for (j = 0; j <= 1; j++) {
                salesProductTotal += sales[i][j];
            }
            sales[i][j] = salesProductTotal;
            // System.out.println("產品" + i +"  "+ salesProductTotal);
        }
        // print(sales);
    }

    public static void print(int arr[][]) {
        int i = 0, j = 0;
        System.out.printf("%8s%14s%14s%10s\n", "Product", "Salesperson1", "Salesperson2", "Total");
        for (i = 0; i <= 3; i++) {
            switch (i) {
                case 0:
                    System.out.print("      A");
                    break;
                case 1:
                    System.out.print("      B");
                    break;
                case 2:
                    System.out.print("      C");
                    break;
                case 3:
                    System.out.print("   Total");
                    break;
            }

            for (j = 0; j <= 2; j++) {
                System.out.printf("%12.2f", (float) arr[i][j]);
            }
            System.out.println("");

        }
    }

    public static void rank(int arr[][]) {
        int a = arr[0][2];
        int b = arr[1][2];
        int c = arr[2][2];
        if (a >= b) {
            if (b >= c) {                
                System.out.printf("A產品銷售量%d >=  B產品銷售量%d >=  C產品銷售量%d", a, b, c);
            } else if (a >= c) {
                System.out.printf("A產品銷售量%d >=  C產品銷售量%d >= B產品銷售量%d", a, c, b);
            } else {
                System.out.printf("C產品銷售量%d >=  A產品銷售量%d >=  B產品銷售量%d", c, a, b);
            }
        } else {
            if (a >= c) {
                System.out.printf("B產品銷售量%d >=  A產品銷售量%d >=  C產品銷售量%d", b, a, c);
            } else if (b >= c) {
                System.out.printf("B產品銷售量%d >=  C產品銷售量%d >=  A產品銷售量%d", b, c, a);
            } else {
                System.out.printf("C產品銷售量%d >=  B產品銷售量%d >=  A產品銷售量%d", c, b, a);
            }
        }
    }

}


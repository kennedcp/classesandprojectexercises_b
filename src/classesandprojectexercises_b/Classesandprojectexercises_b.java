/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandprojectexercises_b;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author kenne
 */
public class Classesandprojectexercises_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("HelloWorld!");
        System.out.println("HelloEveryone!");
        System.out.println("ImConfused");
        System.out.println("What is the file name?");
        Scanner sc = new Scanner (System.in);
        try {
            String fileName = sc.nextLine();
            BufferedWriter bw = new BufferedWriter (new FileWriter(fileName));
            System.out.println("What is your number?");
           int num1 = sc.nextInt();
            System.out.println("What is your second number?");
            int num2 = sc.nextInt();
            int sum = num1 + num2;
            bw.write(Integer.toString(sum));
            bw.close();
        } catch (Exception e) {
            System.out.println("e");
        }
    }
    
}

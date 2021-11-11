/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_Java_18083000073_ShennitaBrilianA_7G;
import java.util.Scanner;
/**
 *
 * @author V
 */
public class UTS_Java_18083000073_ShennitaBrilianA_7G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
      System.out.print("Masukkan beratbadan pada kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("Masukkan tinggi pada meters: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.print("The Body Mass Index (BMI) adalah " + BMI + " kg/m2");
   }
}
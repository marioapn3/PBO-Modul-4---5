/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.my.mario.input;

/**
 *
 * @author USER
 */

import id.my.mario.output.Component;
import java.util.Scanner;

public class Input implements Component{
     private String label;
     private Scanner input;
     private String value;

     public Input(String label) {
          this.label = label;
          this.input = new Scanner(System.in);
     }

     public void draw() {
          System.out.print("| " + label + " : ");
     }

     public String getValue() {
          if (input.hasNextLine()) {
               value = input.nextLine();
          }
          return value;
     }

     public int getValueInt() {
          if (input.hasNextLine()) {
               value = input.nextLine();
               return Integer.parseInt(value);
          }
          return 0; // Nilai default jika tidak ada input yang tersedia
     }

     public double getValueDouble() {
          if (input.hasNextLine()) {
               value = input.nextLine();
               return Double.parseDouble(value);
          }
          return 0.0; // Nilai default jika tidak ada input yang tersedia
     }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.my.mario.output;

/**
 *
 * @author USER
 */
public class Label {

    private int width;
    public String text;

    public Label(String text, int width) {
        this.width = width;
        this.text = text;
    }

    public void draw() {
//          System.out.print("|");
//          int space = (width - text.length()) / 2;
//          for (int i = 0; i < space; i++) {
//               System.out.print(" ");
//          }
//          System.out.print(text);
//          for (int i = 0; i < space; i++) {
//               System.out.print(" ");
//          }
//          if (text.length() % 2 == 1) {
//               System.out.print(" ");
//          }
//          System.out.println("|");
        int space;
        if (text.length() > width) {
            space = 1;
        } else {
            space = (width - text.length() - 2);

        }

        System.out.print("|  " + text);
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}

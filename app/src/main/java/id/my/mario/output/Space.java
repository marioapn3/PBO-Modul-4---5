/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.my.mario.output;

/**
 *
 * @author USER
 */
public class Space {

    private int width;

    public Space(int width) {
        this.width = width;
    }

    public void draw() {
        System.out.print("|");
        for (int i = 0; i < width; i++) {
            System.out.print(" ");
        }
        System.out.println("|");

    }
}

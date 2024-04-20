/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.my.mario.input;

import id.my.mario.output.Component;

/**
 *
 * @author USER
 */
public class SelectInput implements Component{

    private String[] selection;
    private int width;
    private String label;
    private int value;
    private Input input;

    public SelectInput(String label, String[] selection, int width) {
        this.label = label;
        this.selection = selection;
        this.width = width;
        this.input = new Input(label);
    }

    public void draw() {
        int spaceHeading = width - label.length() - 2;
        System.out.print("|  " + label);
        for (int x = 0; x < spaceHeading; x++) {
            System.out.print(" ");
        }
        System.out.println("|");
        for (int i = 0; i < selection.length; i++) {
            String text = "| [" + (i+1) + "] ";
            System.out.print(text  + selection[i]);
            int space = (width - selection[i].length() - text.length() + 1);
            for (int a = 0; a < space; a++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.print("| Pilihan : ");
        value = input.getValueInt();
    }  

    public int getValue() {
        return value;
    }
}

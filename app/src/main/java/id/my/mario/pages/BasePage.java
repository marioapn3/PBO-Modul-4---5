/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.my.mario.pages;

import id.my.mario.output.Component;
import id.my.mario.output.HLine;
import id.my.mario.output.Label;
import id.my.mario.output.Space;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public abstract class BasePage {

    public String title;
    public int width;
    protected HLine hline;
    protected Space space;
    protected Label label;
     protected  ArrayList<Component> components = new ArrayList();

    public BasePage(String title, int width) {
        this.title = title;
        this.width = width;
        this.hline = new HLine(width);
        this.space = new Space(width);
        this.label = new Label(title.toUpperCase(), width);
    }

    public void draw() {
        this.drawHeader();
        this.space.draw();
        this.drawContent();
    }

    public void drawHeader() {
        this.hline.draw();
        this.space.draw();
        this.label.draw();
        this.space.draw();
        this.hline.draw();
    }

    public void drawFooter() {
        this.space.draw();
        this.hline.draw();
    }

    public abstract void drawContent();

//   ArrayLis Component[] components
}

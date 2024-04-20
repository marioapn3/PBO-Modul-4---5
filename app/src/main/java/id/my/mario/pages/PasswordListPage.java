/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.my.mario.pages;

import id.my.mario.encryptor.PasswordStore;
import id.my.mario.output.HLine;
import id.my.mario.output.Label;
import id.my.mario.output.Space;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class PasswordListPage extends BasePage {


    public PasswordListPage( int width) {
        super("Password List Page", width);
    }

    @Override
    public void drawContent() {
        int totalPasswords = DataPassword.passData.size();
        this.space.draw();
        this.label.text = "Terdapat " + totalPasswords + " tersimpan.";
        this.label.draw();
        this.label.text = "----- ----- -----";
        this.label.draw();

        // Menampilkan list password
//        for (PasswordStore password : DataPassword.passData) {
//            System.out.printf("| %-30s | %-20s | %-15s |%n", password.getTitle(), password.getUsername(), password.getCategoryString());
//        }
        ArrayList<PasswordStore> passwords = DataPassword.passData;

        // Menampilkan semua password
        for (PasswordStore password : passwords) {

            String colName = String.format("| %-25s", password.name);
            String colUsername = String.format("| %-20s", password.username);
            String colCategory = String.format("| %-20s |", password.getCategory());

            this.label.text = "  " + colName + colUsername + colCategory;
            this.label.draw();
        }

        this.space.draw();
        new MainPage(width).draw();
    }
}

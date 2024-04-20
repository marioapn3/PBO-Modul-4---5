/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.my.mario.pages;

import id.my.mario.input.SelectInput;
import id.my.mario.output.Component;
import id.my.mario.output.HLine;
import id.my.mario.output.Label;
import id.my.mario.output.Space;
//import java.awt.Component;

/**
 *
 * @author USER
 */
public class MainPage extends BasePage {

    SelectInput pageSelect;

    public MainPage(int width) {
        super("Aplikasi Penyimpanan Password", width);
        this.components.add(new Label("Selamat datang di aplikasi Password Vault",
                this.width));
        this.components.add(new Label("Simpan password anda dengan aman di sini",
                this.width));
        this.components.add(new Space(this.width));
        String[] pages = {"Input Password", "Tampil Password", "Keluar Aplikasi"};
        this.pageSelect = new SelectInput("Pilih halaman berikut:",
                pages, this.width);
        this.components.add(pageSelect);
    }

    @Override
    public void drawContent() {
        int select;
        for (Component widget : this.components) {
            widget.draw();
        }
        select = this.pageSelect.getValue() - 1;
        switch (select) {
            case 0 -> {
                drawFooter();
                new InputPage(this.width).draw();
            }
            case 1 -> {
                drawFooter();
                new PasswordListPage(this.width).draw();
            }
            case 2 -> {
                new Label("Menyimpan data ... ...", this.width).draw();
                DataPassword.saveCSVData();
                new Label("Terima kasih telah menggunakan aplikasi", this.width).draw();
                drawFooter();
                System.exit(0);
            }
            default -> {
                new MainPage(this.width).draw();
            }
        }
    }
}



//
//    public MainPage(String title, int width) {
//       super(title, width);
//    }
//
//    @Override
//    public void drawContent() {
//       
//        String[] pages = {"Input Password", "Tampil Password", "Keluar Aplikasi"};
//        SelectInput pageSelect = new SelectInput("Pilih halaman berikut:",
//                pages, this.width);
//        int select;
//        this.label.text = "Selamat datang di aplikasi Password Vault";
//        this.label.draw();
//        this.label.text = "Simpan password anda dengan aman di sini";
//        this.label.draw();
//        this.space.draw();
//        pageSelect.draw();
//        select = pageSelect.getValue() - 1;
//        switch (select) {
//            case 0 -> {
//                drawFooter();   
//                new InputPage("Inputan Password", this.width).draw();
//            }
//            case 1 -> {
//                drawFooter();
//                new PasswordListPage("List Password Tersimpan", this.width).draw();
//            }
//            case 2 -> {
//                new Label("Terima kasih telah menggunakan aplikasi", this.width).draw();
//                drawFooter();
//                DataPassword.saveCSVData();
//            }
//            default -> {
//                new MainPage(this.title, this.width).draw();
//            }
//        }
//    }
//
//    public void drawFooter() {
//        this.space.draw();
//        this.hline.draw();
//    }


/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package id.my.mario;

import id.my.mario.input.Input;
import id.my.mario.input.SelectInput;
import id.my.mario.output.HLine;

import id.my.mario.output.Label;
import id.my.mario.output.Space;
import id.my.mario.pages.DataPassword;
import id.my.mario.pages.MainPage;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
//        // Membuat objek Scanner
//        Scanner scanner = new Scanner(System.in);
//
//        // Meminta input dari pengguna
//        System.out.print("Masukkan nama Anda: ");
//        String nama = scanner.nextLine();
//
//        System.out.print("Masukkan usia Anda: ");
//        int usia = scanner.nextInt();
//
//        // Menampilkan output
//        System.out.println("Halo, " + nama + "! Usia Anda adalah " + usia + " tahun.");
//
//        // Menutup scanner
//        scanner.close();

//        new Label(50,"Teks tercetak" ).draw();
//        Input input = new Input("Masukkan nama");
//        Input input2 = new Input("Usia anda");
//        input.draw();
//        String nama = input.getValue();
//        input2.draw();
//        int usia = input2.getValueInt();
//        System.out.println(usia);
//
//        String [] pilihan = {"Pilihan 1", "Pilihan 2", "Pilihan 3", "Pilihan 4"};
//        SelectInput pilSelect = new SelectInput("Inputkan pilihan anda:", pilihan, 70);
//        pilSelect.draw();
//        int value = pilSelect.getValue();

////Coba
//        new HLine(50).draw();
//        new Space(50).draw();
//        new Label("Uji coba komponen yang dibuat", 50).draw();
//        new Space(50).draw();
//        new HLine(50).draw();
//        new Space(50).draw();
//        Input input = new Input("Masukkan nama");
//        Input input2 = new Input("Usia anda");
//        input.draw();
//        String nama = input.getValue();
//        input2.draw();
//        int usia = input2.getValueInt();
//        new Space(50).draw();
//        String[] pilihan = {"Pilihan 1", "Pilihan 2", "Pilihan 3", "Pilihan 4"};
//        SelectInput pilSelect = new SelectInput("Inputkan pilihan anda:", pilihan, 50);
//        pilSelect.draw();   
//        int value = pilSelect.getValue();
//        new Space(50).draw();
//        new HLine(50).draw();
//        new Space(50).draw();
//        new Label("Nama anda: " + nama, 50).draw();
//        new Label("Usia anda: " + usia, 50).draw();
//        new Label("Anda memilih menu: " + value, 50).draw();
//        new Space(50).draw();
//        new HLine(50).draw();
        DataPassword.loadCSVData();
           new MainPage("Selamat Datang Guys", 80).draw();
    }
}
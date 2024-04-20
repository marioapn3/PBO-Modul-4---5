/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.my.mario.pages;

/**
 *
 * @author USER
 */
import id.my.mario.encryptor.PasswordStore;
import id.my.mario.input.SelectInput;
import id.my.mario.input.Input;
import id.my.mario.output.HLine;
import id.my.mario.output.Label;
import id.my.mario.output.Space;
import java.util.Scanner;
import javax.security.auth.callback.TextInputCallback;

public class InputPage extends BasePage{
    private  Input judulInput;
    private  Input usernameInput;
    private  Input passwordInput;
    private  SelectInput kategoriInput;

    public InputPage( int width) {
        super("Input Page", width);
        this.judulInput = new Input("Judul Password");
        this.usernameInput = new Input("Username");
        this.passwordInput = new Input("Password");
        String[] kategoriOptions = {"Belum terkategori", "Aplikasi Web", "Aplikasi Mobile", "Akun Lainnya"};
        this.kategoriInput = new SelectInput("Kategori", kategoriOptions, width);
    }

    @Override
    public void drawContent() {
        this.judulInput.draw();
        String judul = judulInput.getValue();
        this.usernameInput.draw();
        String username = usernameInput.getValue();
        this.passwordInput.draw();
        String password = passwordInput.getValue();
        this.kategoriInput.draw();
        int kategori = kategoriInput.getValue();
        
        PasswordStore passwordStore = new PasswordStore(judul, username, password, kategori);
        DataPassword.passData.add(passwordStore);

        new MainPage(width).draw(); // Kembali ke halaman utama setelah input selesai
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("--------------------------------------");
        System.out.println("Selamat Datang di Rental Harian We Rent");
        System.out.println("--------------------------------------");
        String my_user, my_password;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        Login admin = new Login();
        System.out.println("\n**LOGIN**");
        System.out.print("Masukan username : ");
        my_user = br.readLine();
        System.out.print("Masukan password : ");
        my_password = br.readLine();
        System.out.println("=================================");

        if (my_user.equals(admin.getUsername()) && my_password.equals(admin.getPassword())) {
            System.out.println("=================================");
            System.out.println("      *** Login Sukses ***       ");
            System.out.println("Selamat Datang " + admin.getNama());
            rental.pilihan();
            System.out.println("=================================");
        } else {
            System.out.println("---------------------------------");
            System.out.println("       *** Login Gagal ***       ");
            System.out.println("      Silahkan masuk kembali     ");
            System.out.println("---------------------------------");
        }
    }
}


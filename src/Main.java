import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("--------------------------------------");
        System.out.println("Selamat Datang di Rental Harian Faisal");
        System.out.println("--------------------------------------");
        String my_user, my_password;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        Login user1 = new Login();
        System.out.println("\n**LOGIN**");
        System.out.print("Masukan username : ");
        my_user = br.readLine();
        System.out.print("Masukan password : ");
        my_password = br.readLine();
        System.out.println("=================================");

        if (my_user.equals(user1.getUsername()) && my_password.equals(user1.getPassword())) {
            System.out.println("=================================");
            System.out.println("      *** Login Sukses ***       ");
            System.out.println("Selamat Datang " + user1.getNama());
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


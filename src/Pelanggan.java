import java.util.Scanner;
//
public class Pelanggan {
    public String nama;
    public String alamat;
    public String no_telp;
    public String email;

    public void dataPelanggan(){
        Scanner input = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Menu Data Pelanggan ");
        System.out.println("----------------");
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukkan No.telp : ");
        no_telp = input.nextLine();
        System.out.print("Masukkan Email : ");
        email = input.nextLine();
    }

    public void cetakData(){
        System.out.println("--------------------");
        System.out.println("--Daftar Pelanggan--");
        System.out.println("--------------------");
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("No.telp : "+no_telp);
        System.out.println("Email :  "+email);

    }
}
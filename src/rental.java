import java.util.Scanner;
public class rental {
    int hari;
    int sewa;
    double mobil;
    //    konstructor over loading rental untuk motor
    public rental(int sewa){
        this.sewa=sewa;
        System.out.println("Sewa perhari :"+sewa);
    }
    //    konstructor over loading rental untuk mobil
    public rental(int mobil,int hari){
        this.mobil=mobil;
        this.hari=hari;
        int byr=mobil*hari;
        System.out.println("Sewa perhari :"+byr);
    }

    public static void pilihan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan pilih Kendaraan Jenis Kendaraan :");
        System.out.println("1. Kendaraan Roda Dua");
        System.out.println("2. Kendaraan Roda Empat");
        System.out.println("*Tekan apa saja untuk keluar");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1:
                rental.roda2();
                break;
            case 2:
                rental.roda4();
                break;
        }
    }
    //    methode roda 2 ataumotor
    public static void roda2(){
        Scanner input = new Scanner(System.in);
        Pelanggan plgn1 = new Pelanggan();
        System.out.println("======================");
        System.out.println("Pilih Jenis Motor");
        System.out.println("======================");
        System.out.println("1.Honda vario");
        System.out.println("2.Honda beat");
        System.out.println("3.Yamaha Nmax");
        System.out.println("4.Yamaha Mio");
        System.out.print("Masukkan pilihan : ");
        int pilih1=input.nextInt();
        plgn1.dataPelanggan();
        plgn1.cetakData();
        switch(pilih1){
            case 1:
                rental vario=new rental(80000);
                vario.tampilroda2();
                break;
            case 2:
                rental beat=new rental(70000);
                beat.tampilroda2();
                break;
            case 3:
                rental Nmax=new rental(100000);
                Nmax.tampilroda2();
                break;
            case 4:
                rental mio=new rental(50000);
                mio.tampilroda2();
                break;
        }
    }
    //    methode roda 4 atau mobil
    public static void roda4(){
        Scanner input = new Scanner(System.in);
        Pelanggan plgn1 = new Pelanggan();
        System.out.println("======================");
        System.out.println("Pilih Mobil ");
        System.out.println("======================");
        System.out.println("1.Avanza");
        System.out.println("2.Senia");
        System.out.println("3.Jazz");
        System.out.println("4.yaris");
        System.out.println("5.agya");
        System.out.print("Masukka pilihan : ");
        int pilih2=input.nextInt();
        plgn1.dataPelanggan();
        plgn1.cetakData();
        switch(pilih2){
            case 1:
                rental avanza=new rental(400000,1);
                avanza.tampilroda4();
                break;
            case 2:
                rental senia=new rental(300000,1);
                senia.tampilroda4();
                break;
            case 3:
                rental jazz=new rental(350000,1);
                jazz.tampilroda4();
                break;
            case 4:
                rental yaris=new rental(400000,1);
                yaris.tampilroda4();
                break;
            case 5:
                rental agya=new rental(250000,1);
                agya.tampilroda4();
        }
    }
    void tampilroda2(){
        int jumlahharir2;
        Scanner input = new Scanner(System.in);
        System.out.print("lama sewa:");
        int jmhari=input.nextInt();
        jumlahharir2=jmhari*sewa;
        System.out.print("Anda memilih motor");
        System.out.println("Dengan harga sewa : "+jumlahharir2);
    }
    void tampilroda4(){
        int jumlahhari;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa :");
        int jmhari=input.nextInt();
        jumlahhari=(int) (jmhari*mobil*hari);
        System.out.print("Anda memilih mobil");
        System.out.println("Dengan harga sewa : "+jumlahhari);
    }

}

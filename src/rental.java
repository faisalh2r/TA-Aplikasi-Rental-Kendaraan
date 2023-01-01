import java.util.Scanner;
public class rental {
    int hari;
    double mobil;
    String merk;
    //    konstructor overloading rental untuk mobil
    public rental(int mobil,int hari,String merk){
        this.mobil=mobil;
        this.hari=hari;
        this.merk=merk;
        int byr=mobil*hari;
        System.out.println("Sewa perhari :"+byr);
    }
    // menu pilihan
    public static void pilihan(){
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan pilih Kendaraan Jenis Kendaraan :");
        System.out.println("1. Sedan ");
        System.out.println("2. MPV ");
        System.out.println("3. SUV");
        System.out.println("*Tekan apa saja untuk keluar");
        System.out.print("Masukkan pilihan : ");
        int pilih = input.nextInt();
        switch(pilih) {
            case 1 :
                Sedan();
                break;
            case 2 :
                MPV();
                break;
            case 3 :
                SUV();
                break;
        }
    }
    // sedan
    public static void Sedan(){
        Scanner input = new Scanner(System.in);
        Pelanggan plgn1 = new Pelanggan();
        System.out.println("======================");
        System.out.println("------Pilih Mobil-----");
        System.out.println("======================");
        System.out.println("1.Honda Civic");
        System.out.println("2.Honda City");
        System.out.println("3.Toyota Vios");
        System.out.println("4.Hyundai Avega");
        System.out.print("Masukkan pilihan : ");
        int pilih1=input.nextInt();
        plgn1.dataPelanggan();
        plgn1.cetakData();
        switch(pilih1){
            case 1:
                rental civic=new rental(80000,1,"Honda Civic");
                civic.tampilSedan();
                break;
            case 2:
                rental city=new rental(70000,1,"Honda City");
                city.tampilSedan();
                break;
            case 3:
                rental vios=new rental(100000,1,"Toyota Vios");
                vios.tampilSedan();
                break;
            case 4:
                rental avega=new rental(50000,1,"Hyundai Avega");
                avega.tampilSedan();
                break;
        }
    }
    // mpv
    public static void MPV(){
        Scanner input = new Scanner(System.in);
        Pelanggan plgn1 = new Pelanggan();
        System.out.println("======================");
        System.out.println("Pilih Mobil ");
        System.out.println("======================");
        System.out.println("1.Honda Mobilio");
        System.out.println("2.Daihatsu Xenia");
        System.out.println("3.Toyota Avanza");
        System.out.println("4.Mitsubishi Expander");
        System.out.println("5.Suzuki Ertiga");
        System.out.print("Masukkan pilihan : ");
        int pilih2=input.nextInt();
        plgn1.dataPelanggan();
        plgn1.cetakData();
        switch(pilih2){
            case 1:
                rental mobilio=new rental(400000,1,"Honda Mobilio");
                mobilio.tampilMPV();
                break;
            case 2:
                rental xenia=new rental(300000,1,"Daihatsu Xenia");
                xenia.tampilMPV();
                break;
            case 3:
                rental avanza=new rental(350000,1,"Toyota Avanza");
                avanza.tampilMPV();
                break;
            case 4:
                rental expander=new rental(400000,1,"Mitsubishi Expander");
                expander.tampilMPV();
                break;
            case 5:
                rental ertiga=new rental(250000,1,"Suzuki Ertiga");
                ertiga.tampilMPV();
        }
    }
    // suv
    public static void SUV(){
        Scanner input = new Scanner(System.in);
        Pelanggan plgn1 = new Pelanggan();
        System.out.println("======================");
        System.out.println("Pilih Mobil ");
        System.out.println("======================");
        System.out.println("1.Toyota Fortuner");
        System.out.println("2.Mitsubishi Pajero");
        System.out.println("3.Isuzu MUX");
        System.out.print("Masukkan pilihan : ");
        int pilih3=input.nextInt();
        plgn1.dataPelanggan();
        plgn1.cetakData();
        switch(pilih3){
            case 1:
                rental fortuner=new rental(400000,1,"Toyota Fortuner");
                fortuner.tampilSUV();
                break;
            case 2:
                rental pajero=new rental(300000,1,"Mitsubishi Pajero");
                pajero.tampilSUV();
                break;
            case 3:
                rental mux=new rental(350000,1,"Isuzu MUX");
                mux.tampilSUV();
                break;
        }
    }
    // output sedan
    void tampilSedan(){
        int jumlahhari;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa :");
        int jmhari=input.nextInt();
        jumlahhari=(int) (jmhari*mobil*hari);
        System.out.println("Anda memilih "+merk);
        System.out.println("Harga sewa : "+jumlahhari);
    }
    // output mpv
    void tampilMPV(){
        int jumlahhari;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa :");
        int jmhari=input.nextInt();
        jumlahhari=(int) (jmhari*mobil*hari);
        System.out.println("Anda memilih "+merk);
        System.out.println("Harga sewa : "+jumlahhari);
    }
    // output suv
    void tampilSUV(){
        int jumlahhari;
        Scanner input = new Scanner(System.in);
        System.out.print("Lama sewa :");
        int jmhari=input.nextInt();
        jumlahhari=(int) (jmhari*mobil*hari);
        System.out.println("Anda memilih "+merk);
        System.out.println("Harga sewa : "+jumlahhari);
    }


}

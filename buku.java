//driver

import java.util.Scanner;

public class Buku{

    
    int id;
    String judul;
    String pengarang;
    int Tahunterbit;

    //object

    public Buku(int id,String judul,String pengarang,int Tahunterbit) {
        this.id = id;
        this.judul = judul;
        this.pengarang = pengarang;
        this.Tahunterbit = Tahunterbit;
    }    

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Inputkan Judul Buku :");
        String judulbuku = in.nextLine();
        System.out.println("Inputkan Pengarang Buku :");
        String pengarang = in.nextLine();
        System.out.println("Inputkan ID Buku :");
        int id = in.nextInt();
        System.out.println("Inputkan Tahun Terbit Buku :");
        int tahunterbit = in.nextInt();
        
        Buku Liaran = new Buku(1, "Liaran", "Dafi", 1999);
        Buku BalapanMasuk = new Buku(2, "Masuk", "FIRDAUSI", 2000);
        Buku KeluarDiOut = new Buku(3, "Keluarluar", "Agus", 2077);
        Buku CaraagarMudahbesar = new Buku(4, "CaraagarMudahbelajar", "Kangcoki", 1988);
        Buku CARKECORCONG = new Buku(5, "CAR", "lokqho", 1277);

        //Liaran
        System.out.println(Liaran);
        System.out.println();
        System.out.println(judulbuku);
        System.out.println(pengarang);
        System.out.println(id);
        System.out.println(tahunterbit);
    }
}



    
      

    


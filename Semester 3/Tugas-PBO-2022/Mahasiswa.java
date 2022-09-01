//M0521023_Gentur Sahadewa
import java.util.Scanner;
public class Mahasiswa {
    //atribut class Mahasiswa
    String NIM, nama, jenisKelamin, alamat;

    public void isiData() {
        Scanner input = new Scanner(System.in);
        System.out.println("[PENGISIAN DATA MAHASISWA]");
        System.out.print("Nama : ");
        this.nama = input.nextLine();
        System.out.print("NIM : ");
        this.NIM = input.nextLine();
        System.out.print("Jenis Kelamin (P/L) : ");
        this.jenisKelamin = input.nextLine();
        System.out.print("Alamat : ");
        this.alamat = input.nextLine();
        input.close();
    }

    public void printData() {
        System.out.println("[DATA MAHASISWA]");
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("NIM\t\t: " + this.NIM);
        System.out.println("Jenis Kelamin\t: " + this.jenisKelamin);
        System.out.println("Alamat\t\t: " + this.alamat);
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.isiData();
        mahasiswa.printData();
    }
}

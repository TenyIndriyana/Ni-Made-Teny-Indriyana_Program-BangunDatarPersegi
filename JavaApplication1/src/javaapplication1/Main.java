import java.util.Scanner;
public class Persegi {

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        System.out.println("Pilih \n[A].Luas Persegi 1  \n[B] keliling Persegi 2");
        int pilih = masuk.nextInt();
        if(pilih==A){
            bangunDatarPersegi A = bangunDatarPersegi("2");
            System.out.println("Masukkan Nilai Sisi ");
            int si = masuk.nextInt();
            masuk.nextLine();
            A.NilaiSisi(si);
            A.output();

        } else if(pilih==B){
            System.out.println("Masukkan Nilai Sisi Persegi : ");
            int s = masuk.nextInt();
            bangunDatarPersegi B = new bangunDatarPersegi("2",s);
            B.output();
        } else {
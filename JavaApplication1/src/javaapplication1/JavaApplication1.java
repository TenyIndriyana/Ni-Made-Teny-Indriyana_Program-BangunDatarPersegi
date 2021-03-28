public class bangunDatarPersegi {
    private String Persegi;
    private int sisi;

    public void NilaiSisi(int sisi){
        this.sisi = sisi;
    }

    public int getSisi(){
        return sisi;
    }

    bangunDatarPersegi(String P){
        Persegi = P;
        sisi = 0;
    }

    bangunDatarPersegi(String P,int s){
        Persegi = P;
        sisi = s;
    }

    int Keliling(){
        return 4*sisi;
    }

    int Luas(){
        return sisi*sisi;
    }

    void output(){
        if (sisi==0){
            System.out.println("Nilai Sisi Persegi Adalah "+ P );
        } else {
            System.out.println("Keliling kotak "+ P +" = "+ Keliling() +"cm");
            System.out.println("Luas kotak "+ P +" = "+ Luas() +"cm2");
        }
    }

}
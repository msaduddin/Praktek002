package praktek02;
public class Square {
    double sisi;
    double luas;

    public Square() {
        sisi=4;
        luas=9;
    }

    public Square(double sisi, double luas) {
        this.sisi = sisi;
        this.luas = luas;
    }
    
    
    void cetakInfo(){
        System.out.println("==============");
        System.out.println("sisi : "+sisi);
        System.out.println("luas : "+luas);
        System.out.println("==============");
    }
    
    double hitungKeliling(){
        double  keliling;
        keliling=sisi*luas;
        return keliling;
    }
    
    void cetakKeliling(){
        System.out.println("Kelilingnya adalah: "+hitungKeliling());
    }
}

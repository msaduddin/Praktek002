package praktek02;
public class SquareAksi {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.sisi = 4;
        s1.luas = 16;
        
        s1.cetakInfo();
        System.out.println("Keliling Square = "+s1.hitungKeliling());
        s1.cetakKeliling();
        
        Square s2 = new Square();
        s2.cetakInfo();
        
        Square s3 = new Square();
        s3.cetakInfo();
    }           
}

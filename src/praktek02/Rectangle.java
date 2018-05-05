package praktek02;
public class Rectangle {
    double panjang;
    double lebar;
    
    void cetakInfo(){
        System.out.println("===================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar :   "+lebar);
        System.out.println("===================");
    }
    
    double hitugLuas(){
        double luas;  
        luas=panjang*lebar;
        return luas;
    } 

    String hitungLuas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}



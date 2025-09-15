public class sistem_parkir {
     static void main(String[] args) {
       
        int jammasuk = 20; // input jam masuk 10 & 20
        
       if (jammasuk < 12) {
            System.out.println("Pagi, tarif Rp 5000");
        }
        else if (12 < jammasuk && jammasuk < 18) {
            System.out.println("Siang, tarif Rp 7000");
        }
        else {
            System.out.println("Malam, tarif Rp 10000");
        }
    }
}
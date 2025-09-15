public class sistem_ebook {
    public static void main(String[] args) {
        
        boolean anggota = true;  // input status true & false
        boolean bayar = false;   // input status true & false

        if (anggota == true) {
            if (bayar == true) {
                System.out.println("Akses e-book dibuka");
            } else {
                System.out.println("Harap bayar iuran dulu");
            }
        } else {
            System.out.println("Silakan daftar anggota dahulu");
        }

    }
    
}

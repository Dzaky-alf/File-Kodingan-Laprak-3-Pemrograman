public class ArahDrone {
    public static void main(String[] args) {
        
        String angin = "utara"; // input arah angin: selatan dan barat

        if (angin.equals("utara")) {
            System.out.println("Drone terbang ke selatan");
        }
        else if (angin.equals("barat")) {
            System.out.println("Drone terbang ke timur");
        }
    else {
        System.out.println("Drone hover atau diam di tempat");
    }
}
}

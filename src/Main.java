public class Main {
    public static void main(String[] args) {
       
        SinglyLinkedList garasi = new SinglyLinkedList();
        System.out.println("Garasi baru saja dibuat.\n");

        Mobil mobilKeluarga = new Mobil();
        mobilKeluarga.setMerk("Toyota Innova");

        Motor motorSport = new Motor();
        motorSport.setMerk("Yamaha YZF-R6");
        
        Sepeda sepedaGunung = new Sepeda();
        sepedaGunung.setMerk("Polygon");

        System.out.println("Memasukkan kendaraan ke garasi...");
        garasi.add(mobilKeluarga);
        garasi.add(motorSport);
        garasi.add(sepedaGunung);

        garasi.display();
        System.out.println();

        Driver drvr = new Driver();

        drvr.kendaraiSemua(garasi);

        System.out.println("----------------------------------------------");
        System.out.println("Mengeluarkan " + motorSport.getMerk() + " dari garasi...");
        System.out.println("----------------------------------------------");
        garasi.remove(motorSport);
        garasi.display();
        System.out.println();
    }
}

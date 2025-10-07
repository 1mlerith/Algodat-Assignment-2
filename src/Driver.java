public class Driver {

    public void kendarai(Kendaraan veh) {
        if (veh != null) {
            System.out.println("Pengemudi mencoba " + veh.getMerk() + ".");
            veh.bergerak(); 
            System.out.println(); 
        }
    }

    public void kendaraiSemua(SinglyLinkedList garasi) {
        System.out.println("----------------------------------------------");
        System.out.println("Pengemudi akan mencoba semua kendaraan di garasi!");
        System.out.println("----------------------------------------------\n");
        for (int i = 0; i < garasi.size(); i++) {
            // Ambil kendaraan dari garasi satu per satu
            Kendaraan k = (Kendaraan) garasi.get(i);
            this.kendarai(k);
        }
    }
}

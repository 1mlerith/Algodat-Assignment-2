public abstract class Kendaraan {
    private String merk;

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return this.merk;
    }

    public abstract void bergerak();
}
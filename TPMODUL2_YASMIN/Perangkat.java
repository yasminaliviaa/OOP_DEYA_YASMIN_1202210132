public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;

    public Perangkat(String drive, double d, float processor){
        this.drive = drive;
        this.ram = (int) d;
        this.processor = processor;
    }

    public void informasi(){
        System.out.printf("Perangkat tidak diketahui memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f %n", drive, ram, processor);
    }
}
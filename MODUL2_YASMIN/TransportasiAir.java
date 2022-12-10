public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;
    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    };
    public void informasi(){
        System.out.print("Transportasi Air jenis tidak diketahui dengan kursi berjumlah " + this.jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + this.biaya);
    };
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis tidak diketahui sedang berlayar");
    };
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis tidak diketahui sedang berlabuh");
    };
    }


public class Kapal extends TransportasiAir{
    protected String mesin;
    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    };
    @Override
    public void informasi(){
        System.out.print("Transportasi Air jenis kapal dengan kursi berjumlah " + this.jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + this.biaya);
    };
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis kapal sedang berlayar menggunakan mesin " + this.mesin + "dengan kecepatan yang tidak stabil");
    };
    public void berlabuh(int kecepatan){
        System.out.println("Transportasi Air dengan jenis kapal sedang berlayar menggunakan mesin " + this.mesin + "dengan kecepatan stabil di kisaran " +  kecepatan + "knot");
    };
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis sampan sedang berlabuh di pantai menggunakan ");
    }
}

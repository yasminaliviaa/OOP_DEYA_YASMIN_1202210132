public class MainApp {
    public static void main (String[] args) throws Exception{
    TransportasiAir unk = new TransportasiAir(10, 20000);
    Sampan sampan = new Sampan(15,70000,2);
    Kapal kapal = new Kapal(30, 235000, "mesin Diesel");
    unk.informasi();
    unk.berlabuh();
    unk.berlabuh();
    System.out.println();
    sampan.informasi();
    sampan.berlayar();
    sampan.berlabuh();
    sampan.berlabuh(2);
    System.out.println();
    kapal.informasi();
    kapal.berlayar();
    kapal.berlabuh(20);    
    kapal.berlabuh();
    }
        
}


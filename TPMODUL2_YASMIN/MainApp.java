public class MainApp{
    public static void main (String[] args) throws Exception {
        Perangkat per = new Perangkat("Sandisk", 2.3, 1.3f);
        per.informasi();
        System.out.println();

        Laptop lap = new Laptop("Transcend", 8, 2.9f, true);
        lap.informasi();
        lap.bukagame("Valorant");
        lap.kirimemail("halo@gmail.com");
        lap.kirimemail("halolagi@gmail.com", "haloterus@gmail.com");
        System.out.println();

        Handphone han = new Handphone("Kingston", 4, 3f, false);
        han.informasi();
        han.telfon(68345678);
        han.kirimsms(62456789);
        han.kirimsms(67567890, 62678901);
        System.out.println();
    }
}

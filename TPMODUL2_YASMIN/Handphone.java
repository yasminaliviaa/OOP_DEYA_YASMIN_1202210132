public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi(){
        if (this.fingerprint == true){
            System.out.printf("Handphone ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Selain itu handphone ini juga memiliki fingerprint", drive, ram, processor);
        }else{
            System.out.printf("Handphone ini memiliki drive tipe %s dengan ram sebesar %d GB dan processor secepat %.2f Ghz. Selain itu handphone ini juga tidak memiliki fingerprint", drive, ram, processor);
        }
        }
    public void telfon(int nohp){
        System.out.printf("%n Handphone berhasil menyambungkan telfon ke No %s", nohp);
    }
    public void kirimsms(int no_hp){
        System.out.printf("%n Handphone berhasil menyambungkan telfon ke No %s", no_hp);

    }
    public void kirimsms(int nohp1, int nohp2){
        System.out.printf("%n Handphone berhasil menyambungkan telfon ke No %s", nohp1, nohp2);
    }
    }
    

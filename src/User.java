import java.util.Scanner;
public class User {

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    public void userinput(){
        Scanner input = new Scanner (System.in);
        System.out.print("Nama: ");
        String nama = userinput.nextLine();
        System.out.print("No. Handphone: ");
        String no = userinput.nextLine();

        System.out.print("\nRegsiter Success");
        System.out.print("\nName: "+nama);
        System.out.print("\nPhone Number "+no);

    
    }
}

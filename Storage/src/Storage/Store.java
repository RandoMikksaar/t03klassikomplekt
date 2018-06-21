package Storage;
import java.io.IOException;
import java.util.Scanner;

public class Store{
	
    public static void main(String[] args) throws IOException{

        Insert_items storage1 = new Insert_items(); 

        Scanner insert = new Scanner (System.in);
        System.out.println("sisesta lao nimetus: ");
        storage1.item = insert.nextLine();
        System.out.println("sisesta eseme nimetus: ");
        storage1.item = insert.nextLine();
        System.out.println("Sisesta eseme asukoht laos: ");
        storage1.location = insert.nextLine();
        System.out.println("Sisesta eseme kaal: ");
        storage1.weight = insert.nextInt();
        insert.nextLine();
        System.out.println("Seisesta lisakommentaar: ");
        storage1.additionalComment = insert.nextLine();

        storage1.itemsToStorge();
    }

}
	
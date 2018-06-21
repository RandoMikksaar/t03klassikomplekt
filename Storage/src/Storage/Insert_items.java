package Storage;
import java.io.IOException;
import java.io.PrintWriter;

public class Insert_items {
    
    protected String storage;
    protected String item;
    protected String location;    
    protected String additionalComment;
    protected int weight;
    
    public void itemsToStorge() {        
        try{
            PrintWriter print = new PrintWriter(storage + ".txt");
            print.println("Ese: " + item);
            print.println("Asukoht Laos: " + location);
            print.println("Kaal: " + weight);
            print.println("Lisa Kommentaar: " + additionalComment);
            print.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
}

}
	
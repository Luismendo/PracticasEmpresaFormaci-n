import java.util.List;

public class Main {
    public static void main(String[] args){

        try {
            Interface miInterface;

            miInterface = new Methods();
            List<Persona> personas = miInterface.ReadFIle();
            miInterface.PrintList(personas);


        }
        catch(Exception e) {
            System.out.println("Algo salió muy mal :C");
        }
    }
}

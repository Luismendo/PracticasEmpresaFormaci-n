import java.io.FileNotFoundException;
import java.util.List;

public interface Interface {
    List<Persona> ReadFIle() throws FileNotFoundException;
    Boolean PrintList(List<Persona> people);
}

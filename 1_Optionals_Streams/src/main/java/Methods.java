import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Methods implements Interface{
    @Override
    public List<Persona> ReadFIle() throws FileNotFoundException {

        String pathFile = "C:\\Users\\luis.mendoza\\IdeaProjects\\1_Optionals_Streams\\src\\main\\resources\\ReadFile.txt";
        Scanner scanner = new Scanner(new File(pathFile));


        List<Persona> ListPerson = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            String[] lineFilter = line.split(":");

            Persona persona = new Persona(lineFilter);
            ListPerson.add(persona);
        }
        return ListPerson;
    }

    @Override
    public Boolean PrintList(List<Persona> ListPerson) {

        AtomicInteger count=new AtomicInteger(1);
        ListPerson.stream()
                .filter(x -> x.getEdad().isPresent())
                .filter(x -> x.getEdad().get() < 25)
                .forEach(x -> System.out.println("Linea "+count.getAndIncrement()+". Nombre:"+ x.getName().orElse("Desconocido") +". Población:"+ x.getPoblacion().orElse("Desconocida") +". Edad:"+x.getEdad().get()));

            /*Tests
            System.out.println("=========================================");
            ListPerson.forEach(x -> System.out.println("Linea "+count.getAndIncrement()+". Nombre:"+ x.getName().orElse("Desconocido") +". Población:"+ x.getPoblacion().orElse("Desconocida") +". Edad:"+x.getEdad().orElse(0)));
            */
        return true;
    }
}

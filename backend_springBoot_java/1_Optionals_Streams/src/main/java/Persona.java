import java.util.Optional;

public class Persona {

    private Optional<String> name;
    private Optional<String> poblacion;
    private Optional<Integer> edad;

    public Persona(){
        this.poblacion = Optional.empty();
        this.name = Optional.empty();
        this.edad = Optional.empty();
    }

    public Persona(String[] lineFilter){
        switch (lineFilter.length-1){
            case 0:
                if (lineFilter[0].equals(""))
                    this.name = Optional.empty();
                else this.name = Optional.of(lineFilter[0]);

                this.poblacion = Optional.empty();
                this.edad = Optional.empty();
                break;
            case 1:
                if (lineFilter[0].equals(""))
                    this.name = Optional.empty();
                else this.name = Optional.of(lineFilter[0]);

                if (lineFilter[1].equals(""))
                    this.poblacion = Optional.empty();
                else this.poblacion = Optional.of(lineFilter[1]);

                this.edad = Optional.empty();
                break;
            case 2:
            default:
                if (lineFilter[0].equals(""))
                    this.name = Optional.empty();
                else this.name = Optional.of(lineFilter[0]);

                if (lineFilter[1].equals(""))
                    this.poblacion = Optional.empty();
                else this.poblacion = Optional.of(lineFilter[1]);

                if (lineFilter[2].equals(""))
                    this.edad = Optional.empty();
                else this.edad = Optional.of(Integer.valueOf(lineFilter[2]));
                break;
        }

    }



    public Optional<String> getName() {
        return name;
    }

    public Optional<String> getPoblacion() {
        return poblacion;
    }

    public Optional<Integer> getEdad() {
        return edad;
    }

    public void setName(String name) {
        this.name = Optional.of(name);
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = Optional.of(poblacion);
    }

    public void setEdad(int edad) {
        this.edad = Optional.of(edad);
    }

}

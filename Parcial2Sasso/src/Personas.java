public class Personas {
    private String nombre;
    private String Apellido;
    private int edad;
    private String barrio;
    private String DNI;
    private String ocupación;
    private int numeroDeKit;

    public Personas() {
    }

    public Personas(String nombre, String apellido, int edad, String barrio, String DNI, String ocupación) {
        this.nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        this.barrio = barrio;
        this.DNI = DNI;
        this.ocupación = ocupación;
    }

    public Personas(String nombre, String apellido, int edad, String barrio, String DNI, String ocupación, int numeroDeKit) {
        this.nombre = nombre;
        Apellido = apellido;
        this.edad = edad;
        this.barrio = barrio;
        this.DNI = DNI;
        this.ocupación = ocupación;
        this.numeroDeKit = numeroDeKit;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getOcupación() {
        return ocupación;
    }

    public void setOcupación(String ocupación) {
        this.ocupación = ocupación;
    }

    public int getNumeroDeKit() {
        return numeroDeKit;
    }

    public void setNumeroDeKit(int numeroDeKit) {
        this.numeroDeKit = numeroDeKit;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "nombre='" + nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", edad=" + edad +
                ", barrio='" + barrio + '\'' +
                ", DNI='" + DNI + '\'' +
                ", ocupación='" + ocupación + '\'' +
                ", numeroDeKit=" + numeroDeKit +
                '}';
    }

}

import java.sql.Array;
import java.util.*;
import java.util.Map;

public class Sala {
    LinkedHashSet<Personas> listadoPersonas = new LinkedHashSet<>();
    private int contadorKit = 0;
    private int cantDeReactivos;

    private ArrayList <String[]> datosPersonas = new ArrayList<>();
    private ArrayList <String[]> resultados = new ArrayList<>();



    public Sala() {
    }

    public Sala(int cantDeReactivos) {
        this.cantDeReactivos = cantDeReactivos;
    }

    public LinkedHashSet<Personas> getListadoPersonas() {
        return listadoPersonas;
    }

    public void setListadoPersonas(LinkedHashSet<Personas> listadoPersonas) {
        this.listadoPersonas = listadoPersonas;
    }

    public int getCantDeReactivos() {
        return cantDeReactivos;
    }

    public void setCantDeReactivos(int cantDeReactivos) {
        this.cantDeReactivos = cantDeReactivos;
    }

    public void registrarPersona(Personas a) throws ExcepcionFaltaReactivos {
        if (cantDeReactivos <= 0) {
            throw new ExcepcionFaltaReactivos("No hay reactivos disponibles");
        }
        for (Personas registro : listadoPersonas) {
            if (registro.getDNI().equals(a.getDNI())) {
                System.out.println("El dni ya esta registrado");
            }
        }
        contadorKit++;
        int numeroKit = contadorKit;

        Personas personaNueva = new Personas(a.getNombre(), a.getApellido(), a.getEdad(), a.getBarrio(), a.getDNI(), a.getOcupación(), numeroKit);

        listadoPersonas.add(personaNueva);
        cantDeReactivos--;


        String[] datos = {a.getNombre(), a.getDNI(), a.getApellido(), a.getOcupación(), String.valueOf(a.getEdad())};
        datosPersonas.add(datos);

        String[] otrosDatos = {a.getBarrio(), String.valueOf(a.getNumeroDeKit())};
        resultados.add(otrosDatos);


    }

    public void verificarCantReactivos(){
        Scanner scan = new Scanner(System.in);
        if(cantDeReactivos<=0){
            System.out.println("No hay reactivos disponibles. Hay mas? S/N.");
            String hay = scan.nextLine();
            if (hay.equalsIgnoreCase("S")){
                System.out.println("Ingrese la cantidad de nuevs reactivos");
                int nuevosReactivos = scan.nextInt();
                cantDeReactivos += nuevosReactivos;
            }
        }
    }

    public String buscaBarrio(int numeroDeKit){
        for(Personas person : listadoPersonas){
            if(person.getNumeroDeKit() == numeroDeKit){
                return person.getBarrio();
            }
        }
        return null;
    }

    public void aislar(EvaluacionTemperatura evaluacion)throws ExcepcionAislamiento{
        for(Map.Entry<Integer, RegistroTemperatura> entry : evaluacion.testeados.entrySet()){
            int numeroDeKit = entry.getKey();
            RegistroTemperatura temperatura = entry.getValue();

            if(temperatura.getTemperatura()>=38){
                String barrio = buscaBarrio(numeroDeKit);
                throw new ExcepcionAislamiento(numeroDeKit, barrio);
            }

        }

    }

}
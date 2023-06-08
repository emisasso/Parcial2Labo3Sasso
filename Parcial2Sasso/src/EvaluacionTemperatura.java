import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EvaluacionTemperatura {
    Map<Integer, RegistroTemperatura> testeados;


    public EvaluacionTemperatura(HashMap<Integer, RegistroTemperatura> testeados) {
        this.testeados = new HashMap<>();
    }


    public void testear(Sala salita){
        Random random = new Random();

        for(Personas persona : salita.listadoPersonas){
            int numeroKit = persona.getNumeroDeKit();
            String DNI = persona.getDNI();
            double temperatura = 36 + (random.nextDouble() * 3);

            RegistroTemperatura registro = new RegistroTemperatura(DNI, temperatura);
            testeados.put(numeroKit, registro);
        }
    }

}

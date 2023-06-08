import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws ExcepcionFaltaReactivos {
        Sala salitaNueva = new Sala(10);

        HashMap<Integer,RegistroTemperatura> testeados = new HashMap<>();

    Personas persona1 = new Personas("Emiliano", "Sasso", 27, "Primavesi", "38831982", "Programador");
    Personas persona2 = new Personas("Emiliano", "Sasso", 10, "Primavesi", "2343143", "Programador");
    Personas persona3 = new Personas("Emiliano", "Sasso", 30, "Primavesi", "575467", "Programador");
    Personas persona4 = new Personas("Emiliano", "Sasso", 34, "Primavesi", "567346", "Programador");
    Personas persona5 = new Personas("Emiliano", "Sasso", 27, "Primavesi", "11546", "Programador");
    Personas persona6 = new Personas("Emiliano", "Sasso", 27, "Primavesi", "357684", "Programador");
    Personas persona7 = new Personas("Emiliano", "Sasso", 27, "Primavesi", "777857", "Programador");
    Personas persona8 = new Personas("Emiliano", "Sasso", 27, "Primavesi", "3563584", "Programador");
    Personas persona9 = new Personas("Emiliano", "Sasso", 27, "Primavesi", "7579356", "Programador");
    Personas persona10 = new Personas("Emiliano", "Sasso", 27, "Primavesi", "5884562", "Programador");
    Personas persona11 = new Personas("Emiliano", "Sasso", 27, "Primavesi", "38831982", "Programador");

    try{
    salitaNueva.registrarPersona(persona1);
    salitaNueva.registrarPersona(persona2);
    salitaNueva.registrarPersona(persona3);
    salitaNueva.registrarPersona(persona4);
    salitaNueva.registrarPersona(persona5);
    salitaNueva.registrarPersona(persona6);
    salitaNueva.registrarPersona(persona7);
    salitaNueva.registrarPersona(persona8);
    salitaNueva.registrarPersona(persona9);
    salitaNueva.registrarPersona(persona10);
    salitaNueva.registrarPersona(persona11);}
    catch (ExcepcionFaltaReactivos e){
        System.out.println("Faltan Reactivos");
        salitaNueva.verificarCantReactivos();
    }





    }
}
public class RegistroTemperatura {
    private String DNI;
    private double temperatura;

    public RegistroTemperatura() {
    }

    public RegistroTemperatura(String DNI, double temperatura) {
        this.DNI = DNI;
        this.temperatura = temperatura;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
}

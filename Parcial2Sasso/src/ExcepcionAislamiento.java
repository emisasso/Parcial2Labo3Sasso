public class ExcepcionAislamiento extends Exception{
    private int numeroDeTest;
    private String barrio;

    public ExcepcionAislamiento(int numeroDeTest, String barrio) {
        this.numeroDeTest = numeroDeTest;
        this.barrio = barrio;
    }

    public int getNumeroDeTest() {
        return numeroDeTest;
    }

    public void setNumeroDeTest(int numeroDeTest) {
        this.numeroDeTest = numeroDeTest;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}

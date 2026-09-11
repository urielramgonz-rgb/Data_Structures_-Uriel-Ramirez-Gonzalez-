public class agua {
    private String aguaFria;
    private String aguaCaliente;
    private int cantidadML;

    public agua(String aguaFria, String aguaCaliente, int cantidadML) {
        this.aguaFria = aguaFria;
        this.aguaCaliente = aguaCaliente;
        this.cantidadML = cantidadML;
    }

    public String getAguaFria() {
        return aguaFria;
    }

    public void setAguaFria(String aguaFria) {
        this.aguaFria = aguaFria;
    }

    public String getAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(String aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    public int getCantidadML() {
        return cantidadML;
    }

    public void setCantidadML(int cantidadML) {
        this.cantidadML = cantidadML;
    }
}
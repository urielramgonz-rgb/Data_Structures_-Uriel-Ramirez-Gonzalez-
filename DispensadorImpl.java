public class DispensadorImpl implements DispensadorAgua2<agua> {
    private int nivelTanqueML;

    public DispensadorImpl(int capacidadInicial) {
        this.nivelTanqueML = capacidadInicial;
    }

    @Override
    public void servir() {
        System.out.println("Servidor activado: La válvula de agua está abierta...");
    }

    @Override
    public void pararServir() {
        System.out.println("Servidor desactivado: La válvula de agua se ha cerrado.");
    }

    @Override
    public void rellenar() {
        this.nivelTanqueML = 5000;
        System.out.println("El depósito de agua ha sido rellenado a " + nivelTanqueML + " mL.");
    }

    @Override
    public void filtrar() {
        System.out.println("Filtrando agua...");
    }

    @Override
    public void temperatura() {
        System.out.println("Comprobando sensores de temperatura (Frió y Caliente OK).");
    }

    @Override
    public void ServirAgua(agua servicio) {
        System.out.println("\n--- INICIANDO SIMULACIÓN DE DISPENSADO ---");
        
        if (this.nivelTanqueML < servicio.getCantidadML()) {
            System.out.println(" Error: No hay suficiente agua en el tanque. Se necesitan " 
                                + servicio.getCantidadML() + " mL y solo quedan " + nivelTanqueML + " mL.");
            return;
        }

        filtrar();
        temperatura();
        servir();

        System.out.println("Sirviendo agua " 
                           + (servicio.getAguaFria() != null ? servicio.getAguaFria() : servicio.getAguaCaliente()) 
                           + " (" + servicio.getCantidadML() + " mL)...");

        this.nivelTanqueML -= servicio.getCantidadML();

        pararServir();
        System.out.println(" Proceso completado con éxito. Agua disponible restante: " + nivelTanqueML + " mL.");
    }
}
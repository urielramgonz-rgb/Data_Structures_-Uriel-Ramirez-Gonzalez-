public class Main {
    public static void main(String[] args) {
        DispensadorImpl dispensador = new DispensadorImpl(1000);

        agua vaso1 = new agua("Fría", null, 250);

        dispensador.ServirAgua(vaso1);

        agua vaso2 = new agua(null, "Caliente", 500);
        dispensador.ServirAgua(vaso2);
        agua vaso3 = new agua("Fría", null, 400);
        dispensador.ServirAgua(vaso3);
        dispensador.rellenar();
        dispensador.ServirAgua(vaso3);
    }
}
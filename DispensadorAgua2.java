public interface DispensadorAgua2<T> {

    void servir();
    void pararServir();
    void rellenar();
    void filtrar();
    void temperatura();
    void ServirAgua(T agua);
}
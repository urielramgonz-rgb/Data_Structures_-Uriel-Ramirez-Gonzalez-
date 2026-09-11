public interface IDispensadorAgua<T> {

    void servir(T agua);
    void rellenar();
    void filtrar();

}


public class Nodo{
    double dato;
    Nodo sig;
    //Constructor por defecto
    public Nodo(){
        dato = 0;
        sig = null;
    }
    //Constructor ordinario
    public Nodo(double vd) {
        dato = vd;
        sig = null;
    }
}
public class Principal {
    public static void main(String[] args){
        Operaciones op = new Operaciones();
        Lista L = new Lista();
        op.insertarN(L);
        op.mostrar(L);
        op.promedio(L);
        op.eliminarUlt(L);
        op.mostrar(L);
        System.out.println("La posicion del mayor es: " + op.direccionMay(L));
        System.out.print("Ingrese la posicion del nodo a eliminar: "); int pos = Leer.datoInt();
        op.eliminarPos(L, pos);
        op.mostrar(L);
        System.out.println();
        System.out.println("La lista ordenada es: ");
        op.ordenar(L);
        System.out.println("");
        System.out.println("Hasta vaciar la lista");
        op.vaciarLista(L);
    }
}

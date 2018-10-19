public class Operaciones {
    //Insertar N nodos
    public Lista insertarN(Lista L) {
        System.out.print("No. de Nodos: ");
        int nn = Leer.datoInt();
        double d;
        for (int i = 1; i <= nn; i++) {
            System.out.print("dato= ");
            d = Leer.datoDouble();
            L.insertar(d);
        }
        return L;
    }

    //Mostrar(recorrer) la lista
    public void mostrar(Lista L) {
        Nodo p = L.primero;
        while (p != null) {
            System.out.println(p.dato);
            p = p.sig;
        }
    }

    //Promedio de todos los nodos
    public void promedio(Lista L) {
        double sum = 0;
        int c = 0;
        Nodo p = L.primero;
        while (p != null) {
            sum += p.dato;
            c++;
            p = p.sig;
        }
        double promedio = sum / c;
        System.out.println("El promedio de la lista es: " + sum / c);
    }

    //Eliminar el ultimo nodo
    public void eliminarUlt(Lista L) {
        Nodo p = L.primero;
        while (p.sig.sig != null) {
            p = p.sig;
        }
        L.eliminar2(p);
    }

    public int direccionMay(Lista L) {
        Nodo p = L.primero;
        int c = 0;
        int pos = 1;
        double mayor = p.dato;
        while (p != null) {
            c++;
            if (p.dato > mayor) {
                mayor = p.dato;
                pos = c;
            }
            p = p.sig;
        }
        return pos;
    }

    public void eliminarPos(Lista L, int pos) {
        int c = 0;
        Nodo p = L.primero;
        Nodo aux = new Nodo();
        if (!L.listaVacia()) {
            if (pos == 1) {
                L.eliminar();
            } else {
                while (p.sig != null) {
                    c++;
                    if (c == pos - 1) {
                        if (p.sig.sig == null) {
                            p.sig = null;
                            break;
                        } else {
                            aux = p;
                            L.eliminar2(aux);
                            break;
                        }
                    }
                    p = p.sig;
                }
            }
        }
    }


    public void ordenar(Lista L) {
        Nodo p;
        int c = 0;
        double aux;
        do {
            c = 0;
            p = L.primero;
            while (p.sig != null) {
                if ((p.dato > p.sig.dato) && p.sig != null) {
                    c++;
                    aux = p.sig.dato;
                    p.sig.dato = p.dato;
                    p.dato = aux;
                }
                p = p.sig;
            }
        } while (c > 0);
        mostrar(L);
    }

    public void vaciarLista(Lista L) {
        Lista L2 = new Lista();
        double mayor = 0;
        while (!L.listaVacia()) {
            System.out.println("La posicion del mayor es: " + direccionMay(L));
            int pos = direccionMay(L);
            int c = 0;
            Nodo p = L.primero;
            Nodo aux = new Nodo();
            if (!L.listaVacia()) {
                if (pos == 1) {
                    mayor = p.dato;
                    System.out.println("numero mayor es: " + mayor);
                    L.eliminar();
                } else {
                    while (p.sig != null) {
                        c++;
                        if (c == pos - 1) {
                            if (p.sig.sig == null) {
                                mayor = p.sig.dato;
                                System.out.println("numero mayor es: " + mayor);
                                p.sig = null;
                                break;
                            } else {
                                aux = p;
                                mayor = p.sig.dato;
                                System.out.println("numero mayor es: " + mayor);
                                L.eliminar2(aux);
                                break;
                            }
                        }
                        p = p.sig;
                    }
                }
                L2.insertar(mayor);
                mostrar(L2);
            }


            System.out.println();
        }System.out.println("La lista está vacía");
    }
}

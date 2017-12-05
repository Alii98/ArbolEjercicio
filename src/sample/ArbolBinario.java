package sample;
public class ArbolBinario {
    public Nodo raiz;
    public String buscarNodo(int valor) {
        Nodo aux = raiz;
        while (aux.getValor( ) != valor) {
            if (valor < aux.getValor( )) {
                aux = aux.nodoIzquierdo;
            } else {
                aux = aux.nodoDerecho;
            }
            if (aux == null) {
                return valor+" no fue encontado";
            }
        }
        return valor+ " fue encontrado";
    }


    public String menorValor() {
        if (raiz != null) {
            Nodo reco = raiz;
            while (reco.getNodoIzquierdo() != null) {
                reco = reco.getNodoIzquierdo();
            }
            return "Menor valor del árbol:" + reco.getValor();
        }
        return "El arbol no tiene valores";
    }
    public String mayorValor() {
        if (raiz != null) {
            Nodo reco = raiz;
            while (reco.getNodoDerecho() != null) {
                reco = reco.getNodoDerecho();
            }
            return "Mayor valor del árbol:" + reco.getValor();
        }
        return "El arbol no tiene valores";
    }
    public boolean vacia(){return raiz==null;}
}
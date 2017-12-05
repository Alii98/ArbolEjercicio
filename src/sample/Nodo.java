package sample;


public class Nodo {

    public int valor;//Valor que da el usuario al elemneto
    public Nodo nodoIzquierdo,nodoDerecho;//Apunta al siguiente
    public Nodo(int valor) {this.valor=valor;this.nodoDerecho=null;this.nodoIzquierdo=null;}
    public int getValor() {return valor;}
    public Nodo getNodoIzquierdo() {return nodoIzquierdo;}
    public Nodo getNodoDerecho() {
        return nodoDerecho;
    }
    public void setNodoIzquierdo(Nodo nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }
    public void setNodoDerecho(Nodo nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }




}
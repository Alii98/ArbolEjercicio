package sample;
public class ArbolBinario {

    public void valores(){
        agregarNodo(8);
        agregarNodo(7);
        agregarNodo(3);
        agregarNodo(5);
        agregarNodo(6);
        agregarNodo(1);
        agregarNodo(10);
        agregarNodo(13);
        agregarNodo(9);
        agregarNodo(4);
        agregarNodo(2);
        agregarNodo(12);
        agregarNodo(22);
    }

    public String preorden = "";
    public String preOrden(Nodo raiz) {
        if (raiz != null) {
            preorden += " " + raiz.getValor();
            preOrden(raiz.getNodoIzquierdo());
            preOrden(raiz.getNodoDerecho());
        }
        return preorden;
    }

    public String inorden="";
    public String inOrden(Nodo raiz) {
        if (raiz != null) {
            inOrden(raiz.getNodoIzquierdo());
            inorden += " " + raiz.getValor();
            inOrden(raiz.getNodoDerecho());
        }
        return inorden;
    }

    public String posorden = "";
    public String posOrden(Nodo raiz) {
        if (raiz != null) {
            posOrden(raiz.getNodoIzquierdo());
            posOrden(raiz.getNodoDerecho());
            posorden += " " + raiz.getValor();
        }
        return posorden;
    }

    public void vaciar(){
        preorden = "";
        inorden = "";
        posorden ="";

    }

}
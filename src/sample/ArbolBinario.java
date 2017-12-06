package sample;
public class ArbolBinario {

 public int tamaño;
    public ArbolBinario() {

        raiz=null;
    }
 public void agregarNodo(int valor){
        tamaño++;
        Nodo nuevo=new Nodo(valor);
        if(raiz==null){
            raiz=nuevo;
        }else {
            Nodo auxiliar=raiz;
            Nodo padre;
            while (true){
                padre=auxiliar;
                if(valor<auxiliar.valor){
                    auxiliar=auxiliar.nodoIzquierdo;
                    if(auxiliar==null){
                        padre.nodoIzquierdo=nuevo;
                        return;
                    }
                }else {
                    auxiliar = auxiliar.nodoDerecho;
                    if(auxiliar==null){
                        padre.nodoDerecho=nuevo;
                        return;
                    }
                }
 controllerArbolBinario c=new controllerArbolBinario();
    public String getTamaño(){return String.valueOf(tamaño);}
            
}
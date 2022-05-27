
package com.mycompany.ruleta2_0;


public class Revolver {
    Nodo r;
    
    public Revolver(){
        this.r = new Nodo();
        Nodo aux =  this.r;
        for (int i = 0; i < 4; i++) {
            aux.siguiente = new Nodo();
            aux = aux.siguiente;
            
            
        }
        aux.siguiente = this.r;
        
    }
    public void cargarBala() {
        int x = (int) Math.floor((Math.random() * 6) + 1);
        Nodo aux = this.r;
        for (int i = 0; i < x; i++) {
            aux = aux.siguiente;
        }
        aux.bala = true;
    }
    
    public void balaRecarga(){
        Nodo aux = this.r;
        for (int i = 0; i < 6; i++) {
            aux.bala = false;
            aux = aux.siguiente;
        }
       cargarBala();
        }
    
    public boolean Fuego(){
        boolean Ruedita = this.r.bala;
        if (Ruedita) {
            
            balaRecarga();
        }else{
            this.r = this.r.siguiente;
        }
        return Ruedita;
    }
    
    public String verificar(){
        if (Fuego()) {
            return "V";
        }else{
            return "M";
        }
    }
    
}

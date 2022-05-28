
package com.mycompany.ruleta2_0;


public class FuncioanamientoRuleta {
    
    
    class nodo{
    Participantes jugadores;
    Revolver revolver;
    nodo siguiente;

    public nodo(Participantes jugadores) {
        this.jugadores = jugadores;
        this.revolver = new Revolver();
        this.siguiente = null;
    }
    
}

   class Participantes {
    String nombre;
    String apellido;

    public Participantes(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    }
    
    public FuncioanamientoRuleta(String dato){
        this.eliminados = "";
        this.Ganador = "";
        this.RegistroRueda = "";
        this.numparticipantes = 0;
        String[] players = dato.split("\n");
        String[] apo;
        for (String juga: players ) {
            apo = juga.split(" ");
            IntroducirParticipantes(new nodo(new Participantes(apo[0], apo[1])));
            numparticipantes++;
            
            
            
        }
        
    }
    nodo iniciar;
    int numparticipantes;
    String eliminados;
    String Ganador;
    String RegistroRueda;
    public void IntroducirParticipantes(nodo nodo1){
        if (this.iniciar == null) {
           iniciar = nodo1;
           iniciar.siguiente = nodo1;
           
            
        }else{
            nodo aux = iniciar;
            while(aux.siguiente != iniciar){
                aux = aux.siguiente;
                
            }
            aux.siguiente = nodo1; 
            nodo1.siguiente = iniciar;
            
        }
        
    }
    
    public void ApretarGatillo(){
        System.out.println("El jugador"+iniciar.jugadores.nombre
        +" "+iniciar.jugadores.apellido+"apunta a"+iniciar.siguiente.jugadores.nombre
        +iniciar.siguiente.jugadores.apellido);
        if (iniciar.revolver.Fuego()) {
            eliminados += iniciar.siguiente.jugadores.nombre+
                    iniciar.siguiente.jugadores.apellido+" "
                    +iniciar.siguiente.jugadores.apellido+"\n";
            System.out.println(iniciar.jugadores.nombre
            +"Mato a "+iniciar.siguiente.jugadores.nombre+"-");
            iniciar.siguiente = iniciar.siguiente.siguiente;
            numparticipantes--;
            
        }else{
            System.out.println(iniciar.jugadores.nombre+"Fallo");
            
        }
        iniciar = iniciar.siguiente; // Se le pasa el turno al otro participante
    }
    
    public void ImprimirLista(){
        nodo aux = iniciar;
        switch(numparticipantes){
            case 0:
                System.out.println("Todo los participante Se mataron");
                Ganador = "No hay gandor";
                break;
                
            case 1:
                System.out.println(" Jugador:  "+aux.jugadores.nombre+" "+aux.jugadores.apellido+" Gano este juego suicida!!!");
                Ganador = aux.jugadores.nombre+" "+aux.jugadores.apellido;
                break;
        }
    }
    
}

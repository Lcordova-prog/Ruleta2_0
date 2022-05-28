
package com.mycompany.ruleta2_0;

import java.util.Scanner;


public class MainRuleta {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       FuncioanamientoRuleta a;
       String boton = "";
        do{
            System.out.println("------ Menu Ruleta Rusa ------ \n" 
                    + "1.------Ver participantes------"+"\n"
                    + "2.------Iniciar Juego------");
            boton = leer.nextLine();
            switch(boton){
                case "1":
                    
                    break;
                    
                case "2":
                    break;
            }
        }while(!boton.equals("0"));
        
       
    }
    
}
class verParticipantes{
    String jugadores;
    
    public void ver(){
    LeerArchivos w = new LeerArchivos();
        jugadores = w.leerArchivo("src\main\java\com\mycompany\ruleta2_0/Participantes.in");
    }
    
}


package com.mycompany.ruleta2_0;
import java.io.*;
public class LeerArchivos {
    
    
    public String leerArchivo(String direccion) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(direccion));
        
        String fila;
        fila = br.readLine();
        String d = fila;
        while((fila = br.readLine()) != null){
            d += "\n"+fila;
        }
        return d;
        
    }
    static void escribirArchivo(String dire, String msg, String Da) throws IOException {
        FileWriter archivo = new FileWriter(dire, true);
        try (PrintWriter pw = new PrintWriter(archivo)) {
            pw.println(dire);
            pw.println(msg);
            pw.close(); //Cerrar el archivo.
        }
    }
}

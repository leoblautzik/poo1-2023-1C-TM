package io;
import java.io.*;

public class LeerArchivo {

    public static void main (String [] arg) {
        FileReader fr = null;
        BufferedReader br = null;

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader ("/home/leoblau/MEGA/Wecode/2021/CESSI/Clases/Clase14ExceptionsArchivos/exceptionsIO/archivos/archivo.txt");
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea = br.readLine();
            while((linea != null)){
                System.out.println(linea);
                linea = br.readLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
                if(fr != null){   
                    fr.close();     
                }                  
            }catch (Exception e2){ 
                e2.printStackTrace();
            }
        }
    }
}


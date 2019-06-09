/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejodearchivos;

import java.io.File;

/**
 *
 * @author ASUS
 */
public class ManrjoDearchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File ruta=new File("C:\\Users\\ASUS\\Documents");
        File[] archivos=ruta.listFiles();
        for (File archivo: archivos) {
            if (archivo.isDirectory()){
            System.out.println(archivo.getName());
            }
            if(archivo.isFile()){
                System.out.println(archivo.getName()); 
            }
            if(archivo.isHidden()){
                System.out.println(archivo.getName());
                
            }
        }
    }
    
}

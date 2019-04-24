package fes.aragon.generar;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jedidian
 */
public class Generador {
    
    public static void main(String[] args){
        Generador gen = new Generador();
        gen.crear();
        
    }

    public void crear() {
        
//        try {
//            Process p = Runtime.getRuntime().exec("java -version");
//            p.waitFor();
//            BufferedReader reader = new BufferedReader(new InputStreamReader
//                (p.getInputStream()));
//            String line = "";
//            while( (line = reader.readLine()) != null ){
//                System.out.println(line);
//                line = reader.readLine();
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

        String salida = System.getProperty("user.dir") + "/src/fes/aragon/lexico";
        String ruta = System.getProperty("user.dir") + "/src/fes/aragon/conf/codigo.txt";
        jflex.Options.setDir(salida);
        jflex.Main.generate(new File(ruta));
    }
    
    
}

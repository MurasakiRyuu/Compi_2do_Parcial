/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.inicio;

import fes.aragon.conts.Tokens;
import fes.aragon.lexico.Lexico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jedidian
 */
public class Inicio {
    
    private Tokens tokens;
    private Lexico lexico;
    
    public static void main(String[] args){
        
        try {
            Reader leer = null;
            
            String ruta = System.getProperty("user.dir") + "/src/fes/aragon/conf/Fuente.txt";
            leer = new BufferedReader(new FileReader(new File(ruta)));
            
            Inicio ap = new Inicio();
            ap.lexico = new Lexico(leer);
            ap.tokens = ap.lexico.yylex();
            
            while(ap.tokens != null){
                System.out.println(ap.tokens);
                ap.tokens = ap.lexico.yylex();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
    }
    
    
}

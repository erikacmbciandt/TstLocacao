package com.mateszbueno.tstlocacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Erika Cristina Matesz Bueno
 */
public class Leitura {
    
    public String entDados(String rotulo) {

        System.out.println(rotulo);

        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(teclado);

        String retorno = "";
       
        try {
            retorno = buff.readLine();
        } catch(IOException ioe) {
            System.out.println("\nERRO de sistema: RAM - TECLADO");
        }

        return retorno;
    }
    
}

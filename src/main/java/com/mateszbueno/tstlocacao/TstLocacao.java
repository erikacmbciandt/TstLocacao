package com.mateszbueno.tstlocacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Erika Cristina Matesz Bueno
 */
public class TstLocacao {

    public static void main(String[] args) throws ParseException {
        
        Leitura leitura = new Leitura();
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("===== Nova Locacao =====");
        Locacao locacao = new Locacao();
        
        String inicio = leitura.entDados("Data inicial: ");
        Date dataInicio = formato.parse(inicio);
        locacao.setDataInicio(dataInicio);
        
        String fim = leitura.entDados("Data final: ");
        Date dataFinal = formato.parse(fim);
        locacao.setDataFim(dataFinal);
        
        
    }
}

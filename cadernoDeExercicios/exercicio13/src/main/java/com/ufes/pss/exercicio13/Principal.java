/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.pss.exercicio13;

import com.ufes.pss.exercicio13.service.ConversorMoedaService;
import com.ufes.pss.exercicio13.service.MetodoUSDParaBRL;

/**
 *
 * @author nitro
 */
public class Principal {

    public static void main(String[] args) {
        MercadoriaUSD externo = new MercadoriaUSD();
        MetodoUSDParaBRL metodo = new MetodoUSDParaBRL(externo, 5);
        ConversorMoedaService service = new ConversorMoedaService(metodo);
        
        double retorno = service.converter();
        
        System.out.print("\nUSD $ " + externo.getValor() + "\nBRL $ " + retorno);
        
    }
}

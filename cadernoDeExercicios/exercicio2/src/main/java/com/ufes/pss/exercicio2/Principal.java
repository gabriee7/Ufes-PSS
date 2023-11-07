/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.pss.exercicio2;

import java.util.ArrayList;

/**
 *
 * @author nitro
 */
public class Principal {

    public static void main(String[] args) {
        LogCollection colecao = LogCollection.getInstancia();
        Log log = new Log("Login com Sucesso!!");
        
        colecao.addLog(log);
        
        
        ArrayList<Log> retorno = colecao.getLogs();
        
        for(Log elem: retorno){
            System.out.print("\nLOG: "+ elem.getMensagem() + "\tDATA: " + elem.getData() );
        }
    }
}

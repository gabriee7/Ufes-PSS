/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio4.MonitoramentoService;

import com.ufes.pss.exercicio4.Monitoramento;
import java.util.ArrayList;

/**
 *
 * @author nitro
 */
public class ModuloMonitoramentoService {
    private ArrayList<IModuloMetodoNotificacao> modulosNotificacao;
    
    public ModuloMonitoramentoService(){
        modulosNotificacao.add(new MetodoNotificaDataCotacao());
        modulosNotificacao.add(new MetodoNotificaPreco());
    }
    
    public void notifica(Monitoramento monitoramento){
        for(IModuloMetodoNotificacao ele : modulosNotificacao){
            ele.processar(monitoramento);
        }
    }
}

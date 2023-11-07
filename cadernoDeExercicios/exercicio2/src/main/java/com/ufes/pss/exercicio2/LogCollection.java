/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio2;

import java.util.ArrayList;

/**
 *
 * @author nitro
 */
public class LogCollection {
    private ArrayList<Log> logs;
    private static LogCollection instancia;

    private LogCollection() {
        this.logs = new ArrayList<>();
    }
    
    public static LogCollection getInstancia(){
        if(instancia == null)
            instancia = new LogCollection();
        
        return instancia;
    }
    
    public void addLog(Log log){
        logs.add(log);
    }
    
    public ArrayList<Log> getLogs(){
        return logs;
    }
}

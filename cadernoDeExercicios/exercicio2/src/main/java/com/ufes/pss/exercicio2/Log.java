/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufes.pss.exercicio2;

import java.time.LocalDate;

/**
 *
 * @author nitro
 */
public class Log {
    private String mensagem;
    private LocalDate data;

    public Log(String mensagem) {
        this.mensagem = mensagem;
        this.data = LocalDate.now();
    }

    public String getMensagem() {
        return mensagem;
    }

    public LocalDate getData() {
        return data;
    }
    
}

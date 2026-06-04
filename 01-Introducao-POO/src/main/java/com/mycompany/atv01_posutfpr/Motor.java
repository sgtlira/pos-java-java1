/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv01_posutfpr;

/**
 *
 * @author guigu
 */
public class Motor {
    
    int qtdPist;
    int potencia;
    
    public Motor() {
        this.qtdPist = 0;
        this.potencia = 0;
    }
    
    public Motor (int qtdPist, int potencia){
        this.qtdPist = qtdPist;
        this.potencia = potencia; 
    }
    
    public int getQtdPist(){
        return this.qtdPist;
    }
    
    public int getPotencia(){
        return this.potencia;
    }
    
    public void setQtdPist(int qtdPist){
        this.qtdPist = qtdPist;
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
}

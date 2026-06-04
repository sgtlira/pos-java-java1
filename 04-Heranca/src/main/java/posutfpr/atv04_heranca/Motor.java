/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posutfpr.atv04_heranca;

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
    
    public int getQtdPist(){
        return qtdPist;
    }
    
    public int getPotencia(){
        return potencia;
    }
    
    public void setQtdPist(int qtdPist){
        this.qtdPist = qtdPist;
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posutfpr.atv04_heranca;

/**
 *
 * @author guigu
 */
public final class Passeio extends Veiculo {
    private int qtdPas;
    
    public Passeio(){
        this.qtdPas = 0;
    }
    
    public int getQtdPas(){
       return qtdPas;
    }
       
    public void setQtdPas(int qtdPas){
        this.qtdPas = qtdPas;
    }

    @Override
    public float calcVel(float velocMax) {
        return this.getVelocMax() * 1000;
    }
        
}

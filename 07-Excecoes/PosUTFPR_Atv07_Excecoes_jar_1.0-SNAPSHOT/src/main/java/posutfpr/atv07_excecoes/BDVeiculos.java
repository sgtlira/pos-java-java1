/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posutfpr.atv07_excecoes;

/**
 *
 * @author guigu
 */
public class BDVeiculos {
    
    private Passeio[] passeio;
    private Carga[] carga;
    
    public BDVeiculos(int capacidade) {
        this.passeio = new Passeio[5];
        this.carga = new Carga[5];
    }
    
    public Passeio[] getPasseio(){
        return passeio;
    }
    
    public Carga[] getCarga(){
        return carga;
    }
    
    public void setPasseio(Passeio[] passeio) {
        this.passeio = passeio;
    }
    
    public void setCarga(Carga[] carga) {
        this.carga = carga;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posutfpr.atv09_interfacegrafica;

/**
 *
 * @author guigu
 */
import java.util.ArrayList;
import java.util.List;

public class BDVeiculos {
    
    private List<Passeio> vPasseio = new ArrayList<>();
    private List<Carga> vCarga = new ArrayList<>();
    
    public List<Passeio> getPasseio(){
        return vPasseio;
    }
    
    public List<Carga> getCarga(){
        return vCarga;
    }
    
    public void setPasseio(List<Passeio> vPasseio) {
        this.vPasseio = vPasseio;
    }
    
    public void setCarga(List<Carga> vCarga) {
        this.vCarga = vCarga;
    }
    
}

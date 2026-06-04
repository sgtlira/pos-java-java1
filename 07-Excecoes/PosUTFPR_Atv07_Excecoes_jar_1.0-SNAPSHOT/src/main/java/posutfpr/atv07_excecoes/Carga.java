/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posutfpr.atv07_excecoes;

import java.lang.reflect.Field;

/**
 *
 * @author guigu
 */
public final class Carga extends Veiculo implements Calc {
    
    private int cargaMax;
    private int tara;
    
    public Carga(){
        this.cargaMax = 0;
        this.tara = 0;
    }
    
    public Carga(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas,int qtdPist, int potencia, int cargaMax, int tara){
        super(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia);
        this.cargaMax = cargaMax;
        this.tara = tara;
    }
    
    public int getCargaMax(){
        return cargaMax;
    }
    
    public int getTara(){
        return tara;
    }
    
    public void setCargaMax(int cargaMax){
        this.cargaMax = cargaMax;
    }
    
    public void setTara(int tara){
        this.tara = tara;
    }

    @Override
    public float calcVel(float velocMax) {
        return this.getVelocMax()* 100000;
    }
    
    @Override
    public int calcular() {
    return somarNumericos(this);
    }

    private int somarNumericos(Object obj) {
        int total = 0;

        if (obj == null) return 0;

        Class<?> classe = obj.getClass();

        while (classe != null) {
            Field[] campos = classe.getDeclaredFields();

            for (Field campo : campos) {
                try {
                    campo.setAccessible(true);
                    Object valor = campo.get(obj);

                    if (valor == null) continue;

                    if (isNumerico(campo.getType())) {
                        total += ((Number) valor).intValue();
                    }

                    else if (!campo.getType().isPrimitive() &&
                            campo.getType() != String.class) {

                        total += somarNumericos(valor);
                    }

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            classe = classe.getSuperclass();
        }

        return total;
    }   

    private boolean isNumerico(Class<?> tipo) {
        return tipo == int.class || tipo == float.class ||
               Number.class.isAssignableFrom(tipo);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\n Dados do Veiculo de Carga: " +
            "\n  Carga Maxima: " + cargaMax + " Kg" +
            "\n  Tara: " + tara + " Kg" +
            "\n  Velocidade em Cm/h: " + String.format("%,.2f", calcVel(getVelocMax())) + " Cm/h\n" +
            "\n  Soma de todos os valores contidos nos atributos numericos: " + calcular();
    }
}
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posutfpr.atv05_interface;

import java.lang.reflect.Field;

/**
 *
 * @author guigu
 */
public final class Passeio extends Veiculo implements Calc {
    private int qtdPas;
    
    public Passeio(){
        this.qtdPas = 0;
    }
    
    public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qtdRodas, int qtdPist, int potencia, int qtdPas){
        super(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia);
        this.qtdPas = qtdPas;
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
    
    
    @Override
    public int calcular() {
        int total = 0;

        Class<?> classe = this.getClass();

        while (classe != null) {
            Field[] campos = classe.getDeclaredFields();

            for (Field campo : campos) {
                if (campo.getType() == String.class) {
                    try {
                        campo.setAccessible(true);
                        String valor = (String) campo.get(this);

                        if (valor != null) {
                            total += valor.length();
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }

            classe = classe.getSuperclass();
        }

        return total;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n\n Dados do Veiculo de Passeio: " +
            "\n  Quantidade de Passageiros: " + qtdPas +
            "\n  Velocidade em M/h: " + String.format("%,.2f%n", calcVel(getVelocMax())) + "M/h" +
            "\n  Qtd de Letras existentes em todos os atributos do tipo String: " + calcular();
    }
        
}

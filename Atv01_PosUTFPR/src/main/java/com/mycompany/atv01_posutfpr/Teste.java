/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv01_posutfpr;

/**
 *
 * @author guigu
 */
public class Teste {
    
    public static void main (String arg[]){
        
        //Parametro 2
        Veiculo v1 = new Veiculo("A", "A", "A", "A", 0.0f, 1, 2, 3);
        System.out.println("Veiculo 1");
        System.out.println("Placa....: " + v1.getPlaca());
        System.out.println("Marca....: " + v1.getMarca());
        System.out.println("Modelo...: " + v1.getModelo());
        System.out.println("Cor......: " + v1.getCor());
        System.out.println("Veloc Max: " + v1.getVelocMax());
        System.out.println("Rodas....: " + v1.getQtdRodas());
        System.out.println("Pistoes..: " + v1.getMotor().getQtdPist());
        System.out.println("Potencia.: " + v1.getMotor().getPotencia());
        
        Veiculo v2 = new Veiculo("B", "B", "B", "B", 4.0f, 5, 6, 7);
        System.out.println("\nVeiculo 2");
        System.out.println("Placa....: " + v2.getPlaca());
        System.out.println("Marca....: " + v2.getMarca());
        System.out.println("Modelo...: " + v2.getModelo());
        System.out.println("Cor......: " + v2.getCor());
        System.out.println("Veloc Max: " + v2.getVelocMax());
        System.out.println("Rodas....: " + v2.getQtdRodas());
        System.out.println("Pistoes..: " + v2.getMotor().getQtdPist());
        System.out.println("Potencia.: " + v2.getMotor().getPotencia());
        
        Veiculo v3 = new Veiculo("C", "C", "C", "C", 8.0f, 9, 10, 11);
        System.out.println("\nVeiculo 3");
        System.out.println("Placa....: " + v3.getPlaca());
        System.out.println("Marca....: " + v3.getMarca());
        System.out.println("Modelo...: " + v3.getModelo());
        System.out.println("Cor......: " + v3.getCor());
        System.out.println("Veloc Max: " + v3.getVelocMax());
        System.out.println("Rodas....: " + v3.getQtdRodas());
        System.out.println("Pistoes..: " + v3.getMotor().getQtdPist());
        System.out.println("Potencia.: " + v3.getMotor().getPotencia());
        
        Veiculo v4 = new Veiculo("D", "D", "D", "D", 9.0f, 10, 11, 12);
        System.out.println("\nVeiculo 4");
        System.out.println("Placa....: " + v4.getPlaca());
        System.out.println("Marca....: " + v4.getMarca());
        System.out.println("Modelo...: " + v4.getModelo());
        System.out.println("Cor......: " + v4.getCor());
        System.out.println("Veloc Max: " + v4.getVelocMax());
        System.out.println("Rodas....: " + v4.getQtdRodas());
        System.out.println("Pistoes..: " + v4.getMotor().getQtdPist());
        System.out.println("Potencia.: " + v4.getMotor().getPotencia());
        
        Veiculo v5 = new Veiculo("E", "E", "E", "E", 10.0f, 11, 12, 13);
        System.out.println("\nVeiculo 5");
        System.out.println("Placa....: " + v5.getPlaca());
        System.out.println("Marca....: " + v5.getMarca());
        System.out.println("Modelo...: " + v5.getModelo());
        System.out.println("Cor......: " + v5.getCor());
        System.out.println("Veloc Max: " + v5.getVelocMax());
        System.out.println("Rodas....: " + v5.getQtdRodas());
        System.out.println("Pistoes..: " + v5.getMotor().getQtdPist());
        System.out.println("Potencia.: " + v5.getMotor().getPotencia());
        
    }
    
}

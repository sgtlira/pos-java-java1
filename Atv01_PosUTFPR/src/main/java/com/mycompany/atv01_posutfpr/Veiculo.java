/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv01_posutfpr;

/**
 *
 * @author guigu
 */
public class Veiculo {
            private String placa;
            private String marca;
            private String modelo;
            private String cor;
            private Float velocMax;
            private int qtdRodas;
            private Motor motor;
            
            public Veiculo() {
                this.placa = " ";
                this.marca = " ";
                this.modelo = " ";
                this.cor = "";
                this.velocMax = 0f;
                this.qtdRodas = 0;
                motor = new Motor();
            }
        
            
            
            public Veiculo(String placa, String marca, String modelo, String cor, Float velocMax, int qtdRodas) {
                this.placa = placa;
                this.marca = marca;
                this.modelo = modelo;
                this.cor = cor;
                this.velocMax = velocMax;
                this.qtdRodas = qtdRodas;
                motor = new Motor();
            }
            
            public Veiculo(String placa, String marca, String modelo, String cor, Float velocMax, int qtdRodas, int qtdPist, int potencia) {
                this.placa = placa;
                this.marca = marca;
                this.modelo = modelo;
                this.cor = cor;
                this.velocMax = velocMax;
                this.qtdRodas = qtdRodas;
                this.motor = new Motor(qtdPist, potencia);
            }
            
            public String getPlaca(){
                return this.placa;
            }
            
            public String getMarca(){
                return this.marca;
            }
            
            public String getModelo(){
                return this.modelo;
            }
            
            public String getCor(){
                return this.cor;
            }
            
            public Float getVelocMax(){
                return this.velocMax;
            }
            
            public int getQtdRodas(){
                return this.qtdRodas;
            }
            
            public Motor getMotor(){
                return this.motor;
            }
            
            public void setPlaca(String placa){
                this.placa = placa;
            }
            
            public void setMarca(String marca){
                this.marca = marca;
            }
            
            public void setModelo(String modelo){
                this.modelo = modelo;
            }
            
            public void setCor(String cor){
                this.cor = cor;
            }
            
            public void setVelocMax(Float velocMax){
                this.velocMax = velocMax;
            }
            
            public void setQtdRodas(int qtdRodas){
                this.qtdRodas = qtdRodas;
            }
            
        /**
         *
         * @return
         */
            @Override
            public String toString(){
                
                System.out.println("Qual a placa do seu carro ? " + this.placa);
                System.out.println("Qual a marca do seu carro ? " + this.marca);
                System.out.println("Qual o modelo do seu carro ? " + this.modelo);
                System.out.println("Qual a cor do seu carro ? " + this.cor);
                System.out.println("Qual a velocidade maxima do seu carro ? " + this.velocMax);
                System.out.println("Quantas rodas seu carro possui ? " + this.qtdRodas);
                return null;
            }
        }

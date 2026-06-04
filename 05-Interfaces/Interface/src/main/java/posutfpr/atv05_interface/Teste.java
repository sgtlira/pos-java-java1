/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posutfpr.atv05_interface;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author guigu
 */
public abstract class Teste {
    
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
    DecimalFormat df = new DecimalFormat("#,##0.00", symbols);
    DecimalFormat df1 = new DecimalFormat("###,##0.00", symbols);
    
    private static Passeio[] vp = new Passeio[5];
    private static Carga[] vc = new Carga[5];
    private static int contadorP = 0;
    private static int contadorC = 0;
    private static Leitura l = new Leitura();
    
    public static void main (String arg[]){
        
        int opcao;
        
        do {
            System.out.println("\n Sistema de Gestao de Veiculos - Menu Inicial");
            System.out.println("\n 1. Cadastrar Veiculo de Passeio");
            System.out.println("\n 2. Cadastrar Veiculo de Carga");
            System.out.println("\n 3. Imprimir Todos os Veiculos de Passeio");
            System.out.println("\n 4. Imprimir Todos os Veiculos de Carga");
            System.out.println("\n 5. Imprimir Veiculo de Passeio pela Placa");
            System.out.println("\n 6. Imprimir Veiculo de Carga pela Placa");
            System.out.println("\n 7. Sair do Sistema");
            
            opcao = Integer.parseInt(l.entDados("\n Escolha uma opcao: "));
            
            switch (opcao) {
                case 1:
                    cadastrarVp();
                    break;
                    
                case 2:
                    cadastrarVc();
                    break;
                    
                case 3:
                    mostrarTodosVp();
                    break;
                    
                case 4:
                    mostrarTodosVc();
                    break;
                    
                case 5:
                    buscarVpPlaca();
                    break;
                    
                case 6:
                    buscarVcPlaca();
                    break;
                    
                case 7:
                    System.out.println("\nSaindo do menu...");
                    break;
                    
                default:
                    System.out.println("\nOpcao invalida, tente novamente.");
                    break;
           
            }
        } while (opcao != 7);
        
    }
    
    private static void cadastrarVp(){
        
        if (contadorP >= vp.length) {
            System.out.println("\nNao ha espaco para mais Ceiculos de Passeio.");
            return;
        }
        
        // Coleta os Dados do Veiculo de Passeio
        String placa = l.entDados("\nDigite a placa do Veiculo de Passeio: ");
        String marca = l.entDados("Digite a marca do Veiculo de Passeio: ");
        String modelo = l.entDados("Digite o modelo do Veiculo de Passeio: ");
        String cor = l.entDados("Digite a cor do Veiculo de Passeio: ");
        float velocMax = Float.parseFloat(l.entDados("Digite a Veloc. Max do Veiculo de Passeio: "));
        int qtdRodas = Integer.parseInt(l.entDados("Digite a qtd de rodas do Veiculo de Passeio: "));
        int qtdPist = Integer.parseInt(l.entDados("Digite a qtd de Pistoes do Veiculo de Passeio: "));
        int potencia = Integer.parseInt(l.entDados("Digite a potencia do Veiculo de Passeio: "));
        int qtdPas = Integer.parseInt(l.entDados("Digite a qtd Passageiros do Veiculo de Passeio: "));
        
        // Valida se ja existe um Veiculo com a mesma Placa
        if (placaExiste(placa)) {
            System.out.println("\n\nErro: Ja existe um Veiculo com essa placa.");
            return;
        }
        
        // Cria o objeto Passeio com os dados fornecidos
        Passeio passeio = new Passeio(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia, qtdPas);
        
        // Adiciona o Veiculo de Passeio no vetor de VP
        vp[contadorP] = passeio;
        contadorP++;
        
        // Exibe os dados do Veiculo de Passeio cadastrado
        System.out.println("\n" + contadorP + " Veiculo de Passeio cadastrado com sucesso!");
        System.out.println(passeio);
        
        //Pergunta se o usuario deseja cadastrar outro Veiculo de Passeio
        String continuar = l.entDados("\n\nDeseja cadastrar outro Veiculo de Passeio? (S/N): ");
        if (!continuar.equalsIgnoreCase("S")) {
            System.out.println("\nVoltando ao menu...");
        } else {
            cadastrarVp();
        }
        
    }
    
    private static void cadastrarVc(){
        
        if (contadorC >= vc.length) {
            System.out.println("\nNao ha espaco para mais Veiculos de Carga.");
            return;
        }
        
        // Coleta os Dados do Veiculo de Passeio
        String placa = l.entDados("\nDigite a placa do Veiculo de Carga: ");
        String marca = l.entDados("Digite a marca do Veiculo de Carga: ");
        String modelo = l.entDados("Digite o modelo do Veiculo de Carga: ");
        String cor = l.entDados("Digite a cor do Veiculo de Carga: ");
        float velocMax = Float.parseFloat(l.entDados("Digite a Veloc. Max do Veiculo de Carga: "));
        int qtdRodas = Integer.parseInt(l.entDados("Digite a qtd de rodas do Veiculo de Carga: "));
        int qtdPist = Integer.parseInt(l.entDados("Digite a qtd de Pistoes do Veiculo de Carga: "));
        int potencia = Integer.parseInt(l.entDados("Digite a potencia do Veiculo de Carga: "));
        int cargaMax = Integer.parseInt(l.entDados("Digite a carga Max do Veiculo de Carga: "));
        int tara = Integer.parseInt(l.entDados("Digite a tara do Veiculo de Carga: "));
        
        // Valida se ja existe um Veiculo com a mesma Placa
        if (placaExiste(placa)) {
            System.out.println("\n\nErro: Ja existe um Veiculo com essa placa.");
            return;
        }
        
        // Cria o objeto Carga com os dados fornecidos
        Carga carga = new Carga(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia, cargaMax, tara);
        
        // Adiciona o Veiculo de Passeio no vetor de VP
        vc[contadorC] = carga;
        contadorC++;
        
        // Exibe os dados do Veiculo de Carga cadastrado
        System.out.println("\n" + contadorC + " Veiculo de Carga cadastrado com sucesso!");
        System.out.println(carga);
        
        //Pergunta se o usuario deseja cadastrar outro Veiculo de Passeio
        String continuar = l.entDados("\n\nDeseja cadastrar outro Veiculo de Carga? (S/N): ");
        if (!continuar.equalsIgnoreCase("S")) {
            System.out.println("\nVoltando ao menu...");
        } else {
            cadastrarVc();
        }
        
    }
       
    //Metodo para verificar se existe um Veiculo com a placa fornecida
    private static boolean placaExiste(String placa) {
        
        //Verificacao nos Veiculos de Passeio
        for (int i = 0; i < contadorP; i++) {
            if (vp[i].getPlaca().equals(placa)){
                return true;
            } 
        }
        
        //Verificacao nos Veiculos de Carga
        for (int i = 0; i < contadorC; i++) {
            if (vc[i].getPlaca().equals(placa)){
                return true;
            } 
        }
        return false;
    }
    
    //Metodo para mostrar todos os Veiculos de Passeio cadastrados
    private static void mostrarTodosVp() {
        if (contadorP == 0) {
            System.out.println("\nNenhum Veiculo de Passeio cadastrado.");
        } else {
            System.out.println("\n Lista de Veiculos de Passeio:");
            for (int i = 0; i < contadorP; i++) {
                System.out.println(vp[i]);
                System.out.println("\n\n---------------------------------");
            }
        }
    }
    
    //Metodo para mostrar todos os Veiculos de Carga cadastrados
    private static void mostrarTodosVc() {
        if (contadorC == 0) {
            System.out.println("\nNenhum Veiculo de Carga cadastrado.");
        } else {
            System.out.println("\n Lista de Veiculos de Carga:");
            for (int i = 0; i < contadorC; i++) {
                System.out.println(vc[i]);
                System.out.println("\n\n---------------------------------");
            }
        }
    }
    
    //Metodo para buscar todos os Veiculos de Passeio pela placa
    private static void buscarVpPlaca() {
        String placa = l.entDados("\nDigite a placa do Veiculo de Passeio: ");
        boolean encontrado = false;
        
        for (int i = 0; i < contadorP; i++) {
            if (vp[i].getPlaca().equals(placa)){
                System.out.println("\n Veiculo de Passeio encontrado: ");
                System.out.println(vp[i]);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("\n Veiculo de Passeio com a placa " + placa + " nao encontrado.");
        }
    }
    
    //Metodo para buscar todos os Veiculos de Carga pela placa
    private static void buscarVcPlaca() {
        String placa = l.entDados("\nDigite a placa do Veiculo de Carga: ");
        boolean encontrado = false;
        
        for (int i = 0; i < contadorC; i++) {
            if (vc[i].getPlaca().equals(placa)){
                System.out.println("\n Veiculo de Carga encontrado: ");
                System.out.println(vc[i]);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("\n Veiculo de Carga com a placa " + placa + " nao encontrado.");
        }
    }
}
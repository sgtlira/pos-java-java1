/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posutfpr.atv08_collections;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guigu
 */
public abstract class Teste {
    
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
    DecimalFormat df = new DecimalFormat("#,##0.00", symbols);
    DecimalFormat df1 = new DecimalFormat("###,##0.00", symbols);
    
    private static BDVeiculos bd = new BDVeiculos();
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
            System.out.println("\n 7. Excluir Veiculo de Passeio pela Placa");
            System.out.println("\n 8. Excluir Veiculo de Carga pela Placa");
            System.out.println("\n 9. Sair do Sistema");
            
            opcao = Integer.parseInt(l.entDados("\n Escolha uma opcao: "));   
            
            try {
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
                        excluiVpPlaca();
                        break;
                    
                    case 8:
                        excluiVcPlaca();
                        break;

                    case 9:
                        System.out.println("\n Saindo do menu...");
                        break;

                    default:
                        System.out.println("\n Opcao invalida, tente novamente.");
                        break;

                }
            } catch (VeicExistException e) {
                System.out.println("\nErro: " + e.getMessage());
            } catch (VelocException e){
                System.out.println("\nErro: " + e.getMessage());
            }
        } while (opcao != 9);
        
    }
    
    private static void cadastrarVp() throws VeicExistException, VelocException{

        // Coleta os Dados do Veiculo de Passeio
        String placa = l.entDados("\nDigite a placa do Veiculo de Passeio: ");
        String marca = l.entDados("Digite a marca do Veiculo de Passeio: ");
        String modelo = l.entDados("Digite o modelo do Veiculo de Passeio: ");
        String cor = l.entDados("Digite a cor do Veiculo de Passeio: ");

        //Verifica se a Velocidade Maxima esta dentro dos padroes
        float velocMax;
        try {
            velocMax = Float.parseFloat(l.entDados("Digite a Veloc. Max do Veiculo de Passeio: "));
        
            //Lancando a Excecao
            if (velocMax < 80 || velocMax > 110) {
                throw new VelocException("\nA velocidade maxima esta fora dos limites brasileiros");
            }
        } catch (VelocException e) {
            System.out.println(e.getMessage());
            velocMax = 100;
            System.out.println("\nFoi atribuido o valor de 100 Km/h para velocidade maxima do seu Veiculo de Passeio!\n");
        }   
        int qtdRodas = Integer.parseInt(l.entDados("Digite a qtd de rodas do Veiculo de Passeio: "));
        int qtdPist = Integer.parseInt(l.entDados("Digite a qtd de Pistoes do Veiculo de Passeio: "));
        int potencia = Integer.parseInt(l.entDados("Digite a potencia do Veiculo de Passeio: "));
        int qtdPas = Integer.parseInt(l.entDados("Digite a qtd Passageiros do Veiculo de Passeio: "));
        
        // Valida se ja existe um Veiculo com a mesma Placa
        if (placaExiste(placa)) {
            throw new VeicExistException("\n Ja existe um Veiculo com essa placa.");
        }
        
        // Cria o objeto Passeio com os dados fornecidos
        Passeio passeio = new Passeio(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia, qtdPas);
        
        // Adiciona o Veiculo na lista
        bd.getPasseio().add(passeio);
        
        // Exibe os dados do Veiculo de Passeio cadastrado
        System.out.println("\n Veiculo de Passeio cadastrado com sucesso!");
        System.out.println(passeio);
        
        //Pergunta se o usuario deseja cadastrar outro Veiculo de Passeio
        String continuar = l.entDados("\n\nDeseja cadastrar outro Veiculo de Passeio? (S/N): ");
        if (!continuar.equalsIgnoreCase("S")) {
            System.out.println("\nVoltando ao menu...");
        } else {
            cadastrarVp();
        }
        
    }
    
    private static void cadastrarVc() throws VeicExistException, VelocException{

        // Coleta os Dados do Veiculo de Passeio
        String placa = l.entDados("\nDigite a placa do Veiculo de Carga: ");
        String marca = l.entDados("Digite a marca do Veiculo de Carga: ");
        String modelo = l.entDados("Digite o modelo do Veiculo de Carga: ");
        String cor = l.entDados("Digite a cor do Veiculo de Carga: ");
        //float velocMax = Float.parseFloat(l.entDados("Digite a Veloc. Max do Veiculo de Carga: "));
        
        //Verifica se a Velocidade Maxima esta dentro dos padroes
        float velocMax;
        try {
            velocMax = Float.parseFloat(l.entDados("Digite a Veloc. Max do Veiculo de Carga: "));
        
            //Lancando a Excecao
            if (velocMax < 80 || velocMax > 110) {
                throw new VelocException("\nA velocidade maxima esta fora dos limites brasileiros");
            }
        } catch (VelocException e) {
            System.out.println(e.getMessage());
            velocMax = 90;
            System.out.println("\nFoi atribuido o valor de 90 Km/h para velocidade maxima do seu Veiculo de Carga!\n");
        } 
        int qtdRodas = Integer.parseInt(l.entDados("Digite a qtd de rodas do Veiculo de Carga: "));
        int qtdPist = Integer.parseInt(l.entDados("Digite a qtd de Pistoes do Veiculo de Carga: "));
        int potencia = Integer.parseInt(l.entDados("Digite a potencia do Veiculo de Carga: "));
        int cargaMax = Integer.parseInt(l.entDados("Digite a carga Max do Veiculo de Carga: "));
        int tara = Integer.parseInt(l.entDados("Digite a tara do Veiculo de Carga: "));
        
        // Valida se ja existe um Veiculo com a mesma Placa
        if (placaExiste(placa)) {
            throw new VeicExistException("\n Ja existe um Veiculo com essa placa.");
        }
        
        // Cria o objeto Carga com os dados fornecidos
        Carga carga = new Carga(placa, marca, modelo, cor, velocMax, qtdRodas, qtdPist, potencia, cargaMax, tara);
        
        // Adiciona o Veiculo de Carga na Lista
        bd.getCarga().add(carga);
        
        // Exibe os dados do Veiculo de Carga cadastrado
        System.out.println("\n Veiculo de Carga cadastrado com sucesso!");
        System.out.println(carga);
        
        //Pergunta se o usuario deseja cadastrar outro Veiculo de Carga
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
        for (Passeio passeio : bd.getPasseio()) {
            if (passeio.getPlaca().equals(placa)){
                return true;
            } 
        }
        
        //Verificacao nos Veiculos de Carga
        for (Carga carga : bd.getCarga()) {
            if (carga.getPlaca().equals(placa)){
                return true;
            } 
        }
        return false;
    }
    
    //Metodo para mostrar todos os Veiculos de Passeio cadastrados
    private static void mostrarTodosVp() {
        List<Passeio> vPasseio = bd.getPasseio();
        if (vPasseio.isEmpty()) {
            System.out.println("\nNenhum Veiculo de Passeio cadastrado.");
            return;
        }
        for (Passeio passeio : vPasseio){
            System.out.println(passeio);
            System.out.println("\n-----------------------------------");
        }
    }
    
    //Metodo para mostrar todos os Veiculos de Carga cadastrados
    private static void mostrarTodosVc() {
        List<Carga> vCarga = bd.getCarga();
        if (vCarga.isEmpty()) {
            System.out.println("\nNenhum Veiculo de Carga cadastrado.");
            return;
        }
        for (Carga carga : vCarga){
            System.out.println(carga);
            System.out.println("\n-----------------------------------");
        }
    }
    
    //Metodo para buscar todos os Veiculos de Passeio pela placa
    private static void buscarVpPlaca() {
        String placa = l.entDados("\nDigite a placa do Veiculo de Passeio: ");
        Passeio passeio = buscarPlacaVp(placa);
        
        if (passeio != null){
            System.out.println("\n Veiculo de Passeio encontrado: ");
            System.out.println(passeio);
        } else{
            System.out.println("\n Veiculo de Passeio com a placa (" + placa + ") nao encontrado.");
        }
    }
    
    //Retorna Veiculo de Paseio pela Placa, ou null se nao encontrado
    private static Passeio buscarPlacaVp(String placa){
        for(Passeio passeio : bd.getPasseio()){
            if (passeio.getPlaca().equals(placa))
                return passeio;
        }
        return null;
    }
    
    //Metodo para buscar todos os Veiculos de Carga pela placa
    private static void buscarVcPlaca() {
        String placa = l.entDados("\nDigite a placa do Veiculo de Carga: ");
        Carga carga = buscarPlacaVc(placa);
        
        if (carga != null){
            System.out.println("\n Veiculo de Carga encontrado: ");
            System.out.println(carga);
        } else{
            System.out.println("\n Veiculo de Carga com a placa (" + placa + ") nao encontrado.");
        }
    }
    
    //Retorna Veiculo de Carga pela Placa, ou null se nao encontrado
    private static Carga buscarPlacaVc(String placa){
        for(Carga carga : bd.getCarga()){
            if (carga.getPlaca().equals(placa))
                return carga;
        }
        return null;
    }
    
    //Excluir Veiculo de Passeio pela Placa
    private static void excluiVpPlaca(){
        String placa = l.entDados("\nDigite a Placa do Veiculo de Passeio para excluir: ");
        Passeio passeio = buscarPlacaVp(placa);
        
        if (passeio != null){
            bd.getPasseio().remove(passeio);
            System.out.println("\n Veiculo de Passeio com a placa (" + placa + ") excluido com sucesso.");
        } else {
            System.out.println("\n Veiculo de Passeio com a placa (" + placa + ") nao encontrado.");
        }
    }
    
    //Excluir Veiculo de Carga pela Placa
    private static void excluiVcPlaca(){
        String placa = l.entDados("\nDigite a Placa do Veiculo de Carga para excluir: ");
        Carga carga = buscarPlacaVc(placa);
        
        if (carga != null){
            bd.getCarga().remove(carga);
            System.out.println("\n Veiculo de Carga com a placa (" + placa + ") excluido com sucesso.");
        } else {
            System.out.println("\n Veiculo de Carga com a placa (" + placa + ") nao encontrado.");
        }
    }
}
package posutfpr.atv09_interfacegrafica;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;

public class GUI {
    
    private static BDVeiculos bd = new BDVeiculos();
    
    // Telas
    private static JFrame janGestao; //Gestao de Veiculos
    private static JFrame janVp; //Tela Veiculos de Passeio
    private static JFrame janVc; //Tela Veiculos de Carga
    private static JFrame janCadVp; //Tela de Cadastro de Veiculos de Passeio
    private static JFrame janCadVc; //Tela de Cadastro de Veiculos de Carga
    private static JFrame janCEPVp; //Tela de Consultar e Excluir Veiculo de Passeio pela Placa
    private static JFrame janCEPVc; //Tela de Consultar e Excluir Veiculo de Carga pela Placa
    private static JFrame janIETVp; //Tela de Imprimir / Excluir Todos os Veiculos de Passeio
    private static JFrame janIETVc; //Tela de Imprimir / Excluir Todos os Veiculos de Carga
    private static JTable tableVp;
    private static JTable tableVc;
    private static DefaultTableModel tableModel;
    
    //Labels
    private static JLabel lbQtdPas;
    private static JLabel lbTara;
    private static JLabel lbCarMax;
    private static JLabel lbPlaca;
    private static JLabel lbMarca;
    private static JLabel lbModelo;
    private static JLabel lbCor;
    private static JLabel lbQtdRodas;
    private static JLabel lbVelocMax;
    private static JLabel lbQtdPist;
    private static JLabel lbPotencia;
    private static JLabel lbInfPlaca;
    
    //TextFields
    private static JTextField tfQtdPas;
    private static JTextField tfTara;
    private static JTextField tfCarMax;
    private static JTextField tfPlaca;
    private static JTextField tfMarca;
    private static JTextField tfModelo;
    private static JTextField tfCor;
    private static JTextField tfQtdRodas;
    private static JTextField tfVelocMax;
    private static JTextField tfQtdPist;
    private static JTextField tfPotencia;
    private static JTextField tfInfPlaca;
    
    //Botoes
    private static JButton btPasseio;
    private static JButton btCarga;
    private static JButton btCadastrarVp;
    private static JButton btCadastrarVc;
    private static JButton btCEVpPlaca;
    private static JButton btCEVcPlaca;
    private static JButton btIEVpTodos;
    private static JButton btIEVcTodos;
    private static JButton btSairVp;
    private static JButton btSairVc;
    private static JButton btCadP;
    private static JButton btLimparCadP;
    private static JButton btNovoCadP;
    private static JButton btSairCadP;
    private static JButton btCadC;
    private static JButton btLimparCadC;
    private static JButton btNovoCadC;
    private static JButton btSairCadC;
    private static JButton btConsVp;
    private static JButton btExcVp;
    private static JButton btSairConsVp;
    private static JButton btConsVc;
    private static JButton btExcVc;
    private static JButton btSairConsVc;
    private static JButton btITVp;
    private static JButton btETVp;
    private static JButton btSairIEVp;
    private static JButton btITVc;
    private static JButton btETVc;
    private static JButton btSairIEVc;
    
    
    public static void main(String[] args) {
        telaGestao();
        //createTableVp();
    }
    
    public static void telaGestao(){
          
        janGestao = new JFrame("Gestao de Veiculos");
        janGestao.setSize(400, 250);
        janGestao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janGestao.setLocationRelativeTo(null);
        
        janGestao.setLayout(null);
        
        btPasseio = new JButton ("Passeio");
        btPasseio.setBounds(120, 50, 150, 40);
        btPasseio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                telaVp();
            }
        });
        janGestao.add(btPasseio);
        
        btCarga = new JButton("Carga");
        btCarga.setBounds(120, 110, 150, 40);
        btCarga.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                telaVc();
            }
        });
        janGestao.add(btCarga);
        
        janGestao.setVisible(true);
        
    }
    
    public static void telaVp(){
          
        janVp = new JFrame("Veiculos de Passeio");
        janVp.setSize(450, 300);
        janVp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janVp.setLocationRelativeTo(null);
        
        janVp.setLayout(null);

        btCadastrarVp = new JButton ("Cadastrar");
        btCadastrarVp.setBounds(90, 30, 250, 35);
        btCadastrarVp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                    telaCadastroVp();
            }
        });
        janVp.add(btCadastrarVp);
        
        btCEVpPlaca = new JButton("Consultar / Excluir pela Placa");
        btCEVpPlaca.setBounds(90, 80, 250, 35);
        btCEVpPlaca.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                telaCEVp();
            }
        });
        janVp.add(btCEVpPlaca);
        
        btIEVpTodos = new JButton("Imprimir / Excluir Todos");
        btIEVpTodos.setBounds(90, 130, 250, 35);
        btIEVpTodos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                telaIETVp();
            }
        });
        janVp.add(btIEVpTodos);
        
        btSairVp = new JButton("Sair");
        btSairVp.setBounds(160, 190, 100, 35);
        btSairVp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janVp.dispose();
            }
        });
        janVp.add(btSairVp);
        
        janVp.setVisible(true);
        
    }
    
    public static void telaCadastroVp(){
        
        janCadVp = new JFrame ("Cadastro de Passeio");
        janCadVp.setSize(450, 420);
        janCadVp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janCadVp.setLocationRelativeTo(null);
        janCadVp.setLayout(null);
        
        //Labels
        lbPlaca = new JLabel("Placa: ");
        lbPlaca.setBounds(20, 20, 140, 25);
        
        lbMarca = new JLabel("Marca: ");
        lbMarca.setBounds(20, 50, 140, 25);
        
        lbModelo = new JLabel("Modelo: ");
        lbModelo.setBounds(20, 80, 140, 25);
        
        lbCor = new JLabel("Cor: ");
        lbCor.setBounds(20, 110, 140, 25);
        
        lbVelocMax = new JLabel("Velocidade Max: ");
        lbVelocMax.setBounds(20, 140, 140, 25);
        
        lbQtdRodas = new JLabel("Qtd. Rodas: ");
        lbQtdRodas.setBounds(20, 170, 140, 25);
        
        lbQtdPist = new JLabel("Qtd. Pistoes: ");
        lbQtdPist.setBounds(20, 200, 140, 25);
        
        lbPotencia = new JLabel("Potencia: ");
        lbPotencia.setBounds(20, 230, 140, 25);
        
        lbQtdPas = new JLabel("Qtd. Passageiros: ");
        lbQtdPas.setBounds(20, 260, 140, 25);
        
        janCadVp.add(lbPlaca);
        janCadVp.add(lbMarca);
        janCadVp.add(lbModelo);
        janCadVp.add(lbCor);
        janCadVp.add(lbVelocMax);
        janCadVp.add(lbQtdRodas);
        janCadVp.add(lbQtdPist);
        janCadVp.add(lbPotencia);
        janCadVp.add(lbQtdPas);
        
        //TextFields
        tfPlaca = new JTextField();
        tfPlaca.setBounds(160, 20, 180, 25);
        
        tfMarca = new JTextField();
        tfMarca.setBounds(160, 50, 180, 25);
        
        tfModelo = new JTextField();
        tfModelo.setBounds(160, 80, 180, 25);
        
        tfCor = new JTextField();
        tfCor.setBounds(160, 110, 180, 25);
        
        tfVelocMax = new JTextField();
        tfVelocMax.setBounds(160, 140, 180, 25);
        
        tfQtdRodas = new JTextField();
        tfQtdRodas.setBounds(160, 170, 180, 25);
        
        tfQtdPist = new JTextField();
        tfQtdPist.setBounds(160, 200, 180, 25);
        
        tfPotencia = new JTextField();
        tfPotencia.setBounds(160, 230, 180, 25);
        
        tfQtdPas = new JTextField();
        tfQtdPas.setBounds(160, 260, 180, 25);
        
        janCadVp.add(tfPlaca);
        janCadVp.add(tfMarca);
        janCadVp.add(tfModelo);
        janCadVp.add(tfCor);
        janCadVp.add(tfVelocMax);
        janCadVp.add(tfQtdRodas);
        janCadVp.add(tfQtdPist);
        janCadVp.add(tfPotencia);
        janCadVp.add(tfQtdPas);
        
        btCadP = new JButton("Cadastrar");
        btCadP.setBounds(20, 320, 100, 30);
        btCadP.addActionListener(e ->{
            try {
                // Coleta os dados e realiza as validações
                String placa = tfPlaca.getText();
                if (placaExiste(placa)) {
                    throw new VeicExistException("\n Ja existe um Veiculo com essa placa.");
                }
                String marca = tfMarca.getText();
                String modelo = tfModelo.getText();
                String cor = tfCor.getText();
                //Verifica se a Velocidade Maxima esta dentro dos padroes
                float velocMax;
                
                try {
                    velocMax = Float.parseFloat(tfVelocMax.getText());

                    //Lancando a Excecao
                    if (velocMax < 80 || velocMax > 110) {
                        throw new VelocException("\nA velocidade maxima esta fora dos limites brasileiros");
                    }
                } catch (VelocException ex) {
                    velocMax = 100f;
                    JOptionPane.showMessageDialog(janCadVp, "Velocidade Invalida.\n" + "Foi atribuido o valor de 100 Km/h para velocidade maxima do seu Veiculo de Passeio!.");
                }
                String qtdRodasInt = tfQtdRodas.getText();
                String qtdPistInt = tfQtdPist.getText();
                String potenciaInt = tfPotencia.getText();
                String qtdPasInt = tfQtdPas.getText();

                Passeio passeio = new Passeio(placa, marca, modelo, cor, velocMax, Integer.parseInt(qtdRodasInt), Integer.parseInt(qtdPistInt), Integer.parseInt(potenciaInt), Integer.parseInt(qtdPasInt));
                bd.getPasseio().add(passeio);
                JOptionPane.showMessageDialog(janCadVp, "Veiculo de Passeio cadastrado com sucesso!");

                //Atualiza a tabela
                updateTableVp();
                limparCamposVp(tfPlaca, tfMarca, tfModelo, tfCor, tfVelocMax, tfQtdRodas, tfQtdPist, tfPotencia, tfQtdPas);

                } catch (VeicExistException ex) {
                    JOptionPane.showMessageDialog(janCadVp, ex.getMessage());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(janCadVp,"Preencha os campos corretamente.");
                } 
            });
        janCadVp.add(btCadP);
        
        btLimparCadP = new JButton("Limpar");
        btLimparCadP.setBounds(130, 320, 90, 30);
        btLimparCadP.addActionListener(e -> {
            limparCamposVp(tfPlaca, tfMarca, tfModelo, tfCor, tfVelocMax, tfQtdRodas, tfQtdPist, tfPotencia, tfQtdPas);
        });
        janCadVp.add(btLimparCadP);
        
        btNovoCadP = new JButton("Novo");
        btNovoCadP.setBounds(230, 320, 90, 30);
        btNovoCadP.addActionListener(e -> {
            limparCamposVp(tfPlaca, tfMarca, tfModelo, tfCor, tfVelocMax, tfQtdRodas, tfQtdPist, tfPotencia, tfQtdPas);
        });
        janCadVp.add(btNovoCadP);
        
        btSairCadP = new JButton("Sair");
        btSairCadP.setBounds(330, 320, 80, 30);
        btSairCadP.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                janCadVp.dispose();
            }
        });
        janCadVp.add(btSairCadP);
        
        janCadVp.setVisible(true);
    }
    
    public static void limparCamposVp(JTextField tfPlaca, JTextField tfMarca, JTextField tfModelo, JTextField tfCor, JTextField tfVelocMax, JTextField tfQtdRodas, JTextField tfQtdPist, JTextField tfPotencia, JTextField tfQtdPas){
        
        tfPlaca.setText("");
        tfMarca.setText("");
        tfModelo.setText("");
        tfCor.setText("");
        tfVelocMax.setText("");
        tfQtdRodas.setText("");
        tfQtdPist.setText("");
        tfPotencia.setText("");
        tfQtdPas.setText("");
    }
    
    public static void telaCEVp(){
        
        janCEPVp = new JFrame("Consultar / Excluir pela Placa");
        janCEPVp.setSize(450, 420);
        janCEPVp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janCEPVp.setLocationRelativeTo(null);
        janCEPVp.setLayout(null);
        
        //Labels
        lbInfPlaca = new JLabel("Informe a placa");
        lbInfPlaca.setBounds(20, 40, 140, 25);
        
        lbMarca = new JLabel("Marca: ");
        lbMarca.setBounds(20, 70, 140, 25);
        
        lbModelo = new JLabel("Modelo: ");
        lbModelo.setBounds(20, 100, 140, 25);
        
        lbCor = new JLabel("Cor: ");
        lbCor.setBounds(20, 130, 140, 25);
        
        lbVelocMax = new JLabel("Velocidade Max: ");
        lbVelocMax.setBounds(20, 160, 140, 25);
        
        lbQtdRodas = new JLabel("Qtd. Rodas: ");
        lbQtdRodas.setBounds(20, 190, 140, 25);
        
        lbQtdPist = new JLabel("Qtd. Pistoes: ");
        lbQtdPist.setBounds(20, 220, 140, 25);
        
        lbPotencia = new JLabel("Potencia: ");
        lbPotencia.setBounds(20, 250, 140, 25);
        
        lbQtdPas = new JLabel("Qtd. Passageiros: ");
        lbQtdPas.setBounds(20, 280, 140, 25);
        
        janCEPVp.add(lbInfPlaca);
        janCEPVp.add(lbMarca);
        janCEPVp.add(lbModelo);
        janCEPVp.add(lbCor);
        janCEPVp.add(lbVelocMax);
        janCEPVp.add(lbQtdRodas);
        janCEPVp.add(lbQtdPist);
        janCEPVp.add(lbPotencia);
        janCEPVp.add(lbQtdPas);
        
        //TextFields
        tfInfPlaca = new JTextField();
        tfInfPlaca.setBounds(160, 40, 180, 25);
        
        tfMarca = new JTextField();
        tfMarca.setBounds(160, 70, 180, 25);
        
        tfModelo = new JTextField();
        tfModelo.setBounds(160, 100, 180, 25);
        
        tfCor = new JTextField();
        tfCor.setBounds(160, 130, 180, 25);
        
        tfVelocMax = new JTextField();
        tfVelocMax.setBounds(160, 160, 180, 25);
        
        tfQtdRodas = new JTextField();
        tfQtdRodas.setBounds(160, 190, 180, 25);
        
        tfQtdPist = new JTextField();
        tfQtdPist.setBounds(160, 220, 180, 25);
        
        tfPotencia = new JTextField();
        tfPotencia.setBounds(160, 250, 180, 25);
        
        tfQtdPas = new JTextField();
        tfQtdPas.setBounds(160, 280, 180, 25);
        
        janCEPVp.add(tfInfPlaca);
        janCEPVp.add(tfMarca);
        janCEPVp.add(tfModelo);
        janCEPVp.add(tfCor);
        janCEPVp.add(tfVelocMax);
        janCEPVp.add(tfQtdRodas);
        janCEPVp.add(tfQtdPist);
        janCEPVp.add(tfPotencia);
        janCEPVp.add(tfQtdPas);
        
        btConsVp = new JButton("Consultar");
        btConsVp.setBounds(20, 320, 100, 30);
        btConsVp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String placa = tfInfPlaca.getText();
                if (placa.isEmpty()){
                    JOptionPane.showMessageDialog(janCEPVp, "Informe uma placa!");
                    return;
                }
                
                Passeio passeio = buscarPlacaVp(placa);
                
                if (passeio != null) {
                    tfMarca.setText(passeio.getMarca());
                    tfModelo.setText(passeio.getModelo());
                    tfCor.setText(passeio.getCor());
                    tfVelocMax.setText(String.valueOf(passeio.getVelocMax()));
                    tfQtdRodas.setText(String.valueOf(passeio.getQtdRodas()));
                    tfQtdPist.setText(String.valueOf(passeio.getMotor().getQtdPist()));
                    tfPotencia.setText(String.valueOf(passeio.getMotor().getPotencia()));
                    tfQtdPas.setText(String.valueOf(passeio.getQtdPas()));
                } else {
                    JOptionPane.showMessageDialog(janCEPVp, "Veiculo nao encontrado!");
                }
            }
        });
        janCEPVp.add(btConsVp);
        
        btExcVp = new JButton("Excluir");
        btExcVp.setBounds(175, 320, 100, 30);
        btExcVp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String placa = tfInfPlaca.getText();
                if (placa.isEmpty()){
                    JOptionPane.showMessageDialog(janCEPVp, "Informe uma placa!");
                    return;
                }
                
                Passeio passeio = buscarPlacaVp(placa);
                
                if (passeio != null) {
                    
                    bd.getPasseio().remove(passeio);
                    
                    updateTableVp();
                    
                    tfInfPlaca.setText("");
                    tfMarca.setText("");
                    tfModelo.setText("");
                    tfCor.setText("");
                    tfVelocMax.setText("");
                    tfQtdRodas.setText("");
                    tfQtdPist.setText("");
                    tfPotencia.setText("");
                    tfQtdPas.setText("");
                    
                    JOptionPane.showMessageDialog(janCEPVp, "Veiculo excluido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(janCEPVp, "Veiculo nao encontrado!");
                }
            }
        });
        janCEPVp.add(btExcVp);
        
        btSairConsVp = new JButton("Sair");
        btSairConsVp.setBounds(330, 320, 80, 30);
        btSairConsVp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                janCEPVp.dispose();
            }
        });
        janCEPVp.add(btSairConsVp);
        
        janCEPVp.setVisible(true);
    }
    
    // Cria a JTable para mostrar os Vieculos de Passeio
    private static void createTableVp() {
        String[] columnNames = {"Placa", "Marca", "Modelo", "Cor", "Veloc Max", "Qtd. Rodas", "Qtd. Pist", "Potencia", "Qtd. Passag"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tableVp = new JTable(tableModel);
        tableVp.setFillsViewportHeight(true);
        tableVp.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane paneVp = new JScrollPane(tableVp);
        paneVp.setBounds(20, 20, 840, 280);
        janIETVp.add(paneVp);
    }
    
    private static void telaIETVp(){
        
        janIETVp = new JFrame("Imprimir / Excluir Todos");
        janIETVp.setSize(900, 450);
        janIETVp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janIETVp.setLocationRelativeTo(null);
        janIETVp.setLayout(null);
        
        createTableVp();
        
        btITVp = new JButton("Imprimir Todos");
        btITVp.setBounds(30, 350, 140, 30);
        btITVp.addActionListener(e ->{
            mostrarTodosVp();
        });
        janIETVp.add(btITVp);
        
        btETVp = new JButton("Excluir Todos");
        btETVp.setBounds(220, 350, 140, 30);
        btETVp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                //Verifica se existe Veiculo cadastrado
                if (bd.getPasseio().isEmpty()){
                    JOptionPane.showMessageDialog(janIETVp, "Nao ha veiculos cadastrados!");
                    return;
                }
                
                //Confirmacao antes de excluir
                int confir = JOptionPane.showConfirmDialog(janIETVp, "Deseja realmente excluir todos os veículos?", "Confirmação", JOptionPane.YES_NO_OPTION);
                
                if (confir == JOptionPane.YES_OPTION){
                    // Remove todos os veículos
                    bd.getPasseio().clear();

                    // Atualiza tabela
                    updateTableVp();

                    JOptionPane.showMessageDialog(janIETVp, "Todos os veículos foram excluídos!");
                }
            }
        });
        janIETVp.add(btETVp);
        
        btSairIEVp = new JButton("Sair");
        btSairIEVp.setBounds(780, 350, 80, 30);
        btSairIEVp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                janIETVp.dispose();
            }
        });
        janIETVp.add(btSairIEVp);
        
        janIETVp.setVisible(true);
    }
    
    // Mostra todos os Veiculos de Passeio na tabela
    private static void mostrarTodosVp() {
        if (bd.getPasseio().isEmpty()) {
            JOptionPane.showMessageDialog(janIETVp, "Não há veiculos cadastrados.");
            return;
        }

        updateTableVp();
    }
    
    //Retorna Veiculo de Paseio pela Placa, ou null se nao encontrado
    private static Passeio buscarPlacaVp(String placa){
        for(Passeio passeio : bd.getPasseio()){
            if (passeio.getPlaca().equalsIgnoreCase(placa))
                return passeio;
        }
        return null;
    }
    
    public static void telaVc(){
    
        janVc = new JFrame ("Veiculos de Carga");
        janVc.setSize(450,300);
        janVc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janVc.setLocationRelativeTo(null);
        janVc.setLayout(null);
        
        btCadastrarVc = new JButton ("Cadastrar");
        btCadastrarVc.setBounds(90, 30, 250, 35);
        btCadastrarVc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                telaCadastroVc();
            }
        });
        janVc.add(btCadastrarVc);
        
        btCEVcPlaca = new JButton ("Consultar / Excluir pela Placa");
        btCEVcPlaca.setBounds(90, 80, 250, 35);
        btCEVcPlaca.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                telaCEVc();
            }
        });
        janVc.add(btCEVcPlaca);
        
        btIEVcTodos = new JButton ("Imprimir / Excluir Todos");
        btIEVcTodos.setBounds(90, 130, 250, 35);
        btIEVcTodos.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                telaIETVc();
            }
        });
        janVc.add(btIEVcTodos);
        
        btSairVc = new JButton ("Sair");
        btSairVc.setBounds(160, 190, 100, 35);
        btSairVc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                janVc.dispose();
            }
        });
        janVc.add(btSairVc);
        
        janVc.setVisible(true);
        
    }
    
    public static void telaCadastroVc(){
        
        janCadVc = new JFrame ("Cadastro de Carga");
        janCadVc.setSize(450, 420);
        janCadVc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janCadVc.setLocationRelativeTo(null);
        janCadVc.setLayout(null);
        
        //Labels
        lbPlaca = new JLabel("Placa: ");
        lbPlaca.setBounds(20, 20, 140, 25);
        
        lbMarca = new JLabel("Marca: ");
        lbMarca.setBounds(20, 50, 140, 25);
        
        lbModelo = new JLabel("Modelo: ");
        lbModelo.setBounds(20, 80, 140, 25);
        
        lbCor = new JLabel("Cor: ");
        lbCor.setBounds(20, 110, 140, 25);
        
        lbVelocMax = new JLabel("Velocidade Max: ");
        lbVelocMax.setBounds(20, 140, 140, 25);
        
        lbQtdRodas = new JLabel("Qtd. Rodas: ");
        lbQtdRodas.setBounds(20, 170, 140, 25);
        
        lbQtdPist = new JLabel("Qtd. Pistoes: ");
        lbQtdPist.setBounds(20, 200, 140, 25);
        
        lbPotencia = new JLabel("Potencia: ");
        lbPotencia.setBounds(20, 230, 140, 25);
        
        lbCarMax = new JLabel("Carga Max: ");
        lbCarMax.setBounds(20, 260, 140, 25);
        
        lbTara = new JLabel("Tara: ");
        lbTara.setBounds(20, 290, 140, 25);
        
        janCadVc.add(lbPlaca);
        janCadVc.add(lbMarca);
        janCadVc.add(lbModelo);
        janCadVc.add(lbCor);
        janCadVc.add(lbVelocMax);
        janCadVc.add(lbQtdRodas);
        janCadVc.add(lbQtdPist);
        janCadVc.add(lbPotencia);
        janCadVc.add(lbCarMax);
        janCadVc.add(lbTara);
        
        //TextFields
        tfPlaca = new JTextField();
        tfPlaca.setBounds(160, 20, 180, 25);
        
        tfMarca = new JTextField();
        tfMarca.setBounds(160, 50, 180, 25);
        
        tfModelo = new JTextField();
        tfModelo.setBounds(160, 80, 180, 25);
        
        tfCor = new JTextField();
        tfCor.setBounds(160, 110, 180, 25);
        
        tfVelocMax = new JTextField();
        tfVelocMax.setBounds(160, 140, 180, 25);
        
        tfQtdRodas = new JTextField();
        tfQtdRodas.setBounds(160, 170, 180, 25);
        
        tfQtdPist = new JTextField();
        tfQtdPist.setBounds(160, 200, 180, 25);
        
        tfPotencia = new JTextField();
        tfPotencia.setBounds(160, 230, 180, 25);
        
        tfCarMax = new JTextField();
        tfCarMax.setBounds(160, 260, 180, 25);
        
        tfTara = new JTextField();
        tfTara.setBounds(160, 290, 180, 25);
        
        janCadVc.add(tfPlaca);
        janCadVc.add(tfMarca);
        janCadVc.add(tfModelo);
        janCadVc.add(tfCor);
        janCadVc.add(tfVelocMax);
        janCadVc.add(tfQtdRodas);
        janCadVc.add(tfQtdPist);
        janCadVc.add(tfPotencia);
        janCadVc.add(tfCarMax);
        janCadVc.add(tfTara);
        
        btCadC = new JButton("Cadastrar");
        btCadC.setBounds(20, 330, 100, 30);
        btCadC.addActionListener(e ->{
            try {
                // Coleta os dados e realiza as validações
                String placa = tfPlaca.getText();
                if (placaExiste(placa)) {
                    throw new VeicExistException("\n Ja existe um Veiculo com essa placa.");
                }
                String marca = tfMarca.getText();
                String modelo = tfModelo.getText();
                String cor = tfCor.getText();
                //Verifica se a Velocidade Maxima esta dentro dos padroes
                float velocMax;
                
                try {
                    velocMax = Float.parseFloat(tfVelocMax.getText());

                    //Lancando a Excecao
                    if (velocMax < 80 || velocMax > 110) {
                        throw new VelocException("\nA velocidade maxima esta fora dos limites brasileiros");
                    }
                } catch (VelocException ex) {
                    velocMax = 90f;
                    JOptionPane.showMessageDialog(janCadVp, "Velocidade Invalida.\n" + "Foi atribuido o valor de 90 Km/h para velocidade maxima do seu Veiculo de Carga!.");
                }
                String qtdRodasInt = tfQtdRodas.getText();
                String qtdPistInt = tfQtdPist.getText();
                String potenciaInt = tfPotencia.getText();
                String cargaMax = tfCarMax.getText();
                String tara = tfTara.getText();

                Carga carga = new Carga(placa, marca, modelo, cor, velocMax, Integer.parseInt(qtdRodasInt), Integer.parseInt(qtdPistInt), Integer.parseInt(potenciaInt), Integer.parseInt(cargaMax), Integer.parseInt(tara));
                bd.getCarga().add(carga);
                JOptionPane.showMessageDialog(janCadVc, "Veiculo de Carga cadastrado com sucesso!");

                //Atualiza a tabela
                updateTableVp();
                limparCamposVc(tfPlaca, tfMarca, tfModelo, tfCor, tfVelocMax, tfQtdRodas, tfQtdPist, tfPotencia, tfCarMax, tfTara);

                } catch (VeicExistException ex) {
                    JOptionPane.showMessageDialog(janCadVc, ex.getMessage());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(janCadVc,"Preencha os campos corretamente.");
                } 
            });
        janCadVc.add(btCadC);
        
        btLimparCadC = new JButton("Limpar");
        btLimparCadC.setBounds(130, 330, 90, 30);
        btLimparCadC.addActionListener(e -> {
            limparCamposVc(tfPlaca, tfMarca, tfModelo, tfCor, tfVelocMax, tfQtdRodas, tfQtdPist, tfPotencia, tfCarMax, tfTara);
        });
        janCadVc.add(btLimparCadC);
        
        btNovoCadC = new JButton("Novo");
        btNovoCadC.setBounds(230, 330, 90, 30);
        btNovoCadC.addActionListener(e -> {
            limparCamposVc(tfPlaca, tfMarca, tfModelo, tfCor, tfVelocMax, tfQtdRodas, tfQtdPist, tfPotencia, tfCarMax, tfTara);
        });
        janCadVc.add(btNovoCadC);
        
        btSairCadC = new JButton("Sair");
        btSairCadC.setBounds(330, 330, 80, 30);
        btSairCadC.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                janCadVc.dispose();
            }
        });
        janCadVc.add(btSairCadC);
        
        janCadVc.setVisible(true);
    }
    
    public static void limparCamposVc(JTextField tfPlaca, JTextField tfMarca, JTextField tfModelo, JTextField tfCor, JTextField tfVelocMax, JTextField tfQtdRodas, JTextField tfQtdPist, JTextField tfPotencia, JTextField tfCarMax, JTextField tfTara){
        
        tfPlaca.setText("");
        tfMarca.setText("");
        tfModelo.setText("");
        tfCor.setText("");
        tfVelocMax.setText("");
        tfQtdRodas.setText("");
        tfQtdPist.setText("");
        tfPotencia.setText("");
        tfCarMax.setText("");
        tfTara.setText("");
    }
    
    public static void telaCEVc(){
    
        janCEPVc = new JFrame("Consultar / Excluir pela Placa");
        janCEPVc.setSize(450, 420);
        janCEPVc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janCEPVc.setLocationRelativeTo(null);
        janCEPVc.setLayout(null);
        
        //Labels
        lbInfPlaca = new JLabel("Informe a placa");
        lbInfPlaca.setBounds(20, 20, 140, 25);
        
        lbMarca = new JLabel("Marca: ");
        lbMarca.setBounds(20, 50, 140, 25);
        
        lbModelo = new JLabel("Modelo: ");
        lbModelo.setBounds(20, 80, 140, 25);
        
        lbCor = new JLabel("Cor: ");
        lbCor.setBounds(20, 110, 140, 25);
        
        lbVelocMax = new JLabel("Velocidade Max: ");
        lbVelocMax.setBounds(20, 140, 140, 25);
        
        lbQtdRodas = new JLabel("Qtd. Rodas: ");
        lbQtdRodas.setBounds(20, 170, 140, 25);
        
        lbQtdPist = new JLabel("Qtd. Pistoes: ");
        lbQtdPist.setBounds(20, 200, 140, 25);
        
        lbPotencia = new JLabel("Potencia: ");
        lbPotencia.setBounds(20, 230, 140, 25);
        
        lbCarMax = new JLabel("Carga Max: ");
        lbCarMax.setBounds(20, 260, 140, 25);
        
        lbTara = new JLabel("Tara: ");
        lbTara.setBounds(20, 290, 140, 25);
        
        janCEPVc.add(lbInfPlaca);
        janCEPVc.add(lbMarca);
        janCEPVc.add(lbModelo);
        janCEPVc.add(lbCor);
        janCEPVc.add(lbVelocMax);
        janCEPVc.add(lbQtdRodas);
        janCEPVc.add(lbQtdPist);
        janCEPVc.add(lbPotencia);
        janCEPVc.add(lbCarMax);
        janCEPVc.add(lbTara);
        
        //TextFields
        tfInfPlaca = new JTextField();
        tfInfPlaca.setBounds(160, 20, 180, 25);
        
        tfMarca = new JTextField();
        tfMarca.setBounds(160, 50, 180, 25);
        
        tfModelo = new JTextField();
        tfModelo.setBounds(160, 80, 180, 25);
        
        tfCor = new JTextField();
        tfCor.setBounds(160, 110, 180, 25);
        
        tfVelocMax = new JTextField();
        tfVelocMax.setBounds(160, 140, 180, 25);
        
        tfQtdRodas = new JTextField();
        tfQtdRodas.setBounds(160, 170, 180, 25);
        
        tfQtdPist = new JTextField();
        tfQtdPist.setBounds(160, 200, 180, 25);
        
        tfPotencia = new JTextField();
        tfPotencia.setBounds(160, 230, 180, 25);
        
        tfCarMax = new JTextField();
        tfCarMax.setBounds(160, 260, 180, 25);
        
        tfTara = new JTextField();
        tfTara.setBounds(160, 290, 180, 25);
        
        janCEPVc.add(tfInfPlaca);
        janCEPVc.add(tfMarca);
        janCEPVc.add(tfModelo);
        janCEPVc.add(tfCor);
        janCEPVc.add(tfVelocMax);
        janCEPVc.add(tfQtdRodas);
        janCEPVc.add(tfQtdPist);
        janCEPVc.add(tfPotencia);
        janCEPVc.add(tfCarMax);
        janCEPVc.add(tfTara);
        
        btConsVc = new JButton("Consultar");
        btConsVc.setBounds(20, 320, 100, 30);
        btConsVc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String placa = tfInfPlaca.getText();
                if (placa.isEmpty()){
                    JOptionPane.showMessageDialog(janCEPVc, "Informe uma placa!");
                    return;
                }
                
                Carga carga = buscarPlacaVc(placa);
                
                if (carga != null) {
                    tfMarca.setText(carga.getMarca());
                    tfModelo.setText(carga.getModelo());
                    tfCor.setText(carga.getCor());
                    tfVelocMax.setText(String.valueOf(carga.getVelocMax()));
                    tfQtdRodas.setText(String.valueOf(carga.getQtdRodas()));
                    tfQtdPist.setText(String.valueOf(carga.getMotor().getQtdPist()));
                    tfPotencia.setText(String.valueOf(carga.getMotor().getPotencia()));
                    tfCarMax.setText(String.valueOf(carga.getCargaMax()));
                    tfTara.setText(String.valueOf(carga.getTara()));
                } else {
                    JOptionPane.showMessageDialog(janCEPVc, "Veiculo nao encontrado!");
                }
            }
        });
        janCEPVc.add(btConsVc);
        
        btExcVc = new JButton("Excluir");
        btExcVc.setBounds(175, 320, 100, 30);
        btExcVc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String placa = tfInfPlaca.getText();
                if (placa.isEmpty()){
                    JOptionPane.showMessageDialog(janCEPVc, "Informe uma placa!");
                    return;
                }
                
                Carga carga = buscarPlacaVc(placa);
                
                if (carga != null) {
                    
                    bd.getCarga().remove(carga);
                    
                    updateTableVc();
                    
                    tfInfPlaca.setText("");
                    tfMarca.setText("");
                    tfModelo.setText("");
                    tfCor.setText("");
                    tfVelocMax.setText("");
                    tfQtdRodas.setText("");
                    tfQtdPist.setText("");
                    tfPotencia.setText("");
                    tfCarMax.setText("");
                    tfTara.setText("");
                    
                    JOptionPane.showMessageDialog(janCEPVc, "Veiculo excluido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(janCEPVc, "Veiculo nao encontrado!");
                }
            }
        });
        janCEPVc.add(btExcVc);
        
        btSairConsVc = new JButton("Sair");
        btSairConsVc.setBounds(330, 320, 80, 30);
        btSairConsVc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                janCEPVc.dispose();
            }
        });
        janCEPVc.add(btSairConsVc);
        
        janCEPVc.setVisible(true);
    }
    
    // Cria a JTable para mostrar os Vieculos de Passeio
    private static void createTableVc() {
        String[] columnNames = {"Placa", "Marca", "Modelo", "Cor", "Veloc Max", "Qtd. Rodas", "Qtd. Pist", "Potencia", "Carga Max", "Tara"};
        tableModel = new DefaultTableModel(columnNames, 0);
        tableVc = new JTable(tableModel);
        tableVc.setFillsViewportHeight(true);
        tableVc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane paneVc = new JScrollPane(tableVc);
        paneVc.setBounds(20, 20, 840, 280);
        janIETVc.add(paneVc);
    }
    
    public static void telaIETVc(){
        janIETVc = new JFrame("Imprimir / Excluir Todos");
        janIETVc.setSize(900, 450);
        janIETVc.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janIETVc.setLocationRelativeTo(null);
        janIETVc.setLayout(null);
        
        createTableVc();
        
        btITVc = new JButton("Imprimir Todos");
        btITVc.setBounds(30, 350, 140, 30);
        btITVc.addActionListener(e ->{
            mostrarTodosVc();
        });
        janIETVc.add(btITVc);
        
        btETVc = new JButton("Excluir Todos");
        btETVc.setBounds(220, 350, 140, 30);
        btETVc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                //Verifica se existe Veiculo cadastrado
                if (bd.getCarga().isEmpty()){
                    JOptionPane.showMessageDialog(janIETVc, "Nao ha veiculos cadastrados!");
                    return;
                }
                
                //Confirmacao antes de excluir
                int confir = JOptionPane.showConfirmDialog(janIETVc, "Deseja realmente excluir todos os veículos?", "Confirmação", JOptionPane.YES_NO_OPTION);
                
                if (confir == JOptionPane.YES_OPTION){
                    // Remove todos os veículos
                    bd.getCarga().clear();

                    // Atualiza tabela
                    updateTableVc();

                    JOptionPane.showMessageDialog(janIETVc, "Todos os veículos foram excluídos!");
                }
            }
        });
        janIETVc.add(btETVc);
        
        btSairIEVc = new JButton("Sair");
        btSairIEVc.setBounds(780, 350, 80, 30);
        btSairIEVc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                janIETVc.dispose();
            }
        });
        janIETVc.add(btSairIEVc);
        
        janIETVc.setVisible(true);
    }
    
    // Mostra todos os Veiculos de Carga na tabela
    private static void mostrarTodosVc() {
        if (bd.getCarga().isEmpty()) {
            JOptionPane.showMessageDialog(janIETVc, "Não há veiculos cadastrados.");
            return;
        }

        updateTableVc();
    }
    
    //Retorna Veiculo de Carga pela Placa, ou null se nao encontrado
    private static Carga buscarPlacaVc(String placa){
        for(Carga carga : bd.getCarga()){
            if (carga.getPlaca().equalsIgnoreCase(placa))
                return carga;
        }
        return null;
    }
    
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
    
    // Atualiza a JTable com os dados mais recentes
    private static void updateTableVp() {
        
        // verifica se a tabela foi criada
        if (tableModel == null) {
            return;
        }
        
        // Limpa os dados atuais da tabela
        tableModel.setRowCount(0);
        //Passeio
        for (Passeio passeio : bd.getPasseio()) {
            
            String[] passeioData = {
                    
                    passeio.getPlaca(),
                    passeio.getMarca(),
                    passeio.getModelo(),
                    passeio.getCor(),
                    String.valueOf(passeio.getVelocMax()),
                    String.valueOf(passeio.getQtdRodas()),
                    String.valueOf(passeio.getMotor().getQtdPist()),
                    String.valueOf(passeio.getMotor().getPotencia()),
                    String.valueOf(passeio.getQtdPas())
            };
            tableModel.addRow(passeioData);
        }
    }
    
    private static void updateTableVc() {
        
        // verifica se a tabela foi criada
        if (tableModel == null) {
            return;
        }
        
        // Limpa os dados atuais da tabela
        tableModel.setRowCount(0);
        //Carga
        for (Carga carga : bd.getCarga()) {
            
            String[] cargaData = {
                    
                    carga.getPlaca(),
                    carga.getMarca(),
                    carga.getModelo(),
                    carga.getCor(),
                    String.valueOf(carga.getVelocMax()),
                    String.valueOf(carga.getQtdRodas()),
                    String.valueOf(carga.getMotor().getQtdPist()),
                    String.valueOf(carga.getMotor().getPotencia()),
                    String.valueOf(carga.getCargaMax()),
                    String.valueOf(carga.getTara())
            };
            tableModel.addRow(cargaData);
        }
    }
    
}

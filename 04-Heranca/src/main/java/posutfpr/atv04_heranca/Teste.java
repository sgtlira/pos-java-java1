/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posutfpr.atv04_heranca;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 *
 * @author guigu
 */
public abstract class Teste {
    
    public static void main (String arg[]){
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR"));
        DecimalFormat df = new DecimalFormat("#,##0.00", symbols);
        DecimalFormat df1 = new DecimalFormat("###,##0.00", symbols);
        
        Passeio p = new Passeio();
        p.setCor("Azul");
        p.setMarca("VW");
        p.setModelo("GOL");
        p.setPlaca("ABC1234");
        p.setQtdRodas(4);
        p.setVelocMax(160f);
        p.getMotor().setPotencia(107);
        p.getMotor().setQtdPist(3);
        p.setQtdPas(4);
        
        Carga c = new Carga();
        c.setCor("Branco");
        c.setMarca("Iveco");
        c.setModelo("Daily");
        c.setPlaca("CBA1234");
        c.setQtdRodas(4);
        c.setVelocMax(140f);
        c.getMotor().setPotencia(140);
        c.getMotor().setQtdPist(4);
        c.setCargaMax(2500);
        c.setTara(2050);
        
        System.out.println("\n\nVeiculo de Passeio (VP) e Veiculo de Carga (VC)");
        System.out.println("\n***************************************");
        System.out.println("\n Dados do VP1: ");
        System.out.println("\n***************************************");
        System.out.println("\n Cor do VP1.................: " + p.getCor());
        System.out.println("\n Marca do VP1...............: " + p.getMarca());
        System.out.println("\n Modelo do VP1..............: " + p.getModelo());
        System.out.println("\n Placa do VP1...............: " + p.getPlaca());
        System.out.println("\n Qtn de Rodas do VP1........: " + p.getQtdRodas());
        //System.out.println("\n Veloc Max do VP1 em km/h...: " + p.getVelocMax());
        System.out.printf("\n Veloc Max do VP1 em km/h...: %,.2f%n", p.getVelocMax());
        System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VP1 em m/h....: %,.2f%n", p.calcVel(0));
        //System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VP1 em m/h...: %,.2f%n", vp1);
        System.out.println("\n Potencia do VP1............: " + p.getMotor().getPotencia() + " cv");
        System.out.println("\n Qtd Pistoes do VP1.........: " + p.getMotor().getQtdPist());
        System.out.println("\n Qtd de Passageiros do VP1..: " + p.getQtdPas());
        
        System.out.println("\n***************************************");
        System.out.println("\n Dados do VC1");
        System.out.println("\n***************************************");
        System.out.println("\n Cor do VC1................: " + c.getCor());
        System.out.println("\n Marca do VC1..............: " + c.getMarca());
        System.out.println("\n Modelo do VC1.............: " + c.getModelo());
        System.out.println("\n Placa do VC1..............: " + c.getPlaca());
        System.out.println("\n Qtn de Rodas do VC1.......: " + c.getQtdRodas());
        //System.out.println("\n Veloc Max do VC1 em km/h..: " + c.getVelocMax());
        System.out.printf("\n Veloc Max do VC1 em km/h..: %,.2f%n", c.getVelocMax());
        System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VC1 em m/h...: %,.2f%n", c.calcVel(0));
        //System.out.println("\n Veloc Max do VC1 em cm/h..: " + c.calcVel());
        //System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VC1 em cm/h...: %,.2f%n", vc1);
        System.out.println("\n Potencia do VC1...........: " + c.getMotor().getPotencia() + " cv");
        System.out.println("\n Qtd Pistoes do VC1........: " + c.getMotor().getQtdPist());
        System.out.println("\n Carga Maxima do VC1.......: " + c.getCargaMax() + " kg");
        System.out.println("\n Tara do VC1...............: " + c.getTara() + " kg");
        
        Passeio p2 = new Passeio();
        p2.setCor("Laranja");
        p2.setMarca("Porche");
        p2.setModelo("911");
        p2.setPlaca("ABC4321");
        p2.setQtdRodas(4);
        p2.setVelocMax(300f);
        p2.getMotor().setPotencia(400);
        p2.getMotor().setQtdPist(16);
        p2.setQtdPas(1);
        
        Carga c2 = new Carga();
        c2.setCor("Preto");
        c2.setMarca("Volkswagen");
        c2.setModelo("Delivery 6.160");
        c2.setPlaca("CBA4321");
        c2.setQtdRodas(6);
        c2.setVelocMax(120f);
        c2.getMotor().setPotencia(160);
        c2.getMotor().setQtdPist(4);
        c2.setCargaMax(3500);
        c2.setTara(3000);
        
        System.out.println("\n***************************************");
        System.out.println("\n Dados do VP2: ");
        System.out.println("\n***************************************");
        System.out.println("\n Cor do VP2.................: " + p2.getCor());
        System.out.println("\n Marca do VP2...............: " + p2.getMarca());
        System.out.println("\n Modelo do VP2..............: " + p2.getModelo());
        System.out.println("\n Placa do VP2...............: " + p2.getPlaca());
        System.out.println("\n Qtn de Rodas do VP2........: " + p2.getQtdRodas());
        //System.out.println("\n Veloc Max do VP2 em km/h...: " + p2.getVelocMax());
        System.out.printf("\n Veloc Max do VP2 em km/h...: %,.2f%n", p2.getVelocMax());
        System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VP2 em m/h....: %,.2f%n", p2.calcVel(0));
        //System.out.println("\n Veloc Max do VP2 em m/h....: " + p2.calcVel());
        //System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VP2 em m/h...: %,.2f%n", vp2);
        System.out.println("\n Potencia do VP2............: " + p2.getMotor().getPotencia() + " cv");
        System.out.println("\n Qtd Pistoes do VP2.........: " + p2.getMotor().getQtdPist());
        System.out.println("\n Qtd de Passageiros do VP2..: " + p2.getQtdPas());
        
        System.out.println("\n***************************************");
        System.out.println("\n Dados do VC2");
        System.out.println("\n***************************************");
        System.out.println("\n Cor do VC2................: " + c2.getCor());
        System.out.println("\n Marca do VC2..............: " + c2.getMarca());
        System.out.println("\n Modelo do VC2.............: " + c2.getModelo());
        System.out.println("\n Placa do VC2..............: " + c2.getPlaca());
        System.out.println("\n Qtn de Rodas do VC2.......: " + c2.getQtdRodas());
        //System.out.println("\n Veloc Max do VC2 em km/h..: " + c2.getVelocMax());
        System.out.printf("\n Veloc Max do VC2 em km/h..: %,.2f%n", c2.getVelocMax());
        System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VC2 em m/h...: %,.2f%n", c2.calcVel(0));
        //System.out.println("\n Veloc Max do VC2 em cm/h..: " + c2.calcVel());
        //System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VC2 em cm/h...: %,.2f%n", vc2);
        System.out.println("\n Potencia do VC2...........: " + c2.getMotor().getPotencia() + " cv");
        System.out.println("\n Qtd Pistoes do VC2........: " + c2.getMotor().getQtdPist());
        System.out.println("\n Carga Maxima do VC2.......: " + c2.getCargaMax() + " kg");
        System.out.println("\n Tara do VC2...............: " + c2.getTara() + " kg");
        
        Passeio p3 = new Passeio();
        p3.setCor("Prata");
        p3.setMarca("Ford");
        p3.setModelo("Fiesta");
        p3.setPlaca("QWE4321");
        p3.setQtdRodas(4);
        p3.setVelocMax(190f);
        p3.getMotor().setPotencia(170);
        p3.getMotor().setQtdPist(3);
        p3.setQtdPas(4);
        
        Carga c3 = new Carga();
        c3.setCor("Roxo");
        c3.setMarca("Mercedes");
        c3.setModelo("Atego 1419");
        c3.setPlaca("CBA1234");
        c3.setQtdRodas(6);
        c3.setVelocMax(110f);
        c3.getMotor().setPotencia(185);
        c3.getMotor().setQtdPist(6);
        c3.setCargaMax(8000);
        c3.setTara(6000);
        
        System.out.println("\n***************************************");
        System.out.println("\n Dados do VP3: ");
        System.out.println("\n***************************************");
        System.out.println("\n Cor do VP3.................: " + p3.getCor());
        System.out.println("\n Marca do VP3...............: " + p3.getMarca());
        System.out.println("\n Modelo do VP3..............: " + p3.getModelo());
        System.out.println("\n Placa do VP3...............: " + p3.getPlaca());
        System.out.println("\n Qtn de Rodas do VP3........: " + p3.getQtdRodas());
        //System.out.println("\n Veloc Max do VP3 em km/h...: " + p3.getVelocMax());
        System.out.printf("\n Veloc Max do VP3 em km/h...: %,.2f%n", p3.getVelocMax());
        System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VP3 em m/h....: %,.2f%n", p3.calcVel(0));
        //System.out.println("\n Veloc Max do VP3 em m/h....: " + p3.calcVel());
        //System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VP3 em m/h...: %,.2f%n", vp3);
        System.out.println("\n Potencia do VP3............: " + p3.getMotor().getPotencia() + " cv");
        System.out.println("\n Qtd Pistoes do VP3.........: " + p3.getMotor().getQtdPist());
        System.out.println("\n Qtd de Passageiros do VP3..: " + p3.getQtdPas());
        
        System.out.println("\n***************************************");
        System.out.println("\n Dados do VC3");
        System.out.println("\n***************************************");
        System.out.println("\n Cor do VC3................: " + c3.getCor());
        System.out.println("\n Marca do VC3..............: " + c3.getMarca());
        System.out.println("\n Modelo do VC3.............: " + c3.getModelo());
        System.out.println("\n Placa do VC3..............: " + c3.getPlaca());
        System.out.println("\n Qtn de Rodas do VC3.......: " + c3.getQtdRodas());
        //System.out.println("\n Veloc Max do VC3 em km/h..: " + c3.getVelocMax());
        System.out.printf("\n Veloc Max do VC3 em km/h..: %,.2f%n", c3.getVelocMax());
        System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VC3 em m/h...: %,.2f%n", c3.calcVel(0));
        //System.out.println("\n Veloc Max do VC3 em cm/h..: " + c3.calcVel());
        //System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VC3 em cm/h...: %,.2f%n", vc3);
        System.out.println("\n Potencia do VC3...........: " + c3.getMotor().getPotencia() + " cv");
        System.out.println("\n Qtd Pistoes do VC3........: " + c3.getMotor().getQtdPist());
        System.out.println("\n Carga Maxima do VC3.......: " + c3.getCargaMax() + " kg");
        System.out.println("\n Tara do VC3...............: " + c3.getTara() + " kg");
        
        Passeio p4 = new Passeio();
        p4.setCor("Vermelho");
        p4.setMarca("VW");
        p4.setModelo("TCross");
        p4.setPlaca("ASD4321");
        p4.setQtdRodas(4);
        p4.setVelocMax(192f);
        p4.getMotor().setPotencia(150);
        p4.getMotor().setQtdPist(7);
        p4.setQtdPas(4);
        
        Carga c4 = new Carga();
        c4.setCor("Amarelo");
        c4.setMarca("Volvo");
        c4.setModelo("VM 270");
        c4.setPlaca("ASD1234");
        c4.setQtdRodas(10);
        c4.setVelocMax(120f);
        c4.getMotor().setPotencia(270);
        c4.getMotor().setQtdPist(6);
        c4.setCargaMax(14000);
        c4.setTara(9000);
        
        System.out.println("\n***************************************");
        System.out.println("\n Dados do VP4: ");
        System.out.println("\n***************************************");
        System.out.println("\n Cor do VP4.................: " + p4.getCor());
        System.out.println("\n Marca do VP4...............: " + p4.getMarca());
        System.out.println("\n Modelo do VP4..............: " + p4.getModelo());
        System.out.println("\n Placa do VP4...............: " + p4.getPlaca());
        System.out.println("\n Qtn de Rodas do VP4........: " + p4.getQtdRodas());
        //System.out.println("\n Veloc Max do VP4 em km/h...: " + p4.getVelocMax());
        System.out.printf("\n Veloc Max do VP4 em km/h...: %,.2f%n", p4.getVelocMax());
        System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VP4 em m/h....: %,.2f%n", p4.calcVel(0));
        //System.out.println("\n Veloc Max do VP4 em m/h....: " + p4.calcVel());
        //System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VP4 em m/h...: %,.2f%n", vp4);
        System.out.println("\n Potencia do VP4............: " + p4.getMotor().getPotencia() + " cv");
        System.out.println("\n Qtd Pistoes do VP4.........: " + p4.getMotor().getQtdPist());
        System.out.println("\n Qtd de Passageiros do VP4..: " + p4.getQtdPas());
        
        System.out.println("\n***************************************");
        System.out.println("\n Dados do VC4");
        System.out.println("\n***************************************");
        System.out.println("\n Cor do VC4................: " + c4.getCor());
        System.out.println("\n Marca do VC4..............: " + c4.getMarca());
        System.out.println("\n Modelo do VC4.............: " + c4.getModelo());
        System.out.println("\n Placa do VC4..............: " + c4.getPlaca());
        System.out.println("\n Qtn de Rodas do VC4.......: " + c4.getQtdRodas());
        //System.out.println("\n Veloc Max do VC4 em km/h..: " + c4.getVelocMax());
        System.out.printf("\n Veloc Max do VC4 em km/h..: %,.2f%n", c4.getVelocMax());
        System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VC4 em m/h...: %,.2f%n", c4.calcVel(0));
        //System.out.println("\n Veloc Max do VC4 em cm/h..: " + c4.calcVel());
        //System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VC4 em cm/h...: %,.2f%n", vc4);
        System.out.println("\n Potencia do VC4...........: " + c4.getMotor().getPotencia() + " cv");
        System.out.println("\n Qtd Pistoes do VC4........: " + c4.getMotor().getQtdPist());
        System.out.println("\n Carga Maxima do VC4.......: " + c4.getCargaMax() + " kg");
        System.out.println("\n Tara do VC4...............: " + c4.getTara() + " kg");
        
        Passeio p5 = new Passeio();
        p5.setCor("Cinza");
        p5.setMarca("Chevrolet");
        p5.setModelo("Trailblazer");
        p5.setPlaca("ASD0987");
        p5.setQtdRodas(4);
        p5.setVelocMax(198f);
        p5.getMotor().setPotencia(207);
        p5.getMotor().setQtdPist(8);
        p5.setQtdPas(6);
        
        Carga c5 = new Carga();
        c5.setCor("Verde");
        c5.setMarca("Scania");
        c5.setModelo("R 450");
        c5.setPlaca("ASD8907");
        c5.setQtdRodas(10);
        c5.setVelocMax(120f);
        c5.getMotor().setPotencia(450);
        c5.getMotor().setQtdPist(6);
        c5.setCargaMax(30000);
        c5.setTara(15000);
        
        System.out.println("\n***************************************");
        System.out.println("\n Dados do VP5: ");
        System.out.println("\n***************************************");
        System.out.println("\n Cor do VP5.................: " + p5.getCor());
        System.out.println("\n Marca do VP5...............: " + p5.getMarca());
        System.out.println("\n Modelo do VP5..............: " + p5.getModelo());
        System.out.println("\n Placa do VP5...............: " + p5.getPlaca());
        System.out.println("\n Qtn de Rodas do VP5........: " + p5.getQtdRodas());
        //System.out.println("\n Veloc Max do VP5 em km/h...: " + p5.getVelocMax());
        System.out.printf("\n Veloc Max do VP5 em km/h...: %,.2f%n", p5.getVelocMax());
        System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VP5 em m/h....: %,.2f%n", c5.calcVel(0));
        //System.out.println("\n Veloc Max do VP5 em m/h....: " + p5.calcVel());
        //System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VP5 em m/h...: %,.2f%n", vp5);
        System.out.println("\n Potencia do VP5............: " + p5.getMotor().getPotencia() + " cv");
        System.out.println("\n Qtd Pistoes do VP5.........: " + p5.getMotor().getQtdPist());
        System.out.println("\n Qtd de Passageiros do VP5..: " + p5.getQtdPas());
        
        System.out.println("\n***************************************");
        System.out.println("\n Dados do VC5");
        System.out.println("\n***************************************");
        System.out.println("\n Cor do VC5................: " + c5.getCor());
        System.out.println("\n Marca do VC5..............: " + c5.getMarca());
        System.out.println("\n Modelo do VC5.............: " + c5.getModelo());
        System.out.println("\n Placa do VC5..............: " + c5.getPlaca());
        System.out.println("\n Qtn de Rodas do VC5.......: " + c5.getQtdRodas());
        //System.out.println("\n Veloc Max do VC5 em km/h..: " + c5.getVelocMax());
        System.out.printf("\n Veloc Max do VC5 em km/h..: %,.2f%n", c5.getVelocMax());
        System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VC5 em m/h...: %,.2f%n", c5.calcVel(0));
        //System.out.println("\n Veloc Max do VC5 em cm/h..: " + c5.calcVel());
        //System.out.printf(new Locale("pt", "BR"), "\n Veloc Max do VC5 em cm/h...: %,.2f%n", vc5);
        System.out.println("\n Potencia do VC5...........: " + c5.getMotor().getPotencia() + " cv");
        System.out.println("\n Qtd Pistoes do VC5........: " + c5.getMotor().getQtdPist());
        System.out.println("\n Carga Maxima do VC5.......: " + c5.getCargaMax() + " kg");
        System.out.println("\n Tara do VC5...............: " + c5.getTara() + " kg");
        
    }   
}


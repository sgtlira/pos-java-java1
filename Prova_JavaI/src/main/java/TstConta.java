//GUILHERME CORREIA LIRA DE SOUZA


public class TstConta {

    public static void main(String[] args) {
        
        PessoaJuridica pj1 = new PessoaJuridica();
        
        //Entrada de Dados
        try {
            pj1.setNumeroConta(-15);
        } catch (NumException ex) {
            ex.impMsg();
        }
        pj1.setCnpj(10);
        pj1.getEnder().setRua("Avenida Paulista");
        pj1.getResponsavel().setCpf(8);
        pj1.getResponsavel().setNome("Guilherme Correia Lira de Souza");
        
        //Saida de Dados
        System.out.println("\nSaida de Dados");
        System.out.println("**********************************");
        System.out.println("\nNumero da Conta: " + pj1.getNumeroConta());
        pj1.validar();
        System.out.println("\nCNPJ: " + pj1.getCnpj());
        System.out.println("\nRua: " + pj1.getEnder().getRua());
        System.out.println("\nCPF do Responsavel pela Conta: " + pj1.getResponsavel().getCpf());
        pj1.getResponsavel().verifDoc();
        System.out.println("\nNome do Responsavel pela Conta: " + pj1.getResponsavel().getNome());
        pj1.verifDoc();
    }
}

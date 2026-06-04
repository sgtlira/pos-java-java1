//GUILHERME CORREIA LIRA DE SOUZA


public abstract class ClienteBanco implements Verifica {
    
    private int numeroConta = 0;
    private String nome = "";
    private Endereco ender = new Endereco();
    
    public int getNumeroConta(){
        return numeroConta;
    }
    
    public String getNome(){
        return nome;
    }
    
    public Endereco getEnder(){
        return ender;
    }
    
    public void setNumeroConta(int numeroConta) throws NumException{
        if (numeroConta > 0) {
            this.numeroConta = numeroConta;
        } else {
            throw new NumException();
        }
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setEnder(Endereco ender){
        this.ender = ender;
    }
    
    public abstract void verifDoc();
    
    @Override
    public void validar(){
        if (numeroConta % 2 == 0) {
            System.out.println("Numero da conta e PAR");
        } else {
            System.out.println("Numero da conta e IMPAR");
        }
    }
}

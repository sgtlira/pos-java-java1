//GUILHERME CORREIA LIRA DE SOUZA


public final class PessoaFisica extends ClienteBanco{
    
    private int cpf = 0;
    
    public int getCpf(){
        return this.cpf;
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    @Override
    public void verifDoc(){
        if(cpf >= 10 && cpf <= 20 ){
            System.out.println("CPF valido");
        }else{
            System.out.println("CPF invalido");
        }
    }
}

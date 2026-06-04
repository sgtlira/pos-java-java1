//GUILHERME CORREIA LIRA DE SOUZA


public final class PessoaJuridica extends ClienteBanco{
    
    private int cnpj = 0;
    private PessoaFisica responsavel = new PessoaFisica();
    
    public int getCnpj(){
        return cnpj;
    }
    
    public PessoaFisica getResponsavel(){
        return responsavel;
    }
    
    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
    
    public void setResponsavel(PessoaFisica responsavel){
        this.responsavel = responsavel;
    }
    
    @Override
    public void verifDoc(){
        if(responsavel.getNome().length() > 30){
            System.out.println("Nome invalido para Responsavel");
        }else{
            System.out.println("Nome valido para Responsavel");
        }
    }
}

public class ApoliceVida extends ApoliceAbs {
    public ApoliceVida(String seg, float cap) {
        super(seg, cap);
    }
    
    @Override
    public float getPorcentagemPremio() {
        return 3;
    }

    @Override
    public String getNomeProduto() {
        return "Apolice de Vida";    
    }

    @Override
    public String getDocumentosExigidos() {
        return "documento de identidade e CPF.";
    }

    @Override
    public float calcular() {
        float valPremio = (this.valorSeguro * (getPorcentagemPremio()/100))/12;
        return valPremio;
    }

    
    
}

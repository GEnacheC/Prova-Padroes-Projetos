public class ApoliceResidencial extends ApoliceAbs {
    public ApoliceResidencial(String seg, float cap) {
        super(seg, cap);
    }
    
    @Override
    public float getPorcentagemPremio() {
        return (float) 1.5;
    }

    @Override
    public String getNomeProduto() {
        return "Apolice de Residencial";    
    }

    @Override
    public String getDocumentosExigidos() {
        return "escritura ou contrato de locação";
    }

    @Override
    public float calcular() {
        float valPremio = (this.valorSeguro * (getPorcentagemPremio()/100))/12;
        return valPremio;
    }

    
    
}

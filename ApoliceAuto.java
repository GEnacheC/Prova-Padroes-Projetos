public class ApoliceAuto extends ApoliceAbs {
    public ApoliceAuto(String seg, float cap) {
        super(seg, cap);
    }
    
        @Override
    public float getPorcentagemPremio() {
        return 8;
    }

    @Override
    public String getNomeProduto() {
        return "Apolice de Automoveis";    
    }

    @Override
    public String getDocumentosExigidos() {
        return "Documentos exigidos: CNH e CRLV.";
    }

    @Override
    public float calcular() {
        float valPremio = (this.valorSeguro * (getPorcentagemPremio()/100))/12;
        return valPremio;
    }

    
    
}

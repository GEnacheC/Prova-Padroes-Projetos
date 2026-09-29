public class ApoliceFactory {
    
    public ApoliceFactory(String tp, String seg, float val) {
        Construir(tp, seg, val);
    }


    public ApoliceAbs apolice;

    public void Construir(String tipoFactory, String segurado, float valSeg) {
        if(tipoFactory == "Auto") 
            apolice = new ApoliceAuto(segurado, valSeg);
        if(tipoFactory == "Res") 
            apolice = new ApoliceResidencial(segurado, valSeg);
        if(tipoFactory == "Vida") 
            apolice = new ApoliceVida(segurado, valSeg);   
    }
}

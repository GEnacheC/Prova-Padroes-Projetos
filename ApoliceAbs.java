public abstract class ApoliceAbs implements ApoliceInterface {
    public  String segurado;
    public  float valorSeguro;

    public ApoliceAbs(String seg, float cap) {
        this.segurado = seg;
        this.valorSeguro = cap;
    }

    // public float calcular() {
    
    // }

    public void resumo() {
        System.out.println("---------------------------------");
        System.out.println("Produto: " + this.getNomeProduto());
        System.out.println("Nome segurado: " + this.segurado);
        System.out.println("Premio: R$" + this.calcular());
        System.out.println("---------------------------------");
    }
}

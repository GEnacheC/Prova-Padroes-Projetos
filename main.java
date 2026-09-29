class Main {
    public static void main(String[] args) {
       ApoliceAbs vida = new ApoliceFactory("Vida", "Teste 1",  100).apolice;
       vida.resumo();

       ApoliceAbs auto = new ApoliceFactory("Auto", "Teste 2",  100).apolice;
       auto.resumo();

       ApoliceAbs residencial = new ApoliceFactory("Res", "Teste 3",  100).apolice;
       residencial.resumo();
    }
}
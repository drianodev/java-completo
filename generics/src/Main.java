public class Main {

    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Sagrado"));

        System.out.println("Itens da bolsa ninja:");
        bolsaNinja.mostrarFerramenta();
    }
}
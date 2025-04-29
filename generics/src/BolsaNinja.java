import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // Inicializar array
    private List<T> ferramentas;

    // Construtor
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    // Colocar ferramentas no array
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    // Mostrar a lista de ferramentas
    public void mostrarFerramenta() {
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
}

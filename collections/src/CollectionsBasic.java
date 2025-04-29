import java.util.*;

public class CollectionsBasic {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Adriano");
        nomes.add("Sarah");
        nomes.add("Tigrão");
        nomes.add("Maizena");
        nomes.add("Fulano");
        System.out.println(nomes);

        List<Integer> numeros = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
        }};
        System.out.println(numeros);

        // GET
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(3));
        // INSERT / UPDATE
        numeros.set(0, 4);
        numeros.set(1, 5);
        System.out.println(numeros);
        // DELETE
        numeros.remove(1);
        System.out.println(numeros);
        nomes.remove("Fulano");
        System.out.println(nomes);
        // SORT
        Collections.sort(numeros);
        System.out.println(numeros);
        // ITERATOR
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("---");
        Iterator<String> it = nomes.iterator();
        while (it.hasNext()) {
            String itemAtual = it.next();
            System.out.println(itemAtual);
        }
        System.out.println("---");
        List<String> listaNomes = List.of("Adriano", "Sarah", "Fulano");
        System.out.println(listaNomes);
        String[] arrayNomes = {"Adriano", "Sarah", "Fulano"};
        System.out.println(Arrays.toString(arrayNomes));
        List<String> listaConvertida = Arrays.asList(arrayNomes);
        System.out.println(listaConvertida);
        String[] arrayConvertido = listaConvertida.toArray(new String[0]);
        System.out.println(Arrays.toString(arrayConvertido));

        Map<String, String> mapaUsuarios = new HashMap<>();
        mapaUsuarios.put("user1", "adriano");
        mapaUsuarios.put("user2", "sarah");
        mapaUsuarios.put("user3", "fulano");
        System.out.println(mapaUsuarios);
        // GET
        System.out.println(mapaUsuarios.get("user1"));
        // PUT
        mapaUsuarios.put("user3", "ciclano");
        System.out.println(mapaUsuarios);
        // REMOVE
        mapaUsuarios.remove("user3");
        System.out.println(mapaUsuarios);

        for (String valores : mapaUsuarios.values()) {
            System.out.println(valores);
        }
        System.out.println("---");
        for (String chaves : mapaUsuarios.keySet()) {
            System.out.println(chaves);
        }
    }
}
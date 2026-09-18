public class Main {
    public static void main(String[] args) {
        List<String> lista1 = new LinkedList<>();
        lista1.add("Hola");
        lista1.add("Mundo");
        lista1.add("!");
        System.out.println("LinkedList:");
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
        }

        List<String> lista2 = new ArrayList<>();
        lista2.add("Uno");
        lista2.add("Dos");
        lista2.add("Tres");
        System.out.println("ArrayList:");
        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(lista2.get(i));
        }
    }
}

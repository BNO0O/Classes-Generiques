package tp.generiques;

public class MainPaire {

    public static void main(String[] args) {

        // 1. Crée une paire ("Alice", 42) et l'affiche
        Paire<String, Integer> p1 = new Paire<>("Alice", 42);
        System.out.println(p1);

        // 2. Appelle inverser() et affiche le résultat
        Paire<Integer, String> p1Inversee = PaireUtils.inverser(p1);
        System.out.println(p1Inversee);

        // 3. Crée une paire
        Paire<Double, Boolean> p2 = new Paire<>(3.14, true);
        System.out.println(p2.getPremier().getClass().getSimpleName()
                + " — " + p2.getSecond().getClass().getSimpleName());
    }
}

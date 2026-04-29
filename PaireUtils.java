package tp.generiques;

public class PaireUtils {

    /**
     * Retourne une nouvelle Paire avec premier et second échangés.
     */
    public static <A, B> Paire<B, A> inverser(Paire<A, B> p) {
        return new Paire<>(p.getSecond(), p.getPremier());
    }
}

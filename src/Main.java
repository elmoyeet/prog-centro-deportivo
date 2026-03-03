//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CentroDeportivo centroDeportivo = new CentroDeportivo(15);

        Entrenador entrenador1 = new Entrenador(1, "Luca", "MMA", 5);
        Entrenador entrenador2 = new Entrenador(2, "ElPepe", "Kun-Fu", 10);
        Entrenador entrenador3 = new Entrenador(3, "Victor", "Patinaje Artístico", 7);

        System.out.println(centroDeportivo.registrarEntrenador(entrenador1));
        System.out.println(centroDeportivo.registrarEntrenador(entrenador2));
        System.out.println(centroDeportivo.registrarEntrenador(entrenador3));

        System.out.println(centroDeportivo.mostrarEntrenadores());
        System.out.println(centroDeportivo.contarEntrenadores());

        System.out.println(centroDeportivo.buscarEntrenador(3));
        System.out.println(centroDeportivo.buscarEntrenador(6));

    }
}
/**
 * Representa un centro deportivo que gestiona un conjunto limitado de entrenadores
 * mediante un array unidimensional de tamaño fijo.
 *
 * El sistema permite:
 * <ul>
 *     <li>Registrar entrenadores evitando duplicados por identificador.</li>
 *     <li>Buscar entrenadores por su {@code id}.</li>
 *     <li>Eliminar entrenadores del sistema.</li>
 *     <li>Actualizar información relacionada con los entrenadores.</li>
 *     <li>Obtener una representación textual del conjunto almacenado.</li>
 * </ul>
 *
 * La estructura interna utiliza un array estático donde las posiciones libres
 * se representan mediante valores {@code null}. La gestión del espacio disponible
 * se realiza mediante métodos internos que localizan la primera posición libre.
 *
 * Esta clase actúa como contenedor y gestiona la lógica de almacenamiento
 * y acceso a los objetos {@link Entrenador}.
 *
 * @author Mario Molinero Carreras
 * @version 1.0
 */
public class CentroDeportivo {
    private Entrenador[] entrenadores;
    private final int NUM_MAX_ENTRENADORES;

    public CentroDeportivo(int cantidad_max_entrenadores) {
        if (cantidad_max_entrenadores > 0) {
            NUM_MAX_ENTRENADORES = cantidad_max_entrenadores;
        } else {
            NUM_MAX_ENTRENADORES = 10; // Si pasan un número negativo ponemos 10 por defecto.
        }

        entrenadores = new Entrenador[NUM_MAX_ENTRENADORES];
    }

    public Entrenador buscarEntrenador(int id) {
        boolean seguirBuscando = true;
        int numeroEntrenador = 0;

        for (int i = 0; i < NUM_MAX_ENTRENADORES && seguirBuscando; i++) {
            if (entrenadores[i].getId() == id) {
                seguirBuscando = false;
                numeroEntrenador = i;
            }
        }
        return entrenadores[numeroEntrenador];
    }

    private int buscarPrimerHuecoLibre() {
        int primeraPosicionLibre = 0;
        boolean seguirBuscando = true;

        for (int i = 0; i < NUM_MAX_ENTRENADORES && seguirBuscando; i++) {
            if (entrenadores[i] == null) {
                seguirBuscando = false;
                primeraPosicionLibre = i;
            }
        }
        return primeraPosicionLibre;
    }

    public boolean registrarEntrenador(Entrenador entrenador) {
        boolean entrenadorAnadido = false;
        int posicion;


        if (buscarEntrenador(entrenador.getId()) == null) {
            posicion = buscarPrimerHuecoLibre();
            if (posicion >= 0) {
                entrenadores[posicion] = entrenador;
                entrenadorAnadido = true;
            }

        }
        return  entrenadorAnadido;
    }

    public String mostrarEntrenadores() {
        StringBuilder sb = new StringBuilder("Entrenadores: {");

        for (int i = 0; i < NUM_MAX_ENTRENADORES; i++) {
            if (entrenadores[i] != null) {
                sb.append(entrenadores[i].toString());
            }
        }
        sb.append("\n}");

        return sb.toString();

    }

    public int contarEntrenadores() {

    }


}
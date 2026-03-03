/**
 * Representa a un entrenador dentro del sistema del centro deportivo.
 *
 * Cada entrenador está identificado de manera única mediante un {@code id}
 * y dispone de información básica como nombre, especialidad y años de experiencia.
 *
 * Esta clase actúa como entidad del dominio y encapsula sus datos,
 * permitiendo el acceso únicamente a través de métodos públicos.
 *
 * @author Mario Molinero Carreras
 * @version 1.0
 */
public class Entrenador {

    private int id;
    private String nombre;
    private String especialidad;
    private int añosExperiencia;

    public Entrenador(int id, String nombre, String especialidad, int añosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.añosExperiencia = añosExperiencia;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    @Override
    public String toString() {
        StringBuilder  sb = new StringBuilder("Entrenador: {");

        sb.append(String.format("\n id: %d", id));
        sb.append(String.format("\n nombre: %s", nombre));
        sb.append(String.format("\n especialidad: %s", especialidad));
        sb.append(String.format("\n años de experiencia: %d", añosExperiencia));

        sb.append("}");

        return sb.toString();

    }
}
public class Paciente {
    int id;
    String nombre;
    Cita cita;

    public Paciente() {

    }

    public Paciente(int id, String nombre, Cita cita) {
        this.id = id;
        this.nombre = nombre;
        this.cita = cita;
    }

    public Paciente(String nombre){
        this.nombre =nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cita=" + cita +
                '}';
    }
}

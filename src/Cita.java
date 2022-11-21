public class Cita {
    int id;
    String fecha;
    String hora;
    String motivo;
    Paciente myPaciente;
    Doctor myDoctor;


    public Cita() {
    }

    public Cita(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public Paciente getMyPacient() {
        return myPaciente;
    }

    public void setMyPaciente(Paciente myPaciente) {
        this.myPaciente = myPaciente;
    }

    public Doctor getMyDoctor() {
        return myDoctor;
    }

    public void setMyDoctor(Doctor myDoctor) {
        this.myDoctor = myDoctor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", motivo='" + motivo + '\'' +
                ", myPacient=" + myPaciente +
                ", myDoctor=" + myDoctor +
                '}';
    }
}

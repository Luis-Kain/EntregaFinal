import java.util.ArrayList;
import java.util.Arrays;

public class Doctor extends Empleado{

    private ArrayList<Cita> myCitas = new ArrayList<>();
    private String especialidad;
    private String nombre;

    public Doctor() {
    }

    public Doctor(String especialidad, String nombre) {
        this.especialidad = especialidad;
        this.nombre = nombre;
    }

    public ArrayList<Cita> getMyCitas() {
        return myCitas;
    }

    public void setMyCitas(ArrayList<Cita> myCitas) {
        this.myCitas = myCitas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "myCitas=" + myCitas +
                ", especialidad='" + especialidad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

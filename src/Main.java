import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void relacionarCita(Cita citaParaRelacionar,
                                      Paciente pacienteParaRelacionar,
                                      Doctor doctorParaRelacionar,
                                      Scanner sc){
        citaParaRelacionar.setMyPaciente(pacienteParaRelacionar);
        pacienteParaRelacionar.setCita(citaParaRelacionar);
        citaParaRelacionar.setMyDoctor(doctorParaRelacionar);
        doctorParaRelacionar.myCitas.add(citaParaRelacionar);
        System.out.println("ingresa el motivo de la cita");
        String motivo = sc.nextLine();
        citaParaRelacionar.setMotivo(motivo);

    }

    public static void addAdmin(ArrayList<Admin> array, String username, String password){
        array.add(new Admin(username,password));
    }

    public static void registrarNuevoDoctor(ArrayList<Doctor> array,String nombre, String especialidad){
        array.add(new Doctor(especialidad,nombre));
    }

    public static void registrarNuevoPaciente(ArrayList<Paciente> array,String nombre){
        array.add(new Paciente(nombre));
    }

    public static void registrarNuevaCita(ArrayList<Cita> array,String fecha, String hora){
        array.add(new Cita(fecha,hora));
    }

    public static void main(String[] args) {
        boolean isTrue = true;

        Scanner sc = new Scanner(System.in);
        String verifyData[] = {};
        ArrayList<Doctor> myDoctors  = new ArrayList<>();
        ArrayList<Cita> myDates  = new ArrayList<>();
        ArrayList<Paciente> myPatients  = new ArrayList<>();
        ArrayList<Admin> myAdmins = new ArrayList<>();

        addAdmin(myAdmins,"ADMIN","ADMIN");


        do{
            System.out.print("Ingresa tu nombre de usuario:");
            verifyData[0]= sc.nextLine();
            System.out.print("Ingresa tu contraseña:");
            verifyData[1]= sc.nextLine();

            if (verifyData[0] == myAdmins.get(0).getAdminUserName()
                    && verifyData[1] == myAdmins.get(0).getAdminPassword()){
                System.out.println("Bienvenido al progrma, para utilizar el programa simplemente insert el número" +
                        "correspondiente a la lista para realizar la acción deseada");
                System.out.println("1.- Dar de alta nuevo doctor\n2.-Dar de alta nuevo paciente\n3.-Crear una cita" +
                        "\n4.-Relacionar cita con doctor y paciente\n5.-Cerrar programa");
                switch (sc.nextInt()){
                    case 1:
                        System.out.print("Inserte especialidad del doctor: ");
                        String especialidad = sc.nextLine();
                        System.out.print("Inserte nombre del doctor: ");
                        String nombre = sc.nextLine();
                        registrarNuevoDoctor(myDoctors,especialidad,nombre);
                        System.out.println("Nuevo doctor registrado con exito.");
                        break;
                    case 2:
                        System.out.print("inserte nombre del paciente: ");
                        registrarNuevoPaciente(myPatients, sc.nextLine());
                        break;
                    case 3:
                        System.out.print("Inserte fecha de la cita (nomenclatura: dd/mm/yyyy): ");
                        String fecha = sc.nextLine();
                        System.out.print("Inserte hora de la cita (nomenclatura: hh:mm pm/am): ");
                        String hora = sc.nextLine();
                        registrarNuevaCita(myDates,fecha,hora);
                        break;
                    case 4:
                        int citaNumber;
                        int pacienteNumber;
                        int doctorNumber;

                        System.out.println("Citas disponibles:");
                        for(int i = 0; i<myDates.size(); i++){
                            if(myDates.get(i).getMotivo() == null){
                                System.out.println("Cita: "+(i+1));
                            }
                        }
                        System.out.print("Inserta la cita que quieres relacionar con su número de cita: ");
                        citaNumber=sc.nextInt() - 1;

                        System.out.println("Pacientes disponibles:");
                        for (int i = 0; i<myPatients.size(); i++){
                            if(myPatients.get(i).getCita() == null){
                                System.out.println("Paciente "+ myPatients.get(i).getNombre() +":" + (i+1));
                            }
                        }
                        System.out.print("Inserte el paciente que quieres relacionar con su número de paciente:");
                        pacienteNumber = sc.nextInt() - 1;

                        System.out.println("Doctores disponibles:");
                        for(int i=0; i<myDoctors.size();i++){
                            System.out.println("Doctor " + myDoctors.get(i).getNombre() + ": " + (i+1));
                        }
                        break;
                    case 5:
                        isTrue = false;
                        break;
                    default:
                        System.out.println("debe ser un número del 1 al 5");
                }
            }else{
                System.out.println("El usuario o contraseña no son correctos");
            }
        }while(isTrue);
        System.out.println("Cerraste el programa exitosamente");
    }
}
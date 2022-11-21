public class Admin extends Empleado {
    private String adminUserName;
    private String adminPassword;

    public Admin() {
    }

    public Admin(String adminUserName, String adminPassword) {
        this.adminUserName = adminUserName;
        this.adminPassword = adminPassword;
    }

    public int accesCitaId(Cita citaToCheck){
        return citaToCheck.getId();
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminUserName='" + adminUserName + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

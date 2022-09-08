package beans;

public class usuario {
    private int id_usuario;
    private String nombres_usu;
    private String apellidos_usu;
    private String direccion;
    private String ciudad;
    private int telefono;
    private String contrasena;

    public usuario(int id_usuario, String nombres_usu, String apellidos_usu, String direccion, String ciudad, int telefono, String contrasena) {
        this.id_usuario = id_usuario;
        this.nombres_usu = nombres_usu;
        this.apellidos_usu = apellidos_usu;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.contrasena = contrasena;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombres_usu() {
        return nombres_usu;
    }

    public void setNombres_usu(String nombres_usu) {
        this.nombres_usu = nombres_usu;
    }

    public String getApellidos_usu() {
        return apellidos_usu;
    }

    public void setApellidos_usu(String apellidos_usu) {
        this.apellidos_usu = apellidos_usu;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "usuario{" + "id_usuario=" + id_usuario + ", nombres_usu=" + nombres_usu + ", apellidos_usu=" + apellidos_usu + ", direccion=" + direccion + ", ciudad=" + ciudad + ", telefono=" + telefono + ", contrasena=" + contrasena + '}';
    }
    
    
}

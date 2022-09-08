package beans;

import java.sql.Date;

public class compra {
    private int id_producto;
    private int id_usuario;
    private Date fecha;
    private String ciudad;
    private String observaciones;

    public compra(int id_producto, int id_usuario, Date fecha, String ciudad, String observaciones) {
        this.id_producto = id_producto;
        this.id_usuario = id_usuario;
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.observaciones = observaciones;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "compra{" + "id_producto=" + id_producto + ", id_usuario=" + id_usuario + ", fecha=" + fecha + ", ciudad=" + ciudad + ", observaciones=" + observaciones + '}';
    }
    
    
}

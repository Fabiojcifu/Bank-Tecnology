package beans;

public class producto {
    private int id_producto;
    private String nom_producto;
    private String des_producto;
    private int precio;
    private int cantidad;
    private int id_categoria;

    public producto(int id_producto, String nom_producto, String des_producto, int precio, int cantidad, int id_categoria) {
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.des_producto = des_producto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.id_categoria = id_categoria;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public String getDes_producto() {
        return des_producto;
    }

    public void setDes_producto(String des_producto) {
        this.des_producto = des_producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    @Override
    public String toString() {
        return "producto{" + "id_producto=" + id_producto + ", nom_producto=" + nom_producto + ", des_producto=" + des_producto + ", precio=" + precio + ", cantidad=" + cantidad + ", id_categoria=" + id_categoria + '}';
    }
    
    
}

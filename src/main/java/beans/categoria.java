package beans;

public class categoria {
    private int id_categoria;
    private String des_categoria;

    public categoria(int id_categoria, String des_categoria) {
        this.id_categoria = id_categoria;
        this.des_categoria = des_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDes_categoria() {
        return des_categoria;
    }

    public void setDes_categoria(String des_categoria) {
        this.des_categoria = des_categoria;
    }

    @Override
    public String toString() {
        return "categoria{" + "id_categoria=" + id_categoria + ", des_categoria=" + des_categoria + '}';
    }
    
    
}

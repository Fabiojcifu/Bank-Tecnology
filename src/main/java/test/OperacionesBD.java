package test;
    import beans.categoria;
    import connection.DBConnection;
    import java.sql.ResultSet;
    import java.sql.Statement;
public class OperacionesBD {
    public static void main(String[] args) {
        
    }
    public static void actualizarPelicula(int id, String des ) {
        DBConnection con = new DBConnection();
        String sql = "UPDATE categoria SET des_categoria = " + "'" + des + "'WHERE id_categoria = " + id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }
}

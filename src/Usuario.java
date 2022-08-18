public class Usuario {

    private String Usuario;
    private String clave ;

    public Usuario(String usuario, String clave) {
        Usuario = usuario;
        this.clave = clave;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}



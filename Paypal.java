public class Paypal {
    private String usuario;
    private String psw;

    public Paypal() {
    }
    
    public Paypal(String usuario, String psw) {
        this.usuario = usuario;
        this.psw = psw;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}

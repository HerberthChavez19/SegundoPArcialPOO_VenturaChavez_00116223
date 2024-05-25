public class Stripe {
    private String psw;
    private String usuarioStripe;

    public Stripe() {
    }

    public Stripe( String psw, String token) {
        this.psw = psw;
        this.usuarioStripe = token;
    }

    public String getPsw() {
        return psw;
    }
    public void setPsw(String psw) {
        this.psw = psw;
    }
    public String getUsuarioStripe() {
        return usuarioStripe;
    }
    public void setUsuarioStripe(String usuarioStripe) {
        this.usuarioStripe = usuarioStripe;
    }
}

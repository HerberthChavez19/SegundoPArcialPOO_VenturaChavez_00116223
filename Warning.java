public class Warning {
    private String metodoPAgo;

    public String getMetodoPAgo() {
        return metodoPAgo;
    }

    public void setMetodoPAgo(String metodoPAgo) {
        this.metodoPAgo = metodoPAgo;
    }

    public Warning(String metodoPAgo) {
        this.metodoPAgo = metodoPAgo;
    }

    public Warning() {
    }

    public boolean indicator(Paypal ProveedorAdicional){
        System.out.println("Usuario: " + ProveedorAdicional.getUsuario());
        System.out.println("Proceso exitoso: ");
        return true;
    }
}
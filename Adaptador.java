public class Adaptador extends Paypal{
    private Stripe proveedorAdicional;

    public Adaptador(Stripe proveedorAdicional) {
        this.proveedorAdicional = proveedorAdicional;
    }

    @Override
    public String getUsuario(){
        return proveedorAdicional.getUsuarioStripe() + ":stripe";
    }

    @Override
    public String getPsw() {
        return proveedorAdicional.getPsw();
    }

}




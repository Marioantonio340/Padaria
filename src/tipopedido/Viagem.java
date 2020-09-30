package tipopedido;
public class Viagem implements TipoDePedido{

    @Override
    public void tipo() {
        System.out.println("Pedido para viagem");
    }
    
}

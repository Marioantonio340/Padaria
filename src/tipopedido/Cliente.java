package tipopedido;
public class Cliente  {
    private TipoDePedido modo = new ComerAqui();
    
    public void setModo(TipoDePedido novoModo){
        this.modo = novoModo;
    }
    
    public void Pedido(){
       modo.tipo();
    }
    
}

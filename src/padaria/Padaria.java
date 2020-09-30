package padaria;

import biscoito.BiscoitoInvalidoException;
import biscoito.Factory;
import biscoito.TipoBiscoito;
import notafiscal.NotaFiscal;
import notafiscal.TXT;
import notafiscal.PDF;
import tipopedido.Cliente;
import tipopedido.TipoDePedido;
import tipopedido.Viagem;
import tipopedido.ComerAqui;


public class Padaria {
    public static void main(String[] args) {
        
        
        
        Factory factory = new Factory();
        TipoBiscoito biscoito;
        try {
            biscoito = factory.Padaria("Broa");
            if (biscoito.isValid()) {
                biscoito.printTipo();
            }
        } catch (BiscoitoInvalidoException ex) {
            System.err.println("ESTE BISCOITO NÃO ESTÁ DISPONÍVEL");
        }
        
                Cliente c = new Cliente();
        TipoDePedido viagem = new Viagem();
        c.Pedido();
        c.setModo(viagem);


        NotaFiscal n = new TXT();
        n.criar();
        
    }
    
}

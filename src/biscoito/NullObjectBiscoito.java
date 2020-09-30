package biscoito;
public class NullObjectBiscoito extends TipoBiscoito{

    @Override
    public void printTipo() {
        System.out.println("Indisponivel");
    }
    @Override
    public boolean isValid() {
        return false;
    }
    
}

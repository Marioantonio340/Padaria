package biscoito;
public class Factory {

    public  TipoBiscoito Padaria(String biscoitoDesejado) throws BiscoitoInvalidoException {
        if (biscoitoDesejado.equalsIgnoreCase("Pao de Queijo")) {
            return new PaoDeQueijo();
        } else if (biscoitoDesejado.equalsIgnoreCase("Broa")) {
            return new Broa();
        }
        throw new BiscoitoInvalidoException();
    }
}

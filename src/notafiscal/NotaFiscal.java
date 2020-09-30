package notafiscal;
public abstract class NotaFiscal {
    private void buscar(){
        System.out.println("buscando ...");
    }
   
    private void calcular(){
        System.out.println("calculando ...");
    }
    
    protected abstract void exportar();
    
    public void criar() {
        buscar();
        calcular();
        exportar();
    }

}

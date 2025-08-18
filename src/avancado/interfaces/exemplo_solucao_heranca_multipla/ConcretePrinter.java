package avancado.interfaces.exemplo_solucao_heranca_multipla;

public class ConcretePrinter extends Device implements Printer{

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Printing: " + doc);
    }
}

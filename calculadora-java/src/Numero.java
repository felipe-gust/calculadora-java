import java.util.InputMismatchException;

public class Numero {
    
    private int valor;

    public Numero(int valor){
        this.valor = valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        String s = "Resultado: " + valor;
        return s;
    }
    

}

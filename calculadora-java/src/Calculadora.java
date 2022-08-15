import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) throws SinalErradoException {

        Scanner scan = new Scanner(System.in);

        Numero n1 = new Numero(0);
        Numero n2 = new Numero(0);
        Numero result = new Numero(0);

        String opcao = "";
        String sinal;

        //faz as operações enquanto S-SIM
        do{
            
            System.out.println("Digite a letra da operação que deseja realizar: a-adição, s-subtração, d-divisão ou m-multiplicação: ");
            sinal = scan.next();

            if(!sinal.equalsIgnoreCase("A") && !sinal.equalsIgnoreCase("S") && !sinal.equalsIgnoreCase("M") && !sinal.equalsIgnoreCase("D")){
                throw new SinalErradoException();
            }

            //tratativa do erro para letras
            try {

                System.out.println("Entre com o valor do número 1: ");
                n1.setValor(scan.nextInt());
        
                System.out.println("Entre com o valor do número 2: ");
                n2.setValor(scan.nextInt());
                
            } catch (InputMismatchException erro) {
                System.out.println("Valor inválido, digite apenas números inteiros.");
                break; //não continua o loop e imprime os demais prints
            }

            //conforme letra digitada realiza a operação
            if(sinal.equalsIgnoreCase("A")){
                result.setValor(n1.getValor() + n2.getValor());
            }else if(sinal.equalsIgnoreCase("S")){
                result.setValor(n1.getValor() - n2.getValor());
            }else if(sinal.equalsIgnoreCase("D")){
                result.setValor(n1.getValor() / n2.getValor());
            }else if(sinal.equalsIgnoreCase("M")){
                result.setValor(n1.getValor() * n2.getValor());
            }

            //imprime resultado
            System.out.println(result);

            System.out.println("Deseja realizar outra operação? Digite a letra S-Sim ou N-Não: ");
            opcao = scan.next();

        }while(opcao.equalsIgnoreCase("S"));
        
    }

}

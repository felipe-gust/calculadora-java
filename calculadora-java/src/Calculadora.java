import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

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

            System.out.println("Entre com o valor do número 1: ");
            n1.setValor(scan.nextInt());
    
            System.out.println("Entre com o valor do número 2: ");
            n2.setValor(scan.nextInt());

            //conforme letra digitada realiza a operação
            if(sinal.equalsIgnoreCase("A")){
                result.setValor(n1.getValor() + n2.getValor());
            }else if(sinal.equalsIgnoreCase("S")){
                result.setValor(n1.getValor() - n2.getValor());
            }else if(sinal.equalsIgnoreCase("D")){
                result.setValor(n1.getValor() / n2.getValor());
            }else if(sinal.equalsIgnoreCase("M")){
                result.setValor(n1.getValor() * n2.getValor());
            }else{
                System.out.println("Operação inválida.");
            }

            //imprime resultado
            System.out.println(result);


        }while(opcao.equalsIgnoreCase("S"));     

        
    }


}

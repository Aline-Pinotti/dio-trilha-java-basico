import java.util.Scanner;
public class ContaTerminal {    
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;    
        double saldo = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            //Exibir as mensagens para o nosso usuário //Obter pela scanner os valores digitados no terminal
            System.out.println("Por favor, digite o número da Agência: ");
            agencia = scanner.next();
            
            System.out.println("Por favor, digite o número da Conta: ");
            numero = scanner.nextInt();

            System.out.println("Por favor, informe o nome do Cliente: ");
            nomeCliente = scanner.next();
            
            System.out.println("Por favor, informe o Saldo: ");
            saldo = scanner.nextDouble();        

            //Exibir a mensagem "Conta Criada!"
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
            
            scanner.close();
        } catch (Exception e) {
            System.out.println("Informe um valor válido!");
        }        
    }
}

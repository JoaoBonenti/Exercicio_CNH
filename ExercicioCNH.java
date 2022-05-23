import java.util.Scanner;
public class ExercicioCNH {
    public static void main(String[] args){
        //Uso do Scanner para entrada de dados
        try (Scanner scan = new Scanner(System.in)) {
            //Entrada de dados value1, value2 e value3
            System.out.print("Vamos ver se voce pode conduzir um veiculo. Voce foi aprovado no Exame Psicotecnico? Responda com 1 para Sim ou 0 para Nao\n Resposta: ");
            int value1 = scan.nextInt();
            
            System.out.print("Ok, proxima pergunta: Voce foi aprovado no Exame de Legislacao? Responda 1 para Sim ou 0 para Nao\n Resposta: ");
            int value2 = scan.nextInt();
            
            System.out.print("Ok, proxima pergunta: Voce foi aprovado no Exame de Direcao? Responda 1 para Sim ou 0 para Nao\n Resposta: ");
            int value3 = scan.nextInt();
            
            //Condicional para determinar se o usuário está habilitado ou não para conduzir um veículo
            if (value1 == 1 && value2 == 1 && value3 == 1)
            {
                System.out.print("Voce pode conduzir um veiculo");
            }
            else
            {
                System.out.print("Voce nao pode conduzir um veiculo");
            }
            
             }
        }
}
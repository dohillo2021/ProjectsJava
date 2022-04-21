package tiposprimitivos;

import java.util.Scanner;


public class TiposPrimitivos {

       public static void main(String[] args) {
        // TODO code application logic here
           Scanner teclado = new Scanner(System.in);
           System.out.print("Digite o nome do Aluno: ");
           String nome = teclado.nextLine();
            System.out.print("Digite o nota do Aluno: ");
           float nota = teclado.nextFloat();
           System.out.format("A Nota é %s é %.1f \n" ,nome, nota);
    }
    
}

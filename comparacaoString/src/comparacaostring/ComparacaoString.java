/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author OITO
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "William";
        String nome2 = "William";
        String nome3 = new String("William");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
        
    }
    
}

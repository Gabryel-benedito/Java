package testearraycontatos;

import java.util.Scanner;

public class TesteArrayContatos {

    public static void main(String[] args) {
        
        
        Contato[] agenda = new Contato[5];
        agenda[0] = new Contato ("Maria", "123456789");
        agenda[1]= new Contato ("joao", "1385839");
        agenda[2]= new Contato ("Guilherme", "1498395");
        agenda[3]= new Contato ("Luca", "26598899904");
        agenda[4]= new Contato ("Marcos", "17607583096");
    
        System.out.println("/n/n***Minha agenda de contatos ***");

                
        for(int i=0; i<agenda.length; i++){

            System.out.println("Nome: "+agenda[i].getNome()+"/");
            System.out.println("Telefone: "+ agenda[i].getTelefone());
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodaforca;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class JogodaForca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //
        //
        //
     	
	Random random = new Random();
	Scanner in = new Scanner(System.in);
		
		
                  System.out.println(  " ------[  Tema : Objetos  ]------ \n\n");
         
	String[] palavras  = { "FACA", "TRAVESSEIRO", "CADERNO", "COMPUTADOR", "ESPADA", "DESODORANTE", "PRATELEIRA", "CAFETEIRA", "ESCUDO" };
		
		
		int quantidadePalavras = palavras.length; 
		int posiçãoPalavra = random.nextInt(quantidadePalavras); 
		String sorteada = palavras[posiçãoPalavra]; 
		
		char[] acertos = new char[sorteada.length()];
		for (int i = 0; i < acertos.length; i++) { 
			if (sorteada.charAt(i) == '-')
				acertos[i] = 1;
		}

	String letrasUtilizadas = "";
	
        
        char letra;
		
	boolean venceu = false;
	//int vidas = 10a;
                 int min = 3; int max = 7; 
                 int vidas = random.nextInt(max-min) + min;	
		
	for (int i = 0; i < sorteada.length(); i++) {
		if (acertos[i] == 1) { 
				System.out.print(" - ");
		} else {
				System.out.print(" _ ");
		}
	}
		
		System.out.println("\n");
		
		
	do {		

 System.out.print("\n" 
	+ "\nVidas restantes: " + vidas + " "
	+ "\nLetras utilizadas: " + letrasUtilizadas
	+ "\nTente uma letra  ou  tente adivinhar a palavra: ");
			
String userdigit = in.next().toUpperCase(); // letra maiuscula 
													//em maiusculo e depois o charAt(0) para pegar primeira letra.
		
	if (userdigit.length() > 1) {  // tamanho da palavra digitada 
		if (userdigit.equals(sorteada)) {
			venceu = true;
			break;
		} else {
			vidas = 0;
			break;
		}
	} else {
		letra = userdigit.charAt(0);
		letrasUtilizadas += " " + letra; 
				
		boolean perdeVida = true; 
		for (int i = 0; i < sorteada.length(); i++) {
					
			if (letra == sorteada.charAt(i)) {
						
			acertos[i] = 1;
			perdeVida = false;
		} 
	}
				
		if (perdeVida) {
			vidas--; 
		}
	}
	System.out.println("\n");
	venceu = true;
	for (int i = 0; i < sorteada.length(); i++) {

		if (acertos[i] == 0) {
			System.out.print(" _ ");
			venceu = false;
		}
		else {
		System.out.print(" " + sorteada.charAt(i) + " ");
		}
	}
			
	System.out.println("\n");
			
   } while (!venceu && vidas > 0); 
		
                   if (vidas != 0) {
	System.out.println("\n\t ----- Você acertou !!!! -----");
	} else {
	System.out.println("\n\t ------ Você perdeu  ;(  ------  \n");
	System.out.println("\t A palavra  era: " + sorteada );
		}
      
       
    }
}
    
    
    


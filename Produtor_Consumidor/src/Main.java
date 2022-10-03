package src;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Random random = new Random ();
		Scanner leitor = new Scanner (System.in);
		int controle;
		System.out.print("Quantas vezes o processo vai acontecer? ");
		controle = leitor.nextInt();
		int [] cesto = new int [controle];




		int escolhaDoProcesso;
		for (int i = 1; i < controle; i++) {
			escolhaDoProcesso = random.nextInt(2);
			if (escolhaDoProcesso == 1 && cesto[i - 1] > 0) { // Processo de tirar o "dado" (o "> 0" é para não retirar 1 de 0 pães, e ficar -1 pães na cesta)
				cesto[i] = cesto[i - 1] - 1;
				//	tirarDado();
			} else if (escolhaDoProcesso == 0 && cesto[i - 1] < 10){ // Proceso de adicionar 1 "dado"   (o limite "< 11" é para não "transbordar" a cesta de pães)
				cesto[i] = cesto[i - 1] + 1;
				//adicionarDado();
			}else if (escolhaDoProcesso == 0 && cesto[i -1] >= 10) { // Processo caso a cesta esteja cheia e o randomizador tenha saido 0
				cesto[i] = cesto[i - 1] - 1;
			}
			System.out.println(cesto[i]);
		}

	}
}

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CifraDeCesar {	

	public static void encriptar(String texto, int chave) {
		char ascii;
		char x, y;
		while (chave > 27) {
			chave = chave - 26;
		}

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) >= 97 && texto.charAt(i) <= 122) {
				if ((int) (texto.charAt(i) + chave) > 122) {
					x = (char) (texto.charAt(i) + chave);
					y = (char) (x - 122);
					ascii = (char) (96 + y);
					System.out.print(ascii + "");
				} else {
					ascii = (char) (texto.charAt(i) + chave);
					System.out.print(ascii + "");

				}
			}
			if (texto.charAt(i) >= 65 && texto.charAt(i) <= 90) {
				if (texto.charAt(i) + chave > 90) {
					x = (char) (texto.charAt(i) + chave);
					y = (char) (x - 90);
					ascii = (char) (64 + y);
					System.out.print(ascii + "");
				} else {
					ascii = (char) (texto.charAt(i) + chave);
					System.out.print(ascii + "");
				}
			}
		}
	}

	public static void decriptar(String texto, int chave) {
		char ascii;
		char x, y;
		while (chave > 27) {
			chave = chave - 26;
		}

		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) >= 97 && texto.charAt(i) <= 122) {
				if ((int) (texto.charAt(i) - chave) > 122) {
					x = (char) (texto.charAt(i) - chave);
					y = (char) (x + 122);
					ascii = (char) (96 - y);
					System.out.print(ascii + "");
				} else {
					ascii = (char) (texto.charAt(i) - chave);
					System.out.print(ascii + "");

				}
			}
			if (texto.charAt(i) >= 65 && texto.charAt(i) <= 90) {
				if (texto.charAt(i) - chave > 90) {
					x = (char) (texto.charAt(i) - chave);
					y = (char) (x + 90);
					ascii = (char) (64 - y);
					System.out.print(ascii + "");
				} else {
					ascii = (char) (texto.charAt(i) - chave);
					System.out.print(ascii + "");
				}
			}
		}
	}

	public static void main(String[] args) {

		String texto;
		int chave;
		Scanner sc = new Scanner(System.in);

		System.out.println("O que você deseja? \n"
				+ "1 - Encriptar \n"
				+ "2 - Decriptar \n");
		int op = sc.nextInt();

		if(op == 1) {
			System.out.println("Digite a mensagem: ");
			texto = sc.next();
			System.out.println("Digite a chave: ");
			chave = sc.nextInt();
			encriptar(texto,chave);
		}
		if(op == 2) {
			System.out.println("Digite a mensagem: ");
			texto = sc.next();
			System.out.println("Digite a chave: ");
			chave = sc.nextInt();
			decriptar(texto,chave);

		}
	}
}

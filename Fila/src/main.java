import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		System.out.println("Existe uma fila com 7 pessoas, você sorteia quem será o próximo a entrar");
		System.out.println("João tem o número 1,Maria 2, Carlos 3, Pedro 4, Julia 5, Paulo 6 e Fernando 7");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String num;
		switch (x) {
		case 1:
			num = "João";
			break;
		case 2:
			num = "Maria";
			break;
		case 3:
			num = "Carlos";
			break;
		case 4:
			num = "Pedro";
			break;
		case 5:
			num = "Julia";
			break;
		case 6:
			num = "Paulo";
			break;
		case 7:
			num = "Fernando";
			break;
		default:
			num = "valor invalido";
			break;
		}
		System.out.println("A pessoa sorteada foi: " + num);
		sc.close();
	}
}
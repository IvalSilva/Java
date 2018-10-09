package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "amarela";
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei fazer o bassai/join/kanku-dai");
		case "marrom":
			System.out.println("Sei fazer o teikon shodan");
		case "roxa":
			System.out.println("Sei fazer o heian godan");
		case "verde":
			System.out.println("Sei fazer o heian yodan");
		case "laranja":
			System.out.println("Sei fazer o heian sandan");
		case "vermelha":
			System.out.println("Sei fazer o heian Nidan");
		case "amarela":
			System.out.println("Sei fazer o heian shodan");
		default:
			System.out.println("Nao sei nada");

		}
	}
}

package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data nascimento = new Data();
		nascimento.dia = 26;
		nascimento.mes = 12;
		nascimento.ano = 2016;

		System.out.println(nascimento.formatar());
	}

}

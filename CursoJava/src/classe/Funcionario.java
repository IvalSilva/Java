package classe;

public class Funcionario {
	
	String nome;
	double salario;
	String funcao;
	
	String formatar(){
		return String.format("%S, %S, %S", nome, salario, funcao);
	}

}

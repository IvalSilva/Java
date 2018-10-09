package classe;

public class FuncionarioTeste {
	
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Ival Dutra da Silva";
		funcionario.salario = 7.000;
		funcionario.funcao = "Analista de Sistemas";
		
		System.out.println("Nome			" + "Salario	"  + "Funcao");
		System.out.println(funcionario.formatar());
		
		
		
	}

}

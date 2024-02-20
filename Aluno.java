package br.edu.ufcg.computacao.p2lp2.coisa;

/**
* Representação de um estudante, especificamente de computação, matriculado da * UFCG. Todo aluno precisa ter uma matrícula e é identificado unicamente
* por esta matrícula.
* 
* @author Thais Oliveira - 123110142
*/

public class Aluno {
  /**
	* Nome do aluno, no tipo String
	*/
	private String nome;
	/**
	 * Ano de nascimento do aluno, que será recebido na entrada, junto com o nome
	 */
	private int anoNascimento;
	/**
	 * Controle de Rendimento Academico do aluno
	 */
	private double cra;

	/**
	 * Constrói um aluno a partir de seu nome e ano de nascimento
	 * Todo aluno começa o curso com o campo CRA nulo
	 * 
	 * @param nome - o nome do aluno
	 * @param anoNascimento - ano de nascimento do aluno
	 */
	
	public Aluno(String nome, int anoNascimento) {
		this.nome = nome;
		this.cra = 0.0;
		this.anoNascimento = anoNascimento;
}
	/**
	 * Recebe o CRA do aluno no formato double
	 * @param cra
	 */
	public void setCra(double cra) {
		this.cra = cra;
}

	/**
	 * Método que calcula a idade do aluno a partir do ano atual (já fornecido pelo programador) e o ano de nascimento do aluno (fornecido como parâmetro no construtor)
	 * @return idade do aluno
	 */
	public int getIdade() {
		return 2021 - anoNascimento;
}
	/**
	 * Retorna a String que representa o aluno, que segue o formato "Aluno - Nome do Aluno"
	 * @return a representação em String do aluno
	 */
	public String toString() {
		return "Aluno - "  + this.nome;
	}
}

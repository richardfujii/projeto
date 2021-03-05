package projetoJavaVacina;

import java.util.Scanner;

public class Pessoas  {

	private String primeiroNome;
	private String meioNome;
	private String ultimoNome;
	String zonaCidade;
	private String dataNasc;
	private String anoNasc;
	private String senha;
	private int idade;
	private boolean statusVacina;
	private boolean restrVacina;

	Scanner ler = new Scanner(System.in);

	// construtores para os dados mais relevantes
	public Pessoas(String pNome, String mNome, String uNome, String zCidade, String dNasc, String aNasc, int idade) {

		setPrimeiroNome(pNome);
		setMeioNome(mNome);
		setUltimoNome(uNome);
		setZonaCidade(zCidade);
		setDataNasc(dNasc);
		setAnoNasc(aNasc);
		setIdade(idade);

	}
	
	//construtor para a classe Postos de Sa�de
	public Pessoas(String zonaCidade) {
		
		this.zonaCidade = zonaCidade;
	
	}
	
	//construtor para a classe Vacina
	public Pessoas(boolean statusVacina, boolean restrVacina) { 
		this.statusVacina = statusVacina;
		this.restrVacina = restrVacina;
	}

	public void cadastrarPessoa() { // m�todo para cadastrar a pessoa

		System.out.println("Entre com o primeiro nome:");
		this.primeiroNome = ler.nextLine();

		/*System.out.println("Entre com o nome do meio (digite 0 caso n�o exista nome do meio): ");
		this.meioNome = ler.nextLine();
		if (this.meioNome == "0") { // caso a pessoa n�o tenha nome do meio
			this.meioNome = null;
			ler.nextLine();
		}
		System.out.println("Entre com o ultimo nome:");
		this.ultimoNome = ler.nextLine();
		*/
		System.out.println("Entre com a zona da cidade de SP onde a pessoa mora(ZN/ZL/ZS/ZO):");
		this.setZonaCidade(ler.nextLine());
		if(getZonaCidade()=="ZN") {
			this.zonaCidade="ZN";
		}
		System.out.println(this.zonaCidade);
		/*System.out.println("Entre com a data de nascimento(DD/MM):");
		this.dataNasc = ler.nextLine();
		System.out.println("Entre com o ano de nascimento(AAAA):");
		this.anoNasc = ler.nextLine();
		System.out.println("Entre com a idade da pessoa:");
		this.idade = ler.nextInt();*/
		//setSenha();
		//ler.nextLine();
	}

	public void verificaCad() { // m�todo para verificar se o cadastro funcionou

		if (getPrimeiroNome() != null && getMeioNome() != null) {
			System.out.println("A pessoa est� cadastrada com nome " + getPrimeiroNome() + " " + getMeioNome() + " "
					+ getUltimoNome() + " e senha: " + getSenha());
		
		} else if (getPrimeiroNome() != null && getMeioNome() == null) {
			System.out.println("A pessoa est� cadastrada com nome " + getPrimeiroNome() + " " + getUltimoNome()
					+ " e senha: " + getSenha());
		
		} else if (getPrimeiroNome() == null) {
			while (getPrimeiroNome() == null) {
				System.out.println("A pessoa n�o est� cadastrada, favor iniciar o cadastro");
				cadastrarPessoa();
				setSenha();
				verificaCad();
			}
		}

	}

	public void setSenha() { // m�todo para concatenar strings e criar a senha

		StringBuilder senha = new StringBuilder();

		senha.append(this.primeiroNome.charAt(0)).append(this.primeiroNome.charAt(1)).append(this.anoNasc)
				.append(this.ultimoNome.charAt(0)).append(this.ultimoNome.charAt(1));

		this.senha = senha.toString();

	}

	public void setStatusVacina() { // um m�todo para retornar se a pessoa j� se vacinou
		System.out.println("A pessoa j� tomou a primeira dose?(S/N) ");
		String situacao = ler.nextLine();
		if (situacao == "S") {
			this.statusVacina = true;
		} else {
			this.statusVacina = false;
		}
	}
	
	public boolean getStatusVacina() {
		return this.statusVacina;
	}

	public void setRestrVacina() { //um m�todo para definir se a pessoa tem idade m�nima
		if (getIdade() >= 18) {
			this.restrVacina = false;
		} else {
			this.restrVacina = true;
		}
	}
	
	public boolean getRestrVacina() {
		return this.restrVacina;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getMeioNome() {
		return meioNome;
	}

	public void setMeioNome(String meioNome) {
		this.meioNome = meioNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getZonaCidade() {
		return zonaCidade;
	}

	public void setZonaCidade(String zonaCidade) {
		this.zonaCidade = zonaCidade;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(String anoNasc) {
		this.anoNasc = anoNasc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSenha() {
		return senha;
	}
}
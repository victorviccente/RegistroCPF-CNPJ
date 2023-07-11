package Entities;

import enums.TypePerson;

public class LegalPerson extends Person {

	private String cnpj;

	public LegalPerson() {
	}

	public LegalPerson(String nome, String sobrenome, String cnpj, TypePerson tipo) {
		super(nome, sobrenome, tipo);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String getNome() {
		return "Pessoa Jurídica está cadastrada no nome de " + super.getNome() + " " + super.getSobrenome()
				+ " que é responsável pelo CNPJ " + cnpj + ".";
	}
}

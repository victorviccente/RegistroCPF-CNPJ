package Entities;

import enums.TypePerson;

public class PhysicalPerson extends Person {

	private String cpf;

	public PhysicalPerson() {
	}

	public PhysicalPerson(String nome, String sobrenome, String cpf, TypePerson tipo) {
		super(nome, sobrenome, tipo);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String getNome() {
		return "Pessoa Fisica está cadastrada no nome de " + super.getNome() + " " + super.getSobrenome()
				+ " que é responsável pelo CPF: " + cpf + ".";
	}
}

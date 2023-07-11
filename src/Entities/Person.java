package Entities;

import enums.TypePerson;

public class Person {

	private String nome;
	private String sobrenome;
	private TypePerson tipo;

	public Person() {
	}

	public Person(String nome, String sobrenome, TypePerson tipo) {
		this.nome = nome;
		this.tipo = tipo;
		this.sobrenome = sobrenome;
	}

	public TypePerson getTipo() {
		return tipo;
	}

	public void setTipo(TypePerson tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}

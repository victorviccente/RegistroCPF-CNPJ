package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.LegalPerson;
import Entities.Person;
import Entities.PhysicalPerson;
import enums.TypePerson;

public class Program {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		List<Person> lista = new ArrayList<>();

		System.out.print("Informe o nome: ");
		String nome = sc.nextLine();
		System.out.print("Informe o sobrenome:");
		String sobrenome = sc.nextLine();
		System.out.print("Pessoa Física ou Pessoa Jurídica: ");
		TypePerson tipo = TypePerson.valueOf(sc.next().toUpperCase());

		Person pessoa;
		if (tipo == TypePerson.PESSOA_JURIDICA || tipo == TypePerson.JURIDICA) {
			System.out.print("Informe o CNPJ: ");
			sc.nextLine();
			String cnpj = sc.nextLine();
			pessoa = new LegalPerson(nome, sobrenome, cnpj, tipo);
			lista.add(pessoa);
		} else if (tipo == TypePerson.PESSOA_FISICA || tipo == TypePerson.FISICA) {
			System.out.print("Informe o CPF: ");
			sc.nextLine();
			String cpf = sc.nextLine();
			pessoa = new PhysicalPerson(nome, sobrenome, cpf, tipo);
			lista.add(pessoa);
		} else {
			System.out.println("Tipo de pessoa inválido!");
		}

		System.out.println();
		System.out.println("BANCO DE REGISTRO DE CIVIS NO BRASIL:");
		System.out.println();

		for (Person p : lista) {
			if (p != null) {
				System.out.println(p.getNome());
			}
		}

		sc.close();
	}
}

package br.com.i9.conhecimento.tipolong;

/**
 * O long é um tipo primitivo numérico de range -9.223.372.036.854.775.808 até
 * 9.223.372.036.854.775.807. Esse é o tipo que armazena a maior quantidade de
 * números inteiros (sem casas decimais). Bora conferir alguns exemplos?
 */
public class Long {
	public static void main(String[] args) {
		long numA = 102040;
		long numB = 102030405060L; // adicionado L no final para indicar que estamos inserindo um valor do tipo
									// long
		System.out.println(numA);
		System.out.println(numB);
	}
}

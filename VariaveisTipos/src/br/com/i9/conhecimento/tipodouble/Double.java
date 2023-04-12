package br.com.i9.conhecimento.tipodouble;

/**
 * O double é um tipo primitivo numérico de range -4,9E-324 até
 * 1,7976931348623157E308. Ele é o outro tipo primitivo para utilização de
 * números de ponto flutuante, similar ao float, porém com um range maior.
 * 
 */
public class Double {

	public static void main(String[] args) {
		double varDouble = 2.356; // double inicializado naturalmente
        double doubleRecebendoFloat = 1.409F; // double aceitando número float
        double doubleRecebendoLong = 12930L; // double aceitando número long
        System.out.println(doubleRecebendoFloat); // 1.409000039100647
        System.out.println(doubleRecebendoLong); // 12930.0
	}
}

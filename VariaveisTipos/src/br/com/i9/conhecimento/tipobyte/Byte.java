package br.com.i9.conhecimento.tipobyte;

/**
 * O tipo primitivo byte é tipo de menor unidade para armazenamento dos tipos
 * inteiros, dado que 1 byte é composto por 8 bits. Mas cuidado! O fato de ser a
 * menor unidade não significa que não o usamos ou que não cabe nada nele. Pelo
 * contrário: a representação de dados (áudios, textos, vídeos e etc.) realizada
 * por computadores é o resultado de várias combinações de bits. Além disso,
 * graças aos bytes, podemos manipular imagens (se quiser saber mais, acesse Bit
 * ou Byte?.
 * https://tecnoblog.net/responde/bit-ou-byte/
 */
public class Byte {

	public static void main(String[] args) {
//		-128 até 127
		 byte b = 9;
//		 byte c = -129; (Fora do limite suportado o compilador reclama)
	     System.out.println(b);

	}

}

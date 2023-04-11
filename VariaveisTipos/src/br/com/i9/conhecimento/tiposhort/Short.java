package br.com.i9.conhecimento.tiposhort;

public class Short {

	/**
	 * A partir do Java 1.7 (2011), números podem conter o símbolo _ (underscore)
	 * para facilitar a leitura. É isso que estamos fazendo com a variável
	 * formatadaComUnderscore. Para saber mais sobre o uso do underscore, acesse
	 * Underscores in Numeric Literals.
	 * https://docs.oracle.com/javase/7/docs/technotes/guides/language/underscores-literals.html#:~:text=In%20Java%20SE%207%20and,the%20readability%20of%20your%20code 
	 */

	public static void main(String[] args) {
		short num = 300;
		short formatadaComUnderscore = 20_000; // variável
		System.out.println(num);
		System.out.println(formatadaComUnderscore); // 20000

	}

}

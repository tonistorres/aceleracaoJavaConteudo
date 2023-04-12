package br.com.i9.conhecimento.tipoboolean;

public class Boolean {
    public static void main(String[] args) {
        boolean isBoolean = true;
        int age = 15;

        if (age <= 17) {
            isBoolean = false;
            System.out.println("Proibido a entrada no cinema");
            System.out.println("A Variavel boolean recebeu um valor" + isBoolean);
        } else {
            System.out.println("Seu acesso está liberado para filmes maiores de 18 anos");
        }
    }
}
package br.com.i9.conhecimento.tipochar;

public class Char {
    public static void main(String[] args){
        char letraA='a';
        char letraAMaiuscula='A';
        System.out.println("Valor da variavel a Minuscula é: "+letraA);
        System.out.println("Valor da variavel A Maiuscula é: " + letraAMaiuscula);
        if(letraA==letraAMaiuscula){
            System.out.println("Se essa menssagem aparecer equivale dizer que não case sensitive");
        }else{
            System.out.println("Linguagem java é case sensitive");
        }
    }
}

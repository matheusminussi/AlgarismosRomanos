package org.example;

public class Main {
    public static void main(String[] args) {
        Conversor2 conversor = new Conversor2();

        System.out.println("=============================================");
        System.out.println("Decimal para romano: "+conversor.DecimalParaRomano(1));
        System.out.println("=============================================");
        System.out.println("Romano para decimal: "+conversor.romanoParaDecimal("IIV"));
        System.out.println("=============================================");


    }
}
package org.example;

public class Conversor2 {
    public String DecimalParaRomano(int num) {
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] algarismos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder resultado = new StringBuilder();
        String mensagemErro="Não é possível converter o número decimal informado para algarismos romanos.";

        if (num <= 0 || num > 3999) {
            return mensagemErro;
        } else {
            for (int i = 0; i < valores.length; i++) {
                while (num >= valores[i]) {
                    num -= valores[i];
                    resultado.append(algarismos[i]);
                }
            }
            return resultado.toString();
        }
    }


    static int valores(char valoresRomanos)
    {
        if (valoresRomanos == 'I')
            return 1;
        if (valoresRomanos == 'V')
            return 5;
        if (valoresRomanos == 'X')
            return 10;
        if (valoresRomanos == 'L')
            return 50;
        if (valoresRomanos == 'C')
            return 100;
        if (valoresRomanos == 'D')
            return 500;
        if (valoresRomanos == 'M')
            return 1000;
        return -1;
    }


    public int romanoParaDecimal(String romano)
    {
        int resultado = 0;

        for (int i = 0; i < romano.length(); i++) {

            int s1 = valores(romano.charAt(i)); // pega o valor do simbulo no index
            if (i + 1 < romano.length()) {
                int s2 = valores(romano.charAt(i + 1));// pega o valor do simbulo no index+1

                if (s1 >= s2) { // Compara o valor de ambos
                    resultado = resultado + s1;
                } else {
                    resultado = resultado + s2 - s1;
                    i++;
                }
            } else {
                resultado = resultado + s1;
            }
        }
        return resultado;
    }


}


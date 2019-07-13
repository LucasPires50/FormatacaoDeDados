package formatacaodedados;

public class Mascaras {
//CPF

    /**
     * Essa método contém as regras necessárias para o cpf na fotmatação correta
     * e também para não dar erro quando o usuário digitar números a mais ou de
     * menos.
     *
     * @param cpf
     * @return cpf formatado
     */
    public static String Formatacpf(String cpf) {
        //converte a string cpf informada para array
        String cpf1 = cpf;
        char[] cpfArray = cpf.toCharArray();
        String cpfFormato = "";

        //if para não da erro, quando colocar númeors a mais ou a menos. 
        if (cpf1.length() == 11) {
            //preenchaer o array manualmente para coloccar a formatação do cpf
            cpfFormato = "" + cpfArray[0] + cpfArray[1] + cpfArray[2] + "." + cpfArray[3] + cpfArray[4] + cpfArray[5] + "." + cpfArray[6] + cpfArray[7] + cpfArray[8] + "-" + cpfArray[9] + cpfArray[10];
        } else {
            cpfFormato = "CPF inválido";
        }

        return cpfFormato;
    }

    /**
     * Essa método contém as regras necessárias para o cnpj na fotmatação
     * correta e também para não dar erro quando o usuário digitar números a
     * mais ou de menos.
     *
     * @param cnpj
     * @return cnpj formatado
     */
    public static String cnpjFormatado(String cnpj) {
        //converte a string informada para array
        char[] cnpjArray = cnpj.toCharArray();
        String cnpjFormato = "";

        // estabelece a quatidade de posições do cnpj
        if (cnpj.length() == 14) {
            // com a quantidade de posições estabelecidas, precenche manualmente as poções a coloca os pontos na posição correta
            cnpjFormato = "" + cnpjArray[0] + cnpjArray[1] + "." + cnpjArray[2] + cnpjArray[3] + cnpjArray[4] + "." + cnpjArray[5] + cnpjArray[6] + cnpjArray[7] + "/" + cnpjArray[8] + cnpjArray[9] + cnpjArray[10] + cnpjArray[11] + "-" + cnpjArray[12] + cnpjArray[13];
        } else {
            cnpjFormato = "CNPJ inválido";
        }

        return cnpjFormato;
    }

    //CEP
    /**
     * Esse método coloca o cep informato pelo usuário na formatação correta.
     * ex: 99.654-789
     *
     * @param cep
     * @return cep formatado
     */
    public static String cepFormatado(String cep) {
        //esse char trasnforma automaticamente a string em array
        char[] cepArray = cep.toCharArray();

        String cepFormato = "";
        // for para pecorrer as posições do array
        for (int i = 0; i < cepArray.length; i++) {
            //junto cepFormatado e a posição em em cep formatado
            cepFormato = cepFormato + cepArray[i];
            //esses if é para colocar a pontuação na posição correta
            if (i == 1) {
                cepFormato = cepFormato + ".";
            }
            if (i == 4) {
                cepFormato = cepFormato + "-";
            }
        }

        return cepFormato;
    }

    //TELEFONE
    /**
     * Esse método vai colocar o número do telefone na formatação correta.
     *
     * @param telefone
     * @return telefone formatado
     */
    public static String telefoneFormatado(String telefone) {
        //esse char trasnforma automaticamente a string em array
        char[] telefoneArray = telefone.toCharArray();

        String telefoneFormato = "";
        // for para pecorrer as posições do array
        for (int i = 0; i < telefoneArray.length; i++) {
            //esses if é para colocar a pontuação na posição correta
            if (i == 0) {
                telefoneFormato = telefoneFormato + "(";
            }

            telefoneFormato = telefoneFormato + telefoneArray[i];

            if (i == 1) {
                telefoneFormato = telefoneFormato + ")";
            }
            if (i == 6) {
                telefoneFormato = telefoneFormato + "-";
            }
        }

        return telefoneFormato;
    }

    //PLACA DE CARRO
    /**
     * Esse método coloca a placa do carro na formatação correta sempre em letra
     * maiúscula
     *
     * @param carroPlaca
     * @return placa do carro formtada
     */
    public static String placaCarroFormatado(String carroPlaca) {
        //a substring cortou a string na posição três para colocar o "-"
        carroPlaca = carroPlaca.substring(0, 3) + "-" + carroPlaca.substring(3, 7);
        //retorna a placa somente em letra maiúscula
        return carroPlaca.toUpperCase();

    }

    /**
     * Esse método conta a quantidade de letras maiúsculas no texto informado
     *
     * @param letras
     * @return contador letra maiúsculas
     */
    public static int letraContMaiusculo(String letras) {
        //contador
        int contadorLetraMaiuscula = 0;
        //converte a string informada em array
        char[] palavraArray = letras.toCharArray();
        //pecorre o array da string informada
        for (char c : palavraArray) {
            //se o caracter for maiúscula conta esses caracters
            if (Character.isUpperCase(c)) {
                contadorLetraMaiuscula++;
            }

        }

        return contadorLetraMaiuscula;

    }

    /**
     * Esse método conta a quantidade de letras minúsculas no texto informado
     *
     * @param letras
     * @return contador letra minúsculas
     */
    public static int letraContMinusculo(String letras) {
        //contador
        int contadorLetraMinuscula = 0;
        //converte a string informada em array
        char[] palavraArray = letras.toCharArray();

        //pecorre o array da string informada
        for (char c : palavraArray) {
            //se o caracter for minúsculo conta esses caracters
            if (Character.isLowerCase(c)) {
                contadorLetraMinuscula++;
            }
        }
        return contadorLetraMinuscula;
    }

}

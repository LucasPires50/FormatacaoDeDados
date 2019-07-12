package formatacaodedados;

public class Mascaras {
//CPF
    public static String Formatacpf(String cpf) {
        //converte o cpf infoprmado para array
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
    //CNPJ
     public static String cnpjFormatado(String cnpj) {
        char[] cnpjArray = cnpj.toCharArray();
        String cnpjFormato = "";
   
            if (cnpj.length()== 14){
            cnpjFormato = ""+cnpjArray[0]+cnpjArray[1]+"."+cnpjArray[2]+cnpjArray[3]+cnpjArray[4]+"."+cnpjArray[5]+cnpjArray[6]+cnpjArray[7]+"/"+cnpjArray[8]+cnpjArray[9]+cnpjArray[10]+cnpjArray[11]+"-"+cnpjArray[12]+cnpjArray[13];
        }else{
             cnpjFormato = "CNPJ inválido";  
        }
        
        
        return cnpjFormato;    
     }
     //CEP
        public static String cepFormatado(String cep) {
            char[] cepArray = cep.toCharArray();

            String cepFormato = "";

            for (int i = 0; i < cepArray.length; i++){
                cepFormato = cepFormato + cepArray[i];

                if(i == 1 ){
                    cepFormato = cepFormato+".";
                }
                if(i == 4 ){
                    cepFormato = cepFormato+"-";
                }
            }

            return cepFormato;
    }
        //TELEFONE
        public static String telefoneFormatado (String telefone){
           char[] telefoneArray = telefone.toCharArray();
        
        String telefoneFormato = "";
        
        for (int i = 0; i < telefoneArray.length; i++){
             if(i == 0  ){
                telefoneFormato = telefoneFormato+"(";
            }
            
            telefoneFormato = telefoneFormato + telefoneArray[i];
            
           
            if(i == 1){
                telefoneFormato = telefoneFormato+")";
            }
            if(i == 6 ){
                telefoneFormato = telefoneFormato+"-";
            }
        }
        
        return telefoneFormato;
        } 
        //PLACA DE CARRO
    public static String placaCarroFormatado (String carroPlaca ){
       
        carroPlaca = carroPlaca.substring(0, 3) + "-" + carroPlaca.substring(3,7);
        //retorna a placa somente em letra maiscula
        return carroPlaca.toUpperCase();
       
    }
    public static int letrasContador (String letras){
        return 0;
        
    }
}

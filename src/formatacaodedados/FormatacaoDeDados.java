
package formatacaodedados;


public class FormatacaoDeDados {


    public static void main(String[] args) {
        
        String Formatacpf = Mascaras.Formatacpf("45478912352");
        System.out.println("CPF: "+Formatacpf);
        
        String cnpjFormatado = Mascaras.cnpjFormatado("03795071000116");
        System.out.println("CNPJ: "+cnpjFormatado);
        
        String cepFormatado = Mascaras.cepFormatado("88352490,");
        System.out.println("CEP: "+cepFormatado);
        
        String telefoneFormatado = Mascaras.telefoneFormatado("47256251536");
        System.out.println("Telefone: "+telefoneFormatado);
        
        String placaCarroFormatado = Mascaras.placaCarroFormatado("abC7894");
        System.out.println("Placa do Carro: "+placaCarroFormatado);
        
        int letraContMaiusculo = Mascaras.letraContMaiusculo("Lógica de Programação: Linguagem JAVA");
        System.out.println("Quantidade de Letras Maiúsculas: "+letraContMaiusculo);
        
        int letraContMinusculo = Mascaras.letraContMinusculo("cinco + cinco ");
        System.out.println("Quantidade de Letras Minúsculas: "+letraContMinusculo);
        
    }
    
   
    
}

package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade <15 categoria infantil
        //idade >= 15 && <18 categoria juvenil
        //idade >=18 categoria adulta
        int idade = 8;
        String categoria;

        //variaveis locais precisam ser inicializadas, senão o código não irá funcionar no momento da compilação

        if(idade <15){
            categoria ="Categoria Infantil";
        } else if (idade >=15 && idade <18) {
            categoria ="Categoria juvenil";
        }else{
            categoria ="Categoria adulta";
        }
        System.out.println(categoria);
    }
}

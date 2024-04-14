public class App {
    public static void main(String[] args) throws Exception {


    String nomeCompleto = "Naruto Uzumaki";
    int idade = 25; //%d
    int anoDeNascimento = 1998; //%d
    float peso = 65.8f; //%f
    char primeiraLetraDoNome = 'N'; //%c
    boolean eleFoiDerrotado = false; //%b



    System.err.println("O ninja " + nomeCompleto);
    System.err.println("Tem " + idade + " anos de idade");
    System.err.println("Nasceu no ano de " + anoDeNascimento);
    System.err.println("Pesa cerca de " + peso + "Kg");
    System.err.println("A primeira letra do  seu nome é " + primeiraLetraDoNome);
    System.err.println("Ele ja foi derrotado? " + eleFoiDerrotado); 

    System.err.println("O ninja " + nomeCompleto + "," + " tem " + idade + " anos de idade" + " pesa cerca de " + peso + " kg" + " a primeira letra do seu nome é " + primeiraLetraDoNome + " ele já foi  derrotado? " + eleFoiDerrotado);

    System.out.format("O ninja %s tem a idade de %d anos pesa cerca de %f kg a primeira letra do seu nome é %c ele já foi  derrotado? %b ", nomeCompleto, idade, anoDeNascimento, peso, primeiraLetraDoNome, eleFoiDerrotado);
}
}
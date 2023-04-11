public class AnatomiaDeClasses3 {

    public static void main (String [] args) {

    String nome = "Rafael";
    String sobrenome = "Da Silva";
    int idade = 23;

    String nomeCompleto = nomeCompleto(nome, sobrenome, idade);
    System.out.println(nomeCompleto);

}

    public static String nomeCompleto (String nome, String sobrenome, int idade) { 

            return nome.concat(" ").concat(sobrenome).concat(", idade: ") + idade + " anos.";
    }
}

import java.util.Random;

public class ExemploDoWhile {

  public static void main(String[] args) {
    System.out.println("Discando...");
    do {
      // executando diversas vezes ate que atenda
      System.out.println("Telefone tocando...");

    } while (tocando());//o Do While ele precisa executar ao menos uma vez, mesmo que seja false.

    System.out.println("Alô!!!");

  }

  private static boolean tocando() {
    boolean atendeu = new Random().nextInt(3) == 1;
    System.out.println("Atendeu? " + atendeu);
    return !atendeu;
  }
}



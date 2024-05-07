public class ExemploForArray {

  public static void main(String[] args) {
    // Em arrays o índice inicia em ZERO
    String alunos[] = { "Edson", "Valeria", "Agnus", "Aline" };

    for (int x = 0; x < alunos.length; x++) {
      System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
    }

    System.out.println("lISTA DE ALUNOS CONCLUÍDA");

  }

}

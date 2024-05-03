public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 2500.0;// variavel saldo e valor 25
    double valorSolicitado = 1800.0;

    if (valorSolicitado <= saldo) {

      saldo = saldo - valorSolicitado;

      System.out.println("Retire suas Cédulas! ");
    } else {
      System.out.println("Saldo insuficiente");
    }

    System.out.println("Saldo Atual " + saldo);
  }

}

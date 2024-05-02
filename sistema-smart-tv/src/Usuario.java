public class Usuario {

  public static void main(String[] args) {

    SmartTv smartTv = new SmartTv();

    smartTv.mudarCanal(12);
    System.out.println("Canal: " + smartTv.canal);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    System.out.println("Volume atual  " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Novo Status -> Ligada? " + smartTv.ligada);

    smartTv.desligar();
    System.out.println("Novo Status -> Ligada? " + smartTv.ligada);
  }

}

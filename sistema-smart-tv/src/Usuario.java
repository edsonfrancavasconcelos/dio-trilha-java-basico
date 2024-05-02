public class Usuario {

  public static void main(String[] args) {

    SmartTv smartTv = new SmartTv();

    smartTv.mudarCanal(6);
    System.out.println("Canal: " + smartTv.canal);

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    System.out.println("Volume Atual  " + smartTv.volume);

    smartTv.ligar();
    System.out.println("Novo Status -> Ligada? " + smartTv.ligada);

    smartTv.desligar();
    System.out.println("Novo Status -> Ligada? " + smartTv.ligada);
  }

}

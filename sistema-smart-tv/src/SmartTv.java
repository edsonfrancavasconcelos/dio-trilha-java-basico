public class SmartTv {

  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void mudarCanal(int novoCanal) {//esta variavel novoCanal so esta disponivel neste bloco por ser um parametro
    canal = novoCanal;
  }

  public void aumentarCanal() {

    canal++;

  }

  public void diminiurCanal() {

    canal--;

  }

  public void aumentarVolume() {

    volume++;

  }

  public void diminuirVolume() {

    volume--;

  }

  public void ligar() {
    ligada = true;

  }

  public void desligar() {
    ligada = false;
  }

}

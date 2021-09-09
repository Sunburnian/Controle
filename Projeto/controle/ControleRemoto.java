package controle;

public class ControleRemoto implements InterfaceControle{
   private int volume;
   private boolean ligado,tocando;
   
   public ControleRemoto(){
       this.setVolume(50);
       this.setLigado(false);
       this.setTocando(false);
   }

    public int getVolume() {
        return volume;
        
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }
    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
    }

    @Override
    public void desligar() {
    }

    @Override
    public void abrirMenu() {
    }

    @Override
    public void fecharMenu() {
    }

    @Override
    public void maisVolume() {
    }

    @Override
    public void menosVolume() {
    }

    @Override
    public void LigarMudo() {
    }

    @Override
    public void DesligarMudo() {
    }

    @Override
    public void Play() {
    }

    @Override
    public void Pause() {
    }
    public void mostrar(){
        System.out.printf("Volume: %d",getVolume());
    }
}

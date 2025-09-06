package lista6;

public class Atividade9 {

    private int volume = 0;
    private int canal = 1;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void atualizaVolume(int volume) {
        if (getVolume() + volume > 100) {
            setVolume(100);
        } else if ((volume  + getVolume()) < 0) {
            setVolume(0);
        } else  {
            setVolume(volume + getVolume());
        }
    }

    public void atualizaCanal(int canal) {
        if (getCanal() + canal > 100) {
            setCanal((getCanal() + canal) - 100);
        }  else if ((canal  + getCanal()) < 1) {
            setCanal(1);
        } else   {
            setCanal(canal + getCanal());
        }

    }


}

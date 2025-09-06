package lista6;

public class Atividade5 {

    private int codigo;
    private int quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double total() {
        if (this.codigo == 100){
            return this.quantidade * 1.2;
        } else if (this.codigo == 101) {
            return this.quantidade * 1.3;
        }  else if (this.codigo == 102) {
            return this.quantidade * 1.5;
        } else if (this.codigo == 103) {
            return this.quantidade * 1.2;
        }  else if (this.codigo == 104) {
            return this.quantidade * 1.3;
        } else if (this.codigo == 105) {
            return this.quantidade;
        } else {
            return 0;
        }
    }

    /*
    public double total2(int codigo, int quantidade) {
        if (codigo == 100){
            return quantidade * 1.2;
        } else if (codigo == 101) {
            return quantidade * 1.3;
        }  else if (codigo == 102) {
            return quantidade * 1.5;
        } else if (codigo == 103) {
            return quantidade * 1.2;
        }  else if (codigo == 104) {
            return quantidade * 1.3;
        } else if (codigo == 105) {
            return quantidade;
        } else {
            return 0;
        }

    }
     */

}

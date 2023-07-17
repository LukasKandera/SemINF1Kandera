package sem.semestralka;

public class HraciaPlocha {
    private int xMax;
    private int yMax;
    private int pocetMine;

    public HraciaPlocha(int xMax, int yMax, int pocetMine) {
        this.xMax = xMax;
        this.yMax = yMax;
        this.pocetMine = pocetMine;
    }

    public int getxMax() {
        return xMax;
    }

    public void setxMax(int xMax) {
        this.xMax = xMax;
    }

    public int getyMax() {
        return yMax;
    }

    public void setyMax(int yMax) {
        this.yMax = yMax;
    }

    public int getPocetMine() {
        return pocetMine;
    }

    public void setPocetMine(int pocetMine) {
        this.pocetMine = pocetMine;
    }



}

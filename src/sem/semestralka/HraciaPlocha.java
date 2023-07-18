package sem.semestralka;

import java.util.Random;

public class HraciaPlocha {
    private int xMax;
    private int yMax;
    private int pocetMine;
    private Mina[] miny;
    private int[][] plocha;

    public HraciaPlocha(int pxMax, int pyMax, int pPocetMine) {
        this.xMax = pxMax;
        this.yMax = pyMax;
        this.pocetMine = pPocetMine;
        this.miny = new Mina[this.pocetMine];
        this.plocha = new int[this.xMax][this.yMax];
        this.vygenerujPlochu();
    }
    public void vygenerujPlochu() {
        for (int i = 0; i < this.xMax; i++) {
            for (int j = 0; j < this.yMax; j++) {
                this.plocha[i][j] = 0;
            }
        }
        for (int i = 0; i < this.pocetMine; i++) {
            Random rand = new Random();

            int x = rand.nextInt(this.xMax);
            int y = rand.nextInt(this.yMax);
            this.miny[i] = new Mina(i, x, y);
            //kontrola


            this.plocha[x][y] = 9;
        }

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

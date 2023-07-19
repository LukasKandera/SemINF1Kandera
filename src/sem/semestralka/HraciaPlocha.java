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
        this.nacitajMiny();
        this.nacitajCisla();
        this.textVypisPlochy();
    }

    public void textVypisPlochy() {
        for (int i = 0; i < this.xMax; i++) {
            for (int j = 0; j < this.yMax; j++) {
                System.out.print(this.plocha[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void nacitajCisla() {
        for (int i = 0; i < this.xMax; i++) {
            for (int j = 0; j < this.yMax; j++) {
                //kontrola okolia
                int pMinVOkoli = 0;
                if (this.plocha[i][j] != 9) {

                    for (int k = -1; k < 2; k++) {
                        for (int q = -1; q < 2; q++) {
                            if (((i + k) >= 0) && ((j + q) >= 0) && ((i + k) < xMax) && ((j + q) < yMax)) {
                                if (this.plocha[i + k][j + q] == 9) {
                                    pMinVOkoli++;
                                }
                            }
                        }
                    }
                    this.plocha[i][j] = pMinVOkoli;
                }
            }
        }
    }

    public void nacitajMiny() {
        for (int i = 0; i < this.pocetMine; i++) {
            //generovanie suradnic miny
            Random rand = new Random();
            int x = rand.nextInt(this.xMax);
            int y = rand.nextInt(this.yMax);
            this.miny[i] = new Mina(i, x, y);

            //kontrola kolizii
            while (this.kontrolaKolizii(i)) {
                x = rand.nextInt(this.xMax);
                y = rand.nextInt(this.yMax);
                this.miny[i].setPozX(x);
                this.miny[i].setPozY(y);
            }

            this.plocha[x][y] = 9;
        }
    }

    public boolean kontrolaKolizii(int i) {
        for (int j = i - 1; j >= 0; j--) {
            if ((this.miny[i].getPozX() == this.miny[j].getPozX()) && (this.miny[i].getPozY() == this.miny[j].getPozY())) {
                return true;
            }
        }
        return false;
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

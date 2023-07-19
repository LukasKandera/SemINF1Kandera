package sem.semestralka;

public class Mina {
    private int id;
    private int pozX;
    private int pozY;

    public Mina(int id, int pozX, int pozY) {
        this.id = id;
        this.pozX = pozX;
        this.pozY = pozY;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPozX() {
        return pozX;
    }

    public void setPozX(int pozX) {
        this.pozX = pozX;
    }

    public int getPozY() {
        return pozY;
    }

    public void setPozY(int pozY) {
        this.pozY = pozY;
    }
}

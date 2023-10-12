package lesson6Ex;

public class BaseBallTeam extends BaseBallGame {

    private String name;
    private int win;
    private int lose;
    private int draw;
    private double result;


    public BaseBallTeam() {

    }

    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
        this.result = result;
    }

    public double getRate(int win, int lose) {
        double result = (double)(win/(win + lose));
        return result;
    }

    public void report() {
        System.out.println(name + "の2019年の成績は" + win + "勝" + lose + "負" + draw + "分" + "勝率は" + result + "です");

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

}

package pro.sky.java.course2.lesson2;

public class Slizerin extends Hogwarts{
//Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
    private int hitrost;
    private int reshitelnost;
    private int ambicioznost;
    private int nahodchivost;
    private int jajdaVlasti;

    public Slizerin(String name, int magic, int transgressiya, int hitrost, int reshitelnost, int ambicioznost, int nahodchivost, int jajdaVlasti) {
        super(name,magic,transgressiya);
        this.hitrost= hitrost;
        this.ambicioznost = ambicioznost;
        this.reshitelnost=reshitelnost;
        this.nahodchivost=nahodchivost;
        this.jajdaVlasti=jajdaVlasti;
    }

    public int getHitrost() {
        return hitrost;
    }


    public int getReshitelnost() {
        return reshitelnost;
    }


    public int getAmbicioznost() {
        return ambicioznost;
    }


    public int getNahodchivost() {
        return nahodchivost;
    }


    public int getJajdaVlasti() {
        return jajdaVlasti;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", hitrost=" + hitrost +
                ", reshitelnost=" + reshitelnost +
                ", ambicioznost=" + ambicioznost +
                ", nahodchivost=" + nahodchivost +
                ", jajdaVlasti=" + jajdaVlasti;
    }

    public int sum() {
        return hitrost + reshitelnost + jajdaVlasti + nahodchivost + ambicioznost;
    }

    public void betterStudent(Slizerin other) {
        if (other.sum() > this.sum()) {
            System.out.println(other.getName() +" лучший Слизеринец, чем " + this.getName());
        } else if (other.sum() < this.sum()) {
            System.out.println(this.getName() + " лучший Слизеринец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " и "+ this.getName() + " равны.");
        }
    }
}

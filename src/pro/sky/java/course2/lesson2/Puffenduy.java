package pro.sky.java.course2.lesson2;

public class Puffenduy extends Hogwarts {
    //Студенты Пуффендуя трудолюбивы, верны, честны.

    private int trudolyubivy;
    private int vernost;
    private int chestnost;

    public Puffenduy(String name, int magik, int transgressiya, int trudolyubivy, int vernost, int chestnost) {
        super(name, magik, transgressiya);
        this.trudolyubivy = trudolyubivy;
        this.vernost = vernost;
        this.chestnost = chestnost;
    }

    public int getTrudolyubivy() {
        return trudolyubivy;
    }

    public int getVernost() {
        return vernost;
    }

    public int getChestnost() {
        return chestnost;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", trudolyubivy=" + trudolyubivy +
                ", vernost=" + vernost +
                ", chestnost=" + chestnost;
    }

    public int sum() {
        return trudolyubivy + vernost + chestnost;
    }

    public void betterStudent(Puffenduy other) {
        if (other.sum() > this.sum()) {
            System.out.println(other.getName() + " лучший Пуффендуец, чем " + this.getName());
        } else if (other.sum() < this.sum()) {
            System.out.println(this.getName() + " лучший Пуффендуец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " и " + this.getName() + " равны.");
        }

    }

}
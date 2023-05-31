package pro.sky.java.course2.lesson2;

public class Kogtevran extends Hogwarts{
//Когтевранцы умны, мудры, остроумны и полны творчества.
private int um;
private int mudrost;
private int ostroumnost;
private int tvorchestvo;

    public Kogtevran(String name, int magik, int transgressiya, int um, int mudrost, int ostroumnost, int tvorchestvo) {
        super(name, magik, transgressiya);
        this.um = um;
        this.mudrost = mudrost;
        this.ostroumnost = ostroumnost;
        this.tvorchestvo = tvorchestvo;
    }

    public int getUm() {
        return um;
    }



    public int getMudrost() {
        return mudrost;
    }


    public int getOstroumnost() {
        return ostroumnost;
    }


    public int getTvorchestvo() {
        return tvorchestvo;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", um=" + um +
                ", mudrost=" + mudrost +
                ", ostroumnost=" + ostroumnost +
                ", tvorchestvo=" + tvorchestvo;
    }

    public int sum() {
        return um + mudrost + ostroumnost + tvorchestvo;
    }

    public void betterStudent(Kogtevran other) {
        if (other.sum() > this.sum()) {
            System.out.println(other.getName() + " лучший Когтевранец, чем " + this.getName());
        } else if (other.sum() < this.sum()) {
            System.out.println(this.getName() + " лучший Когцевранец, чем " + other.getName());
        } else {
            System.out.println(other.getName() + " и " + this.getName() + " равны.");
        }

    }

}

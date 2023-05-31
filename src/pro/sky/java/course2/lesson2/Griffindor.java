package pro.sky.java.course2.lesson2;

public class Griffindor extends Hogwarts{
    private int blagorodstvo;
    private int chest;
    private int hrabrost;

    public Griffindor(String name, int magic, int transgressiya, int blagorodstvo, int hrabrost, int chest) {
        super(name, magic, transgressiya);
        this.blagorodstvo=blagorodstvo;
        this.chest=chest;
        this.hrabrost=hrabrost;
    }

    public int getBlagorodstvo() {
        return blagorodstvo;
    }

    public void setBlagorodstvo(int blagorodstvo) {
        this.blagorodstvo = blagorodstvo;
    }

    public int getChest() {
        return chest;
    }

    public void setChest(int chest) {
        this.chest = chest;
    }

    public int getHrabrost() {
        return hrabrost;
    }

    public void setHrabrost(int hrabrost) {
        this.hrabrost = hrabrost;
    }


    @Override
    public String toString() {
        return super.toString() +
                 ", blagorodstvo=" + blagorodstvo +
                ", chest=" + chest +
                ", hrabrost=" + hrabrost +
                '}';
    }

    public int sum() {
        return blagorodstvo + chest + hrabrost;
    }

    public void betterStudent(Griffindor other) {
        if (other.sum() > this.sum()) {
            System.out.println(other.getName() +" лучший Гриффиндорец, чем " + this.getName());
        } else if (other.sum() < this.sum()) {
            System.out.println(this.getName() +" лучший Гриффиндорец, чем " + other.getName());
        }else {
            System.out.println(other.getName() + " и "+ this.getName() + " равны.");
        }

    }



}

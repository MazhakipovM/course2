package pro.sky.java.course2.lesson2;

public class MainOOP {
    public static void main(String[] args) {



        Griffindor harry =  new Griffindor(" Гарри Потер", 75, 56, 90, 70, 80);
        Griffindor germiona = new Griffindor("Гермиона Грейнджер", 90, 60, 80, 80, 90);
        Griffindor ron = new Griffindor("Рон Уизли", 50, 40, 70, 30, 79);

        Slizerin drako = new Slizerin("Драко Малфой", 43, 50, 88, 42, 79, 60, 90);
        Slizerin graham = new Slizerin("Грэхэм Монтегю", 55, 43, 59, 42, 60, 65, 20);
        Slizerin gregori = new Slizerin("Грегори Гойл", 30, 49, 32, 46, 21, 67, 40);

        Puffenduy zahariya = new Puffenduy("Захария Смит", 61, 42, 68, 70, 78);
        Puffenduy sadrik = new Puffenduy("Седрик Диггори", 41, 33, 59, 58, 8);
        Puffenduy jastin =  new Puffenduy("Джастин Финч-Флетчли", 32, 19, 37, 68, 79);

        Kogtevran chjou  = new Kogtevran("Чжоу Чанг", 49, 58, 78, 51, 77, 80);
        Kogtevran padma = new Kogtevran("Падма Патил", 43, 74, 34, 77, 73, 31);
        Kogtevran markus = new Kogtevran("Маркус Белби", 72, 20, 38, 57, 49, 32);


        harry.betterStudent(ron);
        chjou.betterStudent(markus);
        zahariya.betterStudent(jastin);
        drako.betterStudent(gregori);

        System.out.println(harry.toString());
        System.out.println(drako.toString());


    }
}

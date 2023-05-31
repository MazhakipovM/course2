package pro.sky.java.course2.lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void changeValue(Integer[] value) {
        //value= new Integer[]{1,2,3};
        value[0] = 99;
       // value[1] = 2;
        System.out.println(Arrays.toString(value)+"iz metoda");

    }

//    public static void changePerson(Person person) {
//        person.setName("Ilya");
//        person.setSurname("Lagutenko");
//    }



    public static void main(String[] args) {

        Integer[] value = {3,4};
        System.out.println(Arrays.toString(value));
        changeValue(value);
        System.out.println(Arrays.toString(value));
        System.out.println(Arrays.toString(value));


       // System.out.println(Arrays.toString(changeValue(value)));


//        int value = 33;
//        changeValue(value);
//        System.out.println(value);
//        System.out.println(changeValue(value));





//Person person = new Person("Lyapis", "Trubeckoi");
//        System.out.println(person);
//        changePerson(person);
//        System.out.println(person);
//




    }
}
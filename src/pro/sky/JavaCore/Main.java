package JavaCore;

import java.lang.reflect.Array;

/* задание 9 и 10
 */

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person person = new Person("Lyapis", "Trubetskoy");
        personService.changePerson(person);
        System.out.println(person);
    }
}

/*

        Задание 5
            public static void changeValue(int value) {
        value = 22;
    }

    public static void main(String[] args) {
        int value = 33;
        changeValue(value);
        System.out.println("value = " + value);
    }
}

        Задание 6
    public static void changeValue(Integer value) {
        value = 22;
        }

public static void main(String[] args) {
        Integer value = 33;
        changeValue(value);
        System.out.println(value);
        }


        Задание 7
public static void changeValue(Integer [] value) {
        value = new Integer[]{1,2};
        }

public static void main(String[] args) {
        Integer[] value = new Integer[]{3, 4};
        changeValue(value);
        System.out.println("Arrays.toString(value) = " + Arrays.toString(value));
        }


        Задание 8
        value[0] = 99;
        }

public static void main(String[] args) {

        Integer value[] = new Integer[]{3, 4};
        changeValue(value);
        System.out.println("Arrays.toString(value) = " + Arrays.toString(value));
        }


    }
}
*/

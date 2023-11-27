/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Alexander
 */
public class GeneratePerson {
    Random random = new Random();
    
    ArrayList<String> maleNames = new ArrayList<String>(Arrays.asList(
            "James","Oliver","Benjamin","Ethan","Lucas","Mason","Alexander","Henry","Michael","Daniel",
            "Matthew","Aiden","Jackson","Logan","David","Joseph","Samuel","Tyler","Dylan","Nathan"
    ));

    ArrayList<String> femaleNames = new ArrayList<String>(Arrays.asList(
            "Sophia","Isabella","Emma","Olivia","Ava","Mia","Emily","Abigail","Madison","Charlotte",
            "Harper","Sofia","Avery","Elizabeth","Amelia","Evelyn","Ella","Chloe","Victoria","Grace"
    ));

    public Person generatePerson() {
        //1-4 = Man
        //5-8 = Woman
        //9 = OldMan
        //10 = OldWoman
        //11 = Pregnant
        //12 = PWD
        
        int randomNum = random.nextInt(12) + 1;
        
        if (randomNum >= 1 && randomNum <= 4) {
            return new Person(Person.MAN, generateName(Person.MAN));
        } else if (randomNum >= 5 && randomNum <= 8) {
            return new Person(Person.WOMAN, generateName(Person.WOMAN));
        } else if (randomNum == 9) {
            return new Person(Person.OLDMAN, generateName(Person.OLDMAN));
        } else if (randomNum == 10) {
            return new Person(Person.OLDWOMAN, generateName(Person.OLDWOMAN));
        } else if (randomNum == 11){
            return new Person(Person.PREGNANT, generateName(Person.PREGNANT));
        } else {
            return new Person(Person.PWD, generateName(Person.PWD));
        }
    }

    private String generateName(int num) {
        //1 = Man
        //2 Woman
        //3 = Woman
        //4 = Man
        //5 = Woman
        //6 = Man

        if (num == 1 || num == 4 || num == 6) {
            return maleNames.get(random.nextInt(0, maleNames.size()));
        }
        return femaleNames.get(random.nextInt(0, femaleNames.size()));
    }
}

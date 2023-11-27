/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sources;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Alexander
 */
public class QueueSystem {
    private final Queue<Person> q1;
    private final Queue<Person> q2;
    private final Queue<Person> qP;
    private final HashMap<Integer, Integer> servedPeople;

    public QueueSystem() {
        q1 = new LinkedList();
        q2 = new LinkedList();
        qP = new LinkedList();
        servedPeople = new HashMap<>();
        servedPeople.put(Person.MAN, 0);
        servedPeople.put(Person.WOMAN, 0);
        servedPeople.put(Person.PREGNANT, 0);
        servedPeople.put(Person.OLDMAN, 0);
        servedPeople.put(Person.OLDWOMAN, 0);
        servedPeople.put(Person.PREGNANT, 0);
        servedPeople.put(Person.PWD, 0);
    }

    public void addToServedCounter(Integer personType) {
        servedPeople.put(personType, servedPeople.get(personType) + 1);
    }

    public HashMap<Integer, Integer> getServedPeople() {
        return servedPeople;
    }

    public void addQ1(Person person) {
        q1.add(person);
    }

    public void addQ2(Person person) {
        q2.add(person);
    }

    public void addQP(Person person) {
        qP.add(person);
    }

    public Person removeQ1() {
        return q1.remove();
    }

    public Person removeQ2() {
        return q2.remove();
    }

    public Person removeQP() {
        return qP.remove();
    }

    public Queue<Person> getQ1() {
        return q1;
    }

    public Queue<Person> getQ2() {
        return q2;
    }

    public Queue<Person> getQP() {
        return qP;
    }
}

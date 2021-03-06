package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */

    public ArrayList<Person> find(String key) {
        var searchName = (Predicate<Person>) p -> p.getName().contains(key);
        var searchSurName = (Predicate<Person>) p -> p.getSurname().contains(key);
        var searchPhone = (Predicate<Person>) p -> p.getPhone().contains(key);
        var searchAddress = (Predicate<Person>) p -> p.getAddress().contains(key);
        var combine = searchName.or(searchSurName)
                .or(searchPhone).or(searchAddress);
        var result = new ArrayList<Person>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

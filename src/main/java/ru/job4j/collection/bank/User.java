package ru.job4j.collection.bank;

import java.util.Objects;

/**
 * Класс описывает клиента банка
 *
 * @author Sergey Dorokhov
 * @version 1.0
 */
public class User {
    /**
     * Паспортные данные
     */
    private String passport;
    /**
     * ФИО клиента
     */
    private String username;

    /**
     * Конструктор
     *
     * @param passport - паспортные данные
     * @param username - фио клиента
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод для получения паспортных данных клиента
     *
     * @return паспортные данные
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод для изменения паспортных данных клиента
     *
     * @param passport - паспортные данные
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод для получения фио клиента
     *
     * @return фио
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод для изменения фио клиента
     *
     * @param username - фио клиента
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Метод определяет правила сравнения двух клиентов банка
     *
     * @param o - другой клиент
     * @return - результат сравнения двух клиентов на предмет эквивалентности
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Метод для получения hashCode клиента
     *
     * @return hashCode клиента
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}

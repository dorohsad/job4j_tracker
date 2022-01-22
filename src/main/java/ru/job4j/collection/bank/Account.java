package ru.job4j.collection.bank;

import java.util.Objects;

/**
 * Класс описывает счет клиента в банке
 *
 * @author Sergey Dorokhov
 * @version 1.0
 */
public class Account {
    /**
     * Реквизиты счета
     */
    private String requisite;
    /**
     * Баланс счета
     */
    private double balance;

    /**
     * Конструктор
     *
     * @param requisite - реквизиты счета
     * @param balance   - баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает реквизиты банковского счета
     *
     * @return реквизиты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод устанавливает реквизиты банковского счета
     *
     * @param requisite - реквизиты счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает баланс банковского счета
     *
     * @return баланс счета
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод устанавливает баланс банковского счета
     *
     * @param balance - реквизиты счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Метод определяет правила сравнения двух банковских счетов на эквивалентность
     *
     * @param o - другой банковский счет
     * @return - результат сравнения двух банковских счетов на предмет эквивалентности
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод для получения hashCode банковского счета
     * @return hashCode счета
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}

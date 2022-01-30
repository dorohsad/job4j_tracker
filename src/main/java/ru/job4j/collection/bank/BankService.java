package ru.job4j.collection.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс для проведения базовых банковских операций
 *
 * @author Sergey Dorokhov
 * @version 1.0
 */
public class BankService {
    /**
     * HashMap для хранения клиентов банка и списка счетов каждого клиента
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод позволяет добавить клиента банка
     *
     * @param user - клиент банка
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод позволяет добавить новый счет клиенту банка
     *
     * @param passport - паспортные данные клиента банка
     * @param account  - банковский счета
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null && !users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Метод позволяет найти клиента банка по паспортным данным
     *
     * @param passport - паспортные данные клиента банка
     * @return User - клиента банка
     */
    public User findByPassport(String passport) {
        return users.keySet().stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод позволяет найти банковский счет по паспортным данным клиента и реквизитам счета
     *
     * @param passport  - паспортные данные клиента банка
     * @param requisite - реквизиты счета
     * @return Account - счет в банке
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user).stream()
                    .filter(a -> requisite.equals(a.getRequisite()))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод позволяет осуществить перевод средств с одного счета на другой
     *
     * @param srcPassport   - паспортные данные отправителя
     * @param srcRequisite  - реквизиты счета отправителя
     * @param destPassport  - паспортные данные получателя
     * @param destRequisite - реквизиты счета получателя
     * @param amount        - сумма перевода
     * @return true - перевод проведен, false - перевод не проведен
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null
                && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}

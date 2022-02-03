package ru.job4j.collection.bank;

import java.util.*;

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
        Optional<User> user = findByPassport(passport);
        if (user.isPresent() && !users.get(user.get()).contains(account)) {
            users.get(user.get()).add(account);
        }
    }

    /**
     * Метод позволяет найти клиента банка по паспортным данным
     *
     * @param passport - паспортные данные клиента банка
     * @return User - клиента банка
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(u -> u.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод позволяет найти банковский счет по паспортным данным клиента и реквизитам счета
     *
     * @param passport  - паспортные данные клиента банка
     * @param requisite - реквизиты счета
     * @return Account - счет в банке
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.isEmpty() ? Optional.empty() : users.get(user.get()).stream()
                .filter(a -> requisite.equals(a.getRequisite()))
                .findFirst();
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
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount.isPresent() && destAccount.isPresent()
                && srcAccount.get().getBalance() >= amount) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}

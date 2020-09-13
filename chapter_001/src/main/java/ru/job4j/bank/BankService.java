package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
           if (!users.containsKey(user)) {
            users.putIfAbsent(user, accounts);
       }
    }

    public void addAccount(String passport, Account account) {
        User userOne = findByPassport(passport);
        if (userOne != null) {
            List<Account> accounts = users.get(userOne);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        return users.keySet().stream().filter(user -> user.getPassport().equals(passport)).
               findAny().orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        Account iRequisite = null;
        User iUser = findByPassport(passport);
        if (iUser != null) {
            iRequisite = users.get(iUser).stream().filter(account -> account.getRequisite().equals(requisite)).
                    findAny().get();
        }
        return iRequisite;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account scrRequisiteOne = findByRequisite(srcPassport, srcRequisite);
        Account descRequisiteTwo = findByRequisite(destPassport, destRequisite);
        if (scrRequisiteOne != null && descRequisiteTwo != null && amount >= scrRequisiteOne.getBalance()) {
            double desc = descRequisiteTwo.getBalance();
            descRequisiteTwo.setBalance(desc + amount);
            rsl = true;
        }
        return rsl;
    }
}

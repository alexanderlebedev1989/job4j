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
        User userNew = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                userNew = user;
                break;
            }
        }
        return userNew;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account iRequisite = null;
        User iUser = findByPassport(passport);
        if (iUser != null) {
            List<Account> accounts = users.get(iUser);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    iRequisite = account;
                    break;
                }
            }
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

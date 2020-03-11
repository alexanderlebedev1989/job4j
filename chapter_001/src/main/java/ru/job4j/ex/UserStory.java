package ru.job4j.ex;

public class UserStory {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User value : users) {
            if (value.getUsername().equals(login)) {
                user = value;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("user is not in the list");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean found = false;
        String el = user.getUsername();
        if (!user.isValid() || el.length() < 3) {
            throw new UserInvalidException("object is not valid");
        } else {
            found = true;
        }
        return found;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            findUser(users, "Petr Arsentev");
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
        try {
            if (validate(new User("Petr Arsentev", true))) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        }
    }
}

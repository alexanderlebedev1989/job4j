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
        }
        found = true;
        return found;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (user != null) {
                validate(user);
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException en) {
            en.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}

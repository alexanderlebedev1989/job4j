package ru.job4j.tracker;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class StartUI {
    public void init(Input input, Store tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
            System.out.println();
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Input validate = new ValidateInput(new ConsoleInput());
        try (Store tracker = new SqlTracker(ConnectionRollback.create(SqlTracker.init()))) {
            UserAction[] actions = {new CreateAction(), new ShowItemAction(), new EditAction(),
                    new DeleteAction(), new FindIdAction(), new FindNameAction(), new ExitAction()};
            new StartUI().init(validate, tracker, Arrays.asList(actions));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

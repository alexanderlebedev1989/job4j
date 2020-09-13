package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        Integer id = Integer.parseInt(input.askStr("Enter id: "));
        if (tracker.delete(id)) {
            System.out.println("Операция выполнена успешно");
        } else {
            System.out.println("Возникла ошибка. Попробуйте снова.");
        }
        return true;
    }
}

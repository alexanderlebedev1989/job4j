package ru.job4j.tracker;

public class EditAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit Item ===";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        String name = input.askStr("Enter name: ");
        Item newItem = new Item(name);
        Integer id = Integer.parseInt(input.askStr("Enter id: "));
        if (tracker.replace(id, newItem)) {
            System.out.println("Операция выполнена успешно");
        } else {
            System.out.println("Возникла ошибка. Попробуйте снова.");
        }
        return true;
    }
}

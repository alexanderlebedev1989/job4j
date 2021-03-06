package ru.job4j.tracker;

public class FindIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by Id ===";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(Integer.valueOf(id));
        if (item != null) {
            System.out.println(item.getName() + ", " + item.getId());
        } else {
            System.out.println("Заявка не найдена");
        }
        return true;
    }
}

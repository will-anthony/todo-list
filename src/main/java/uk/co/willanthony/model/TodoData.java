package uk.co.willanthony.model;

import lombok.NonNull;

import java.time.LocalDate;
import java.util.*;

// class used to simulate an in memory database
public class TodoData {

    // == fields ==
    private static int idValue = 1;
    private final List<TodoItem> items = new ArrayList<>();

    // == constructor ==
    public TodoData() {

        addItem(new TodoItem("first", "first details", LocalDate.now()));
        addItem(new TodoItem("second", "second details", LocalDate.now()));
        addItem(new TodoItem("third", "third details", LocalDate.now()));
        addItem(new TodoItem("forth", "forth details", LocalDate.now()));

    }

    // == public methods ==
    public List<TodoItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void addItem(@NonNull TodoItem toAdd) {

        toAdd.setId(idValue);
        items.add(toAdd);
        idValue++;
    }

    public void removeItem(int id) {
        ListIterator<TodoItem> itemListIterator = items.listIterator();

        while(itemListIterator.hasNext()) {
            TodoItem item = itemListIterator.next();

            if(item.getId() == id) {
                itemListIterator.remove();
                break;
            }
        }
    }

    public TodoItem getItem(int id) {
        for (TodoItem item : items) {
            if(item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void updateItem(@NonNull TodoItem toUpdate) {
        ListIterator<TodoItem> itemIterator = items.listIterator();

        while(itemIterator.hasNext()) {
            TodoItem item = itemIterator.next();

            if(item.equals(toUpdate)) {
                itemIterator.set(toUpdate);
                break;
            }
        }

    }
}

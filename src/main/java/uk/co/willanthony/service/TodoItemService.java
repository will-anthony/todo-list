package uk.co.willanthony.service;

import uk.co.willanthony.model.TodoData;
import uk.co.willanthony.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem item);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem item);
    TodoData getData();
}

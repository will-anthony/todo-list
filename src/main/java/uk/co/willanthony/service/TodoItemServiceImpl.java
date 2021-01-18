package uk.co.willanthony.service;

import lombok.Getter;
import org.springframework.stereotype.Service;
import uk.co.willanthony.model.TodoData;
import uk.co.willanthony.model.TodoItem;

@Service
public class TodoItemServiceImpl implements TodoItemService {
    @Getter
    private final TodoData data = new TodoData();

    @Override
    public void addItem(TodoItem item) {
        data.addItem(item);
    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);
    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }

    @Override
    public void updateItem(TodoItem item) {
        data.updateItem(item);
    }
}

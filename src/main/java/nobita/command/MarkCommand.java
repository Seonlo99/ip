package nobita.command;

import nobita.storage.Storage;
import nobita.task.Task;
import nobita.task.TaskList;
import nobita.ui.Ui;

public class MarkCommand extends Command{
    private final int index;
    public MarkCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        Task task = tasks.markComplete(index);
        ui.showMessage("Nice! I've marked this task as done:\n" + task);
    };

    @Override
    public boolean isExit() {
        return false;
    };
}

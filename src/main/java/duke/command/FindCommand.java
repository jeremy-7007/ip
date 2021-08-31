package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class FindCommand extends Command {
    private String searchWord;

    public FindCommand(String searchWord) {
        this.searchWord = searchWord;
    }

    @Override
    public void execute(TaskList taskList, Storage storage, Ui ui) {
        String foundTasks = taskList.searchTask(searchWord);
        ui.showFindMessage(foundTasks);
    }

    @Override
    public boolean isExit() {
        return false;
    }
}
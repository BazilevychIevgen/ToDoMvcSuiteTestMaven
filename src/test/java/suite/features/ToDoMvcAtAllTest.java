package suite.features;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import suite.categories.Buggy;
import suite.categories.Smoke;

import static suite.pages.ToDoMvcTest.*;

/**
 * Created by barocko on 8/14/2016.
 */
public class ToDoMvcAtAllTest {

    @Test
    @Category(Smoke.class)
    public void testEdit() {
        givenAtAll(TaskType.ACTIVE, "1", "2");

        edit("1", "1 edited");

        assertTasksAre("1 edited", "2");
        assertItemsLeft(2);
    }

    @Test
    @Category(Smoke.class)
    public void testDelete() {
        givenAtAll(TaskType.COMPLETED, "1");

        delete("1");

        assertNoTasks();
    }

    @Test
    @Category(Smoke.class)
    public void testCompleteAll() {
        givenAtAll(TaskType.ACTIVE, "1", "2");

        toggleAll();

        assertTasksAre("1", "2");
        assertItemsLeft(0);
    }

    @Test
    @Category(Smoke.class)
    public void testClearCompleted() {
        given(aTask(TaskType.COMPLETED, "1"), aTask(TaskType.ACTIVE, "2"));

        clearCompleted();

        assertTasksAre("2");
        assertItemsLeft(1);
    }

    @Test
    @Category(Smoke.class)
    public void testSwitchFilterToCompleted() {
        given(aTask(TaskType.COMPLETED, "1"), aTask(TaskType.ACTIVE, "2"));

        filterCompleted();

        assertVisibleTasksAre("1");
        assertItemsLeft(1);
    }

    @Test
    @Category(Smoke.class)
    public void testCancelEdit() {
        givenAtAll(TaskType.ACTIVE, "1");

        cancelEdit("1", "1 editing");

        assertTasksAre("1");
        assertItemsLeft(1);
    }

    @Test
    @Category(Smoke.class)
    public void testReopen() {
        givenAtAll(TaskType.COMPLETED, "1");

        toggle("1");

        assertTasksAre("1");
        assertItemsLeft(1);
    }

    @Test
    @Category(Buggy.class)
    public void testConfirmEditByPressTab() {
        givenAtAll(TaskType.COMPLETED, "1");

        confirmEditByPressTab("1", "1 edited");

        assertTasksAre("1");
        assertItemsLeft(0);
    }

}

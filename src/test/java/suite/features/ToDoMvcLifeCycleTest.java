package suite.features;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import suite.BaseTest;
import suite.categories.Smoke;


import javax.security.auth.login.Configuration;

import static suite.pages.ToDoMvcTest.*;

/**
 * Created by barocko on 8/14/2016.
 */
public class ToDoMvcLifeCycleTest extends BaseTest {

    @Test
    @Category(Smoke.class)
    public void testTaskLifeCycle() {
        given();

        add("1");
        toggle("1");
        assertTasksAre("1");

        filterActive();
        assertNoVisibleTasks();
        add("2");
        assertVisibleTasksAre("2");
        toggleAll();
        assertNoVisibleTasks();

        filterCompleted();
        assertVisibleTasksAre("1", "2");
        //reopen
        toggle("2");
        assertVisibleTasksAre("1");
        clearCompleted();
        assertNoVisibleTasks();

        filterAll();
        assertTasksAre("2");
        assertItemsLeft(1);
    }
}

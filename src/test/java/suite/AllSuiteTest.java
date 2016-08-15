package suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import suite.features.ToDoMvcAtAllTest;
import suite.features.ToDoMvcLifeCycleTest;

/**
 * Created by barocko on 8/15/2016.
 */
@RunWith(Categories.class)
@Suite.SuiteClasses({ToDoMvcAtAllTest.class, ToDoMvcLifeCycleTest.class})
public class AllSuiteTest {
}

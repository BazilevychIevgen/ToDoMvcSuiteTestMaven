package suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import suite.categories.Smoke;
import suite.features.ToDoMvcLifeCycleTest;

/**
 * Created by barocko on 8/14/2016.
 */

@RunWith(Categories.class)
@Suite.SuiteClasses(ToDoMvcLifeCycleTest.class)
@Categories.IncludeCategory(Smoke.class)
public class SmokeSuiteTest {
}

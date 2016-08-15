package suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import suite.categories.Buggy;
import suite.features.ToDoMvcAtAllTest;

/**
 * Created by barocko on 8/14/2016.
 */
@RunWith(Categories.class)
@Suite.SuiteClasses(ToDoMvcAtAllTest.class)
@Categories.IncludeCategory(Buggy.class)
public class BuggySuiteTest {
}
